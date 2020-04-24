/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

using System;
using System.Threading;
using NUnit.Framework;

namespace Apache.NMS.ZMQ
{
	[TestFixture]
	public class ProducerConsumers : BaseTest
	{
		private int totalMsgCountToReceive = 0;

		private class ConsumerTracker : IMessageConsumer
		{
			private IMessageConsumer consumer;
			public int msgCount = 0;

			public ConsumerTracker(ISession session, IDestination testDestination)
			{
				this.consumer = session.CreateConsumer(testDestination);
				Assert.IsNotNull(this.consumer, "Error creating consumer on {0}", testDestination.ToString());
			}

			public void Close()
			{
				this.consumer.Close();
			}

			public ConsumerTransformerDelegate ConsumerTransformer
			{
				get { return this.consumer.ConsumerTransformer; }
				set { this.consumer.ConsumerTransformer = value; }
			}

			public event MessageListener Listener
			{
				add { this.consumer.Listener += value; }
				remove { this.consumer.Listener -= value; }
			}

			public IMessage Receive(TimeSpan timeout)
			{
				return this.consumer.Receive(timeout);
			}

			public IMessage Receive()
			{
				return this.consumer.Receive();
			}

			public IMessage ReceiveNoWait()
			{
				return this.consumer.ReceiveNoWait();
			}

			public void Dispose()
			{
				this.consumer.Dispose();
			}
		}

		[Test]
		public void TestMultipleProducersConsumer(
			[Values("queue://ZMQTestQueue", "topic://ZMQTestTopic", "temp-queue://ZMQTempQueue", "temp-topic://ZMQTempTopic")]
			string destination,
			[Values(1, 3)]
			int numProducers,
			[Values(1, 3)]
			int numConsumers)
		{
			IConnectionFactory factory = NMSConnectionFactory.CreateConnectionFactory(new Uri("zmq:tcp://localhost:5556"));
			Assert.IsNotNull(factory, "Error creating connection factory.");

			using(IConnection connection = factory.CreateConnection())
			{
				Assert.IsNotNull(connection, "Problem creating connection class. Usually problem with libzmq and clrzmq ");
				using(ISession session = connection.CreateSession())
				{
					Assert.IsNotNull(session, "Error creating Session.");
					using(IDestination testDestination = session.GetDestination(destination))
					{
						Assert.IsNotNull(testDestination, "Error creating test destination: {0}", destination);

						// Track the number of messages we should receive
						this.totalMsgCountToReceive = numProducers * numConsumers;

						ConsumerTracker[] consumerTrackers = null;
						IMessageProducer[] producers = null;

						try
						{
							// Create the consumers
							consumerTrackers = new ConsumerTracker[numConsumers];
							for(int index = 0; index < numConsumers; index++)
							{
								ConsumerTracker tracker = new ConsumerTracker(session, testDestination);
								tracker.Listener += (message) =>
									{
										Assert.IsInstanceOf<TextMessage>(message, "Wrong message type received.");
										ITextMessage textMsg = (ITextMessage) message;
										Assert.AreEqual(textMsg.Text, "Zero Message.");
										tracker.msgCount++;
									};
								consumerTrackers[index] = tracker;
							}

							// Create the producers
							producers = new IMessageProducer[numProducers];
							for(int index = 0; index < numProducers; index++)
							{
								producers[index] = session.CreateProducer(testDestination);
								Assert.IsNotNull(producers[index], "Error creating producer #{0} on {1}", index, destination);
							}

							// Send the messages
							for(int index = 0; index < numProducers; index++)
							{
								ITextMessage testMsg = session.CreateTextMessage("Zero Message.");
								Assert.IsNotNull(testMsg, "Error creating test message for producer #{0}.", index);
								producers[index].Send(testMsg);
							}

							// Wait for the message
							DateTime startWaitTime = DateTime.Now;
							TimeSpan maxWaitTime = TimeSpan.FromSeconds(5);

							while(GetNumMsgsReceived(consumerTrackers) < this.totalMsgCountToReceive)
							{
								if((DateTime.Now - startWaitTime) > maxWaitTime)
								{
									Assert.Fail("Timeout waiting for message receive.");
								}

								Thread.Sleep(5);
							}

							// Sleep for an extra 2 seconds to see if any extra messages get delivered
							Thread.Sleep(2 * 1000);
							Assert.AreEqual(this.totalMsgCountToReceive, GetNumMsgsReceived(consumerTrackers), "Received too many messages.");
						}
						finally
						{

							// Clean up the producers
							if(null != producers)
							{
								foreach(IMessageProducer producer in producers)
								{
									producer.Dispose();
								}
							}

							// Clean up the consumers
							if(null != consumerTrackers)
							{
								foreach(ConsumerTracker tracker in consumerTrackers)
								{
									tracker.Dispose();
								}
							}
						}
					}
				}
			}
		}

		[Test]
		private void SingleProducerMultipleDestinations()
		{
			string[] destinations = new string[]
					{
						"queue://ZMQTestQueue1",
						"queue://ZMQTestQueue2",
						"topic://ZMQTestTopic1",
						"topic://ZMQTestTopic2",
						"temp-queue://ZMQTempQueue1",
						"temp-queue://ZMQTempQueue1",
						"temp-topic://ZMQTempTopic1",
						"temp-topic://ZMQTempTopic2"
					};

			// TODO: Create one producer, and then use it to send to multiple destinations.
			Assert.Fail("Not implemented.");
		}

		private int GetNumMsgsReceived(ConsumerTracker[] consumerTrackers)
		{
			int numMsgs = 0;

			foreach(ConsumerTracker tracker in consumerTrackers)
			{
				numMsgs += tracker.msgCount;
			}

			return numMsgs;
		}
	}
}



