/**
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

/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.status;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)")
public class JobStatus implements org.apache.thrift.TBase<JobStatus, JobStatus._Fields>, java.io.Serializable, Cloneable, Comparable<JobStatus> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobStatus");

  private static final org.apache.thrift.protocol.TField JOB_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("jobState", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TIME_OF_STATE_CHANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("timeOfStateChange", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField REASON_FIELD_DESC = new org.apache.thrift.protocol.TField("reason", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField STATUS_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("statusId", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new JobStatusStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new JobStatusTupleSchemeFactory();

  private JobState jobState; // required
  private long timeOfStateChange; // optional
  private java.lang.String reason; // optional
  private java.lang.String statusId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see JobState
     */
    JOB_STATE((short)1, "jobState"),
    TIME_OF_STATE_CHANGE((short)2, "timeOfStateChange"),
    REASON((short)3, "reason"),
    STATUS_ID((short)4, "statusId");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // JOB_STATE
          return JOB_STATE;
        case 2: // TIME_OF_STATE_CHANGE
          return TIME_OF_STATE_CHANGE;
        case 3: // REASON
          return REASON;
        case 4: // STATUS_ID
          return STATUS_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TIMEOFSTATECHANGE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TIME_OF_STATE_CHANGE,_Fields.REASON,_Fields.STATUS_ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOB_STATE, new org.apache.thrift.meta_data.FieldMetaData("jobState", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, JobState.class)));
    tmpMap.put(_Fields.TIME_OF_STATE_CHANGE, new org.apache.thrift.meta_data.FieldMetaData("timeOfStateChange", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.REASON, new org.apache.thrift.meta_data.FieldMetaData("reason", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATUS_ID, new org.apache.thrift.meta_data.FieldMetaData("statusId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobStatus.class, metaDataMap);
  }

  public JobStatus() {
  }

  public JobStatus(
    JobState jobState)
  {
    this();
    this.jobState = jobState;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobStatus(JobStatus other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetJobState()) {
      this.jobState = other.jobState;
    }
    this.timeOfStateChange = other.timeOfStateChange;
    if (other.isSetReason()) {
      this.reason = other.reason;
    }
    if (other.isSetStatusId()) {
      this.statusId = other.statusId;
    }
  }

  public JobStatus deepCopy() {
    return new JobStatus(this);
  }

  @Override
  public void clear() {
    this.jobState = null;
    setTimeOfStateChangeIsSet(false);
    this.timeOfStateChange = 0;
    this.reason = null;
    this.statusId = null;
  }

  /**
   * 
   * @see JobState
   */
  public JobState getJobState() {
    return this.jobState;
  }

  /**
   * 
   * @see JobState
   */
  public void setJobState(JobState jobState) {
    this.jobState = jobState;
  }

  public void unsetJobState() {
    this.jobState = null;
  }

  /** Returns true if field jobState is set (has been assigned a value) and false otherwise */
  public boolean isSetJobState() {
    return this.jobState != null;
  }

  public void setJobStateIsSet(boolean value) {
    if (!value) {
      this.jobState = null;
    }
  }

  public long getTimeOfStateChange() {
    return this.timeOfStateChange;
  }

  public void setTimeOfStateChange(long timeOfStateChange) {
    this.timeOfStateChange = timeOfStateChange;
    setTimeOfStateChangeIsSet(true);
  }

  public void unsetTimeOfStateChange() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TIMEOFSTATECHANGE_ISSET_ID);
  }

  /** Returns true if field timeOfStateChange is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeOfStateChange() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TIMEOFSTATECHANGE_ISSET_ID);
  }

  public void setTimeOfStateChangeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TIMEOFSTATECHANGE_ISSET_ID, value);
  }

  public java.lang.String getReason() {
    return this.reason;
  }

  public void setReason(java.lang.String reason) {
    this.reason = reason;
  }

  public void unsetReason() {
    this.reason = null;
  }

  /** Returns true if field reason is set (has been assigned a value) and false otherwise */
  public boolean isSetReason() {
    return this.reason != null;
  }

  public void setReasonIsSet(boolean value) {
    if (!value) {
      this.reason = null;
    }
  }

  public java.lang.String getStatusId() {
    return this.statusId;
  }

  public void setStatusId(java.lang.String statusId) {
    this.statusId = statusId;
  }

  public void unsetStatusId() {
    this.statusId = null;
  }

  /** Returns true if field statusId is set (has been assigned a value) and false otherwise */
  public boolean isSetStatusId() {
    return this.statusId != null;
  }

  public void setStatusIdIsSet(boolean value) {
    if (!value) {
      this.statusId = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case JOB_STATE:
      if (value == null) {
        unsetJobState();
      } else {
        setJobState((JobState)value);
      }
      break;

    case TIME_OF_STATE_CHANGE:
      if (value == null) {
        unsetTimeOfStateChange();
      } else {
        setTimeOfStateChange((java.lang.Long)value);
      }
      break;

    case REASON:
      if (value == null) {
        unsetReason();
      } else {
        setReason((java.lang.String)value);
      }
      break;

    case STATUS_ID:
      if (value == null) {
        unsetStatusId();
      } else {
        setStatusId((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB_STATE:
      return getJobState();

    case TIME_OF_STATE_CHANGE:
      return getTimeOfStateChange();

    case REASON:
      return getReason();

    case STATUS_ID:
      return getStatusId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case JOB_STATE:
      return isSetJobState();
    case TIME_OF_STATE_CHANGE:
      return isSetTimeOfStateChange();
    case REASON:
      return isSetReason();
    case STATUS_ID:
      return isSetStatusId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof JobStatus)
      return this.equals((JobStatus)that);
    return false;
  }

  public boolean equals(JobStatus that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_jobState = true && this.isSetJobState();
    boolean that_present_jobState = true && that.isSetJobState();
    if (this_present_jobState || that_present_jobState) {
      if (!(this_present_jobState && that_present_jobState))
        return false;
      if (!this.jobState.equals(that.jobState))
        return false;
    }

    boolean this_present_timeOfStateChange = true && this.isSetTimeOfStateChange();
    boolean that_present_timeOfStateChange = true && that.isSetTimeOfStateChange();
    if (this_present_timeOfStateChange || that_present_timeOfStateChange) {
      if (!(this_present_timeOfStateChange && that_present_timeOfStateChange))
        return false;
      if (this.timeOfStateChange != that.timeOfStateChange)
        return false;
    }

    boolean this_present_reason = true && this.isSetReason();
    boolean that_present_reason = true && that.isSetReason();
    if (this_present_reason || that_present_reason) {
      if (!(this_present_reason && that_present_reason))
        return false;
      if (!this.reason.equals(that.reason))
        return false;
    }

    boolean this_present_statusId = true && this.isSetStatusId();
    boolean that_present_statusId = true && that.isSetStatusId();
    if (this_present_statusId || that_present_statusId) {
      if (!(this_present_statusId && that_present_statusId))
        return false;
      if (!this.statusId.equals(that.statusId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetJobState()) ? 131071 : 524287);
    if (isSetJobState())
      hashCode = hashCode * 8191 + jobState.getValue();

    hashCode = hashCode * 8191 + ((isSetTimeOfStateChange()) ? 131071 : 524287);
    if (isSetTimeOfStateChange())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(timeOfStateChange);

    hashCode = hashCode * 8191 + ((isSetReason()) ? 131071 : 524287);
    if (isSetReason())
      hashCode = hashCode * 8191 + reason.hashCode();

    hashCode = hashCode * 8191 + ((isSetStatusId()) ? 131071 : 524287);
    if (isSetStatusId())
      hashCode = hashCode * 8191 + statusId.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(JobStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetJobState()).compareTo(other.isSetJobState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobState, other.jobState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTimeOfStateChange()).compareTo(other.isSetTimeOfStateChange());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeOfStateChange()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeOfStateChange, other.timeOfStateChange);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetReason()).compareTo(other.isSetReason());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReason()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reason, other.reason);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStatusId()).compareTo(other.isSetStatusId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatusId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.statusId, other.statusId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("JobStatus(");
    boolean first = true;

    sb.append("jobState:");
    if (this.jobState == null) {
      sb.append("null");
    } else {
      sb.append(this.jobState);
    }
    first = false;
    if (isSetTimeOfStateChange()) {
      if (!first) sb.append(", ");
      sb.append("timeOfStateChange:");
      sb.append(this.timeOfStateChange);
      first = false;
    }
    if (isSetReason()) {
      if (!first) sb.append(", ");
      sb.append("reason:");
      if (this.reason == null) {
        sb.append("null");
      } else {
        sb.append(this.reason);
      }
      first = false;
    }
    if (isSetStatusId()) {
      if (!first) sb.append(", ");
      sb.append("statusId:");
      if (this.statusId == null) {
        sb.append("null");
      } else {
        sb.append(this.statusId);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetJobState()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'jobState' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class JobStatusStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public JobStatusStandardScheme getScheme() {
      return new JobStatusStandardScheme();
    }
  }

  private static class JobStatusStandardScheme extends org.apache.thrift.scheme.StandardScheme<JobStatus> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOB_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.jobState = org.apache.airavata.model.status.JobState.findByValue(iprot.readI32());
              struct.setJobStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TIME_OF_STATE_CHANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timeOfStateChange = iprot.readI64();
              struct.setTimeOfStateChangeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // REASON
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.reason = iprot.readString();
              struct.setReasonIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STATUS_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.statusId = iprot.readString();
              struct.setStatusIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobStatus struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.jobState != null) {
        oprot.writeFieldBegin(JOB_STATE_FIELD_DESC);
        oprot.writeI32(struct.jobState.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.isSetTimeOfStateChange()) {
        oprot.writeFieldBegin(TIME_OF_STATE_CHANGE_FIELD_DESC);
        oprot.writeI64(struct.timeOfStateChange);
        oprot.writeFieldEnd();
      }
      if (struct.reason != null) {
        if (struct.isSetReason()) {
          oprot.writeFieldBegin(REASON_FIELD_DESC);
          oprot.writeString(struct.reason);
          oprot.writeFieldEnd();
        }
      }
      if (struct.statusId != null) {
        if (struct.isSetStatusId()) {
          oprot.writeFieldBegin(STATUS_ID_FIELD_DESC);
          oprot.writeString(struct.statusId);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JobStatusTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public JobStatusTupleScheme getScheme() {
      return new JobStatusTupleScheme();
    }
  }

  private static class JobStatusTupleScheme extends org.apache.thrift.scheme.TupleScheme<JobStatus> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JobStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.jobState.getValue());
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTimeOfStateChange()) {
        optionals.set(0);
      }
      if (struct.isSetReason()) {
        optionals.set(1);
      }
      if (struct.isSetStatusId()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTimeOfStateChange()) {
        oprot.writeI64(struct.timeOfStateChange);
      }
      if (struct.isSetReason()) {
        oprot.writeString(struct.reason);
      }
      if (struct.isSetStatusId()) {
        oprot.writeString(struct.statusId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JobStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.jobState = org.apache.airavata.model.status.JobState.findByValue(iprot.readI32());
      struct.setJobStateIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.timeOfStateChange = iprot.readI64();
        struct.setTimeOfStateChangeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.reason = iprot.readString();
        struct.setReasonIsSet(true);
      }
      if (incoming.get(2)) {
        struct.statusId = iprot.readString();
        struct.setStatusIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
