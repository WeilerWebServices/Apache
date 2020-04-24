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
/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.accumulo.proxy.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class KeyValueAndPeek implements org.apache.thrift.TBase<KeyValueAndPeek, KeyValueAndPeek._Fields>, java.io.Serializable, Cloneable, Comparable<KeyValueAndPeek> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("KeyValueAndPeek");

  private static final org.apache.thrift.protocol.TField KEY_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("keyValue", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField HAS_NEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("hasNext", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new KeyValueAndPeekStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new KeyValueAndPeekTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable KeyValue keyValue; // required
  public boolean hasNext; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    KEY_VALUE((short)1, "keyValue"),
    HAS_NEXT((short)2, "hasNext");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // KEY_VALUE
          return KEY_VALUE;
        case 2: // HAS_NEXT
          return HAS_NEXT;
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
    @org.apache.thrift.annotation.Nullable
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
  private static final int __HASNEXT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KEY_VALUE, new org.apache.thrift.meta_data.FieldMetaData("keyValue", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, KeyValue.class)));
    tmpMap.put(_Fields.HAS_NEXT, new org.apache.thrift.meta_data.FieldMetaData("hasNext", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(KeyValueAndPeek.class, metaDataMap);
  }

  public KeyValueAndPeek() {
  }

  public KeyValueAndPeek(
    KeyValue keyValue,
    boolean hasNext)
  {
    this();
    this.keyValue = keyValue;
    this.hasNext = hasNext;
    setHasNextIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public KeyValueAndPeek(KeyValueAndPeek other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetKeyValue()) {
      this.keyValue = new KeyValue(other.keyValue);
    }
    this.hasNext = other.hasNext;
  }

  public KeyValueAndPeek deepCopy() {
    return new KeyValueAndPeek(this);
  }

  @Override
  public void clear() {
    this.keyValue = null;
    setHasNextIsSet(false);
    this.hasNext = false;
  }

  @org.apache.thrift.annotation.Nullable
  public KeyValue getKeyValue() {
    return this.keyValue;
  }

  public KeyValueAndPeek setKeyValue(@org.apache.thrift.annotation.Nullable KeyValue keyValue) {
    this.keyValue = keyValue;
    return this;
  }

  public void unsetKeyValue() {
    this.keyValue = null;
  }

  /** Returns true if field keyValue is set (has been assigned a value) and false otherwise */
  public boolean isSetKeyValue() {
    return this.keyValue != null;
  }

  public void setKeyValueIsSet(boolean value) {
    if (!value) {
      this.keyValue = null;
    }
  }

  public boolean isHasNext() {
    return this.hasNext;
  }

  public KeyValueAndPeek setHasNext(boolean hasNext) {
    this.hasNext = hasNext;
    setHasNextIsSet(true);
    return this;
  }

  public void unsetHasNext() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HASNEXT_ISSET_ID);
  }

  /** Returns true if field hasNext is set (has been assigned a value) and false otherwise */
  public boolean isSetHasNext() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HASNEXT_ISSET_ID);
  }

  public void setHasNextIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HASNEXT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case KEY_VALUE:
      if (value == null) {
        unsetKeyValue();
      } else {
        setKeyValue((KeyValue)value);
      }
      break;

    case HAS_NEXT:
      if (value == null) {
        unsetHasNext();
      } else {
        setHasNext((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case KEY_VALUE:
      return getKeyValue();

    case HAS_NEXT:
      return isHasNext();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case KEY_VALUE:
      return isSetKeyValue();
    case HAS_NEXT:
      return isSetHasNext();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof KeyValueAndPeek)
      return this.equals((KeyValueAndPeek)that);
    return false;
  }

  public boolean equals(KeyValueAndPeek that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_keyValue = true && this.isSetKeyValue();
    boolean that_present_keyValue = true && that.isSetKeyValue();
    if (this_present_keyValue || that_present_keyValue) {
      if (!(this_present_keyValue && that_present_keyValue))
        return false;
      if (!this.keyValue.equals(that.keyValue))
        return false;
    }

    boolean this_present_hasNext = true;
    boolean that_present_hasNext = true;
    if (this_present_hasNext || that_present_hasNext) {
      if (!(this_present_hasNext && that_present_hasNext))
        return false;
      if (this.hasNext != that.hasNext)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetKeyValue()) ? 131071 : 524287);
    if (isSetKeyValue())
      hashCode = hashCode * 8191 + keyValue.hashCode();

    hashCode = hashCode * 8191 + ((hasNext) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(KeyValueAndPeek other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetKeyValue()).compareTo(other.isSetKeyValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeyValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.keyValue, other.keyValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetHasNext()).compareTo(other.isSetHasNext());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHasNext()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hasNext, other.hasNext);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("KeyValueAndPeek(");
    boolean first = true;

    sb.append("keyValue:");
    if (this.keyValue == null) {
      sb.append("null");
    } else {
      sb.append(this.keyValue);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("hasNext:");
    sb.append(this.hasNext);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (keyValue != null) {
      keyValue.validate();
    }
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

  private static class KeyValueAndPeekStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public KeyValueAndPeekStandardScheme getScheme() {
      return new KeyValueAndPeekStandardScheme();
    }
  }

  private static class KeyValueAndPeekStandardScheme extends org.apache.thrift.scheme.StandardScheme<KeyValueAndPeek> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, KeyValueAndPeek struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // KEY_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.keyValue = new KeyValue();
              struct.keyValue.read(iprot);
              struct.setKeyValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HAS_NEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.hasNext = iprot.readBool();
              struct.setHasNextIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, KeyValueAndPeek struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.keyValue != null) {
        oprot.writeFieldBegin(KEY_VALUE_FIELD_DESC);
        struct.keyValue.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(HAS_NEXT_FIELD_DESC);
      oprot.writeBool(struct.hasNext);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class KeyValueAndPeekTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public KeyValueAndPeekTupleScheme getScheme() {
      return new KeyValueAndPeekTupleScheme();
    }
  }

  private static class KeyValueAndPeekTupleScheme extends org.apache.thrift.scheme.TupleScheme<KeyValueAndPeek> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, KeyValueAndPeek struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetKeyValue()) {
        optionals.set(0);
      }
      if (struct.isSetHasNext()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetKeyValue()) {
        struct.keyValue.write(oprot);
      }
      if (struct.isSetHasNext()) {
        oprot.writeBool(struct.hasNext);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, KeyValueAndPeek struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.keyValue = new KeyValue();
        struct.keyValue.read(iprot);
        struct.setKeyValueIsSet(true);
      }
      if (incoming.get(1)) {
        struct.hasNext = iprot.readBool();
        struct.setHasNextIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
  private static void unusedMethod() {}
}

