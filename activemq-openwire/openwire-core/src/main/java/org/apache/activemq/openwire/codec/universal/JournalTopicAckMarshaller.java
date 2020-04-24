/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.activemq.openwire.codec.universal;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.activemq.openwire.codec.*;
import org.apache.activemq.openwire.commands.*;

/**
 * Marshalling code for Open Wire for JournalTopicAck
 *
 * NOTE!: This file is auto generated - do not modify!
 *
 */
public class JournalTopicAckMarshaller extends BaseDataStreamMarshaller {

    /**
     * Return the type of Data Structure handled by this Marshaler
     *
     * @return short representation of the type data structure
     */
    public byte getDataStructureType() {
        return JournalTopicAck.DATA_STRUCTURE_TYPE;
    }
    
    /**
     * @return a new instance of the managed type.
     */
    public DataStructure createObject() {
        return new JournalTopicAck();
    }

    /**
     * Un-marshal an object instance from the data input stream
     *
     * @param wireFormat the OpenWireFormat instance to use
     * @param target the object to un-marshal
     * @param dataIn the data input stream to build the object from
     * @param bs the boolean stream where the type's booleans were marshaled
     *
     * @throws IOException if an error occurs while reading the data
     */
    public void tightUnmarshal(OpenWireFormat wireFormat, Object target, DataInput dataIn, BooleanStream bs) throws IOException {
        super.tightUnmarshal(wireFormat, target, dataIn, bs);

        JournalTopicAck info = (JournalTopicAck) target;

        info.setDestination((OpenWireDestination) tightUnmarsalNestedObject(wireFormat, dataIn, bs));
        info.setMessageId((MessageId) tightUnmarsalNestedObject(wireFormat, dataIn, bs));
        info.setMessageSequenceId(tightUnmarshalLong(wireFormat, dataIn, bs));
        info.setSubscritionName(tightUnmarshalString(dataIn, bs));
        info.setClientId(tightUnmarshalString(dataIn, bs));
        info.setTransactionId((TransactionId) tightUnmarsalNestedObject(wireFormat, dataIn, bs));
    }

    /**
     * Write the booleans that this object uses to a BooleanStream
     *
     * @param wireFormat the OpenWireFormat instance to use
     * @param source the object to marshal
     * @param bs the boolean stream where the type's booleans are written
     *
     * @throws IOException if an error occurs while writing the data
     */
    public int tightMarshal1(OpenWireFormat wireFormat, Object source, BooleanStream bs) throws IOException {
        JournalTopicAck info = (JournalTopicAck) source;

        int rc = super.tightMarshal1(wireFormat, source, bs);
        rc += tightMarshalNestedObject1(wireFormat, (DataStructure)info.getDestination(), bs);
        rc += tightMarshalNestedObject1(wireFormat, (DataStructure)info.getMessageId(), bs);
        rc += tightMarshalLong1(wireFormat, info.getMessageSequenceId(), bs);
        rc += tightMarshalString1(info.getSubscritionName(), bs);
        rc += tightMarshalString1(info.getClientId(), bs);
        rc += tightMarshalNestedObject1(wireFormat, (DataStructure)info.getTransactionId(), bs);

        return rc + 0;
    }

    /**
     * Write a object instance to data output stream
     *
     * @param wireFormat the OpenWireFormat instance to use
     * @param source the object to marshal
     * @param dataOut the DataOut where the properties are written
     * @param bs the boolean stream where the type's booleans are written
     *
     * @throws IOException if an error occurs while writing the data
     */
    public void tightMarshal2(OpenWireFormat wireFormat, Object source, DataOutput dataOut, BooleanStream bs) throws IOException {
        super.tightMarshal2(wireFormat, source, dataOut, bs);

        JournalTopicAck info = (JournalTopicAck) source;

        tightMarshalNestedObject2(wireFormat, (DataStructure)info.getDestination(), dataOut, bs);
        tightMarshalNestedObject2(wireFormat, (DataStructure)info.getMessageId(), dataOut, bs);
        tightMarshalLong2(wireFormat, info.getMessageSequenceId(), dataOut, bs);
        tightMarshalString2(info.getSubscritionName(), dataOut, bs);
        tightMarshalString2(info.getClientId(), dataOut, bs);
        tightMarshalNestedObject2(wireFormat, (DataStructure)info.getTransactionId(), dataOut, bs);
    }

    /**
     * Write the object to the output using loose marshaling.
     *
     * @throws IOException if an error occurs while writing the data
     */
    public void looseMarshal(OpenWireFormat wireFormat, Object source, DataOutput dataOut) throws IOException {
        JournalTopicAck info = (JournalTopicAck) source;

        super.looseMarshal(wireFormat, source, dataOut);
        looseMarshalNestedObject(wireFormat, (DataStructure)info.getDestination(), dataOut);
        looseMarshalNestedObject(wireFormat, (DataStructure)info.getMessageId(), dataOut);
        looseMarshalLong(wireFormat, info.getMessageSequenceId(), dataOut);
        looseMarshalString(info.getSubscritionName(), dataOut);
        looseMarshalString(info.getClientId(), dataOut);
        looseMarshalNestedObject(wireFormat, (DataStructure)info.getTransactionId(), dataOut);
    }

    /**
     * Un-marshal an object instance from the data input stream
     *
     * @param target the object to un-marshal
     * @param dataIn the data input stream to build the object from
     *
     * @throws IOException if an error occurs while writing the data
     */
    public void looseUnmarshal(OpenWireFormat wireFormat, Object target, DataInput dataIn) throws IOException {
        super.looseUnmarshal(wireFormat, target, dataIn);

        JournalTopicAck info = (JournalTopicAck) target;

        info.setDestination((OpenWireDestination) looseUnmarsalNestedObject(wireFormat, dataIn));
        info.setMessageId((MessageId) looseUnmarsalNestedObject(wireFormat, dataIn));
        info.setMessageSequenceId(looseUnmarshalLong(wireFormat, dataIn));
        info.setSubscritionName(looseUnmarshalString(dataIn));
        info.setClientId(looseUnmarshalString(dataIn));
        info.setTransactionId((TransactionId) looseUnmarsalNestedObject(wireFormat, dataIn));
    }
}
