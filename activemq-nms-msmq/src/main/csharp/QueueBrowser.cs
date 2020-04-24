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
using System.Collections;
using System.Messaging;
using Apache.NMS;
using Apache.NMS.Util;
using Apache.NMS.MSMQ.Readers;

namespace Apache.NMS.MSMQ
{
	public class QueueBrowser : Apache.NMS.IQueueBrowser
	{
		private bool disposed = false;

        private readonly Session session;
        private MessageQueue messageQueue;

        private string selector;

        private IMessageReader reader;
        
		public QueueBrowser(Session session, MessageQueue messageQueue)
            : this(session, messageQueue, null)
		{
		}

		public QueueBrowser(Session session, MessageQueue messageQueue,
            string selector)
		{
            this.session = session;
            this.messageQueue = messageQueue;
            if(null != this.messageQueue)
            {
                this.messageQueue.MessageReadPropertyFilter.SetAll();
            }
            this.selector = selector;

            reader = MessageReaderUtil.CreateMessageReader(
                messageQueue, session.MessageConverter, selector);
		}

		~QueueBrowser()
		{
			Dispose(false);
		}

		#region IDisposable Members

		///<summary>
		/// Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources.
		///</summary>
		public void Dispose()
		{
			Dispose(true);
			GC.SuppressFinalize(this);
		}

		protected void Dispose(bool disposing)
		{
			if(disposed)
			{
				return;
			}

			if(disposing)
			{
				// Dispose managed code here.
			}

			try
			{
				Close();
			}
			catch
			{
				// Ignore errors.
			}

			disposed = true;
		}

		#endregion

		public void  Close()
		{
            if(messageQueue != null)
            {
                messageQueue.Dispose();
                messageQueue = null;
            }
		}

		public string MessageSelector
		{
			get { return selector; }
		}

		public IQueue Queue
		{
			get { return new Queue(this.messageQueue.Path); }
		}

		internal class Enumerator : IEnumerator, IDisposable
		{
			private Session session;
			private MessageEnumerator innerEnumerator;
            private IMessageReader reader;

			public Enumerator(Session session, MessageQueue messageQueue,
                IMessageReader reader)
			{
				this.session = session;
				this.innerEnumerator = messageQueue.GetMessageEnumerator2();
                this.reader = reader;
			}

			public object Current
			{
				get
				{
					return this.session.MessageConverter.ToNmsMessage(this.innerEnumerator.Current);
				}
			}

			public bool MoveNext()
			{
                while(this.innerEnumerator.MoveNext())
                {
				    if(reader.Matches(this.innerEnumerator.Current))
                    {
                        return true;
                    }
                }
                return false;
			}

			public void Reset()
			{
				this.innerEnumerator.Reset();
			}

            public void Dispose()
            {
                if(innerEnumerator != null)
                {
                    innerEnumerator.Close();
                    innerEnumerator = null;
                }
            }
		}

		public IEnumerator GetEnumerator()
		{
			return new Enumerator(this.session, this.messageQueue, this.reader);
		}
	}
}
