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

namespace Apache.NMS.ZMQ
{
	/// <summary>
	/// Summary description for TemporaryTopic.
	/// </summary>
	public class TemporaryTopic : Destination, ITemporaryTopic
	{
		public TemporaryTopic(Session session)
			: base(session, "TEMPTOPIC." + Guid.NewGuid().ToString())
		{
		}

		override public DestinationType DestinationType
		{
			get { return DestinationType.TemporaryTopic; }
		}

		#region ITopic Members

		public string TopicName
		{
			get { return Name; }
		}

		#endregion

		#region ITemporaryTopic Members

		public void Delete()
		{
			// Nothing to delete.  Resources are cleaned up automatically.
		}

		#endregion

		/// <summary>
		/// </summary>
		/// <returns>string representation of this instance</returns>
		public override string ToString()
		{
			return "temp-topic://" + this.destinationName;
		}
	}
}

