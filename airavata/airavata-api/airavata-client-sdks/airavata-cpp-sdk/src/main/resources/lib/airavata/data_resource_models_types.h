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
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#ifndef data_resource_models_TYPES_H
#define data_resource_models_TYPES_H

#include <iosfwd>

#include <thrift/Thrift.h>
#include <thrift/TApplicationException.h>
#include <thrift/protocol/TProtocol.h>
#include <thrift/transport/TTransport.h>

#include <thrift/cxxfunctional.h>


namespace apache { namespace airavata { namespace model { namespace data { namespace resource {

struct ReplicaLocationCategory {
  enum type {
    GATEWAY_DATA_STORE = 0,
    COMPUTE_RESOURCE = 1,
    LONG_TERM_STORAGE_RESOURCE = 2,
    OTHER = 3
  };
};

extern const std::map<int, const char*> _ReplicaLocationCategory_VALUES_TO_NAMES;

struct ReplicaPersistentType {
  enum type {
    TRANSIENT = 0,
    PERSISTENT = 1
  };
};

extern const std::map<int, const char*> _ReplicaPersistentType_VALUES_TO_NAMES;

class DataResourceModel;

class DataReplicaLocationModel;

typedef struct _DataResourceModel__isset {
  _DataResourceModel__isset() : resourceId(false), resourceName(false), resourceDescription(false), ownerName(false), resourceSize(false), creationTime(false), lastModifiedTime(false), resourceMetadata(false), dataReplicaLocations(false) {}
  bool resourceId :1;
  bool resourceName :1;
  bool resourceDescription :1;
  bool ownerName :1;
  bool resourceSize :1;
  bool creationTime :1;
  bool lastModifiedTime :1;
  bool resourceMetadata :1;
  bool dataReplicaLocations :1;
} _DataResourceModel__isset;

class DataResourceModel {
 public:

  static const char* ascii_fingerprint; // = "1320CB0B65DC2E766D01B7D3255179F7";
  static const uint8_t binary_fingerprint[16]; // = {0x13,0x20,0xCB,0x0B,0x65,0xDC,0x2E,0x76,0x6D,0x01,0xB7,0xD3,0x25,0x51,0x79,0xF7};

  DataResourceModel(const DataResourceModel&);
  DataResourceModel& operator=(const DataResourceModel&);
  DataResourceModel() : resourceId(), resourceName(), resourceDescription(), ownerName(), resourceSize(0), creationTime(0), lastModifiedTime(0) {
  }

  virtual ~DataResourceModel() throw();
  std::string resourceId;
  std::string resourceName;
  std::string resourceDescription;
  std::string ownerName;
  int32_t resourceSize;
  int64_t creationTime;
  int64_t lastModifiedTime;
  std::map<std::string, std::string>  resourceMetadata;
  std::vector<DataReplicaLocationModel>  dataReplicaLocations;

  _DataResourceModel__isset __isset;

  void __set_resourceId(const std::string& val);

  void __set_resourceName(const std::string& val);

  void __set_resourceDescription(const std::string& val);

  void __set_ownerName(const std::string& val);

  void __set_resourceSize(const int32_t val);

  void __set_creationTime(const int64_t val);

  void __set_lastModifiedTime(const int64_t val);

  void __set_resourceMetadata(const std::map<std::string, std::string> & val);

  void __set_dataReplicaLocations(const std::vector<DataReplicaLocationModel> & val);

  bool operator == (const DataResourceModel & rhs) const
  {
    if (__isset.resourceId != rhs.__isset.resourceId)
      return false;
    else if (__isset.resourceId && !(resourceId == rhs.resourceId))
      return false;
    if (__isset.resourceName != rhs.__isset.resourceName)
      return false;
    else if (__isset.resourceName && !(resourceName == rhs.resourceName))
      return false;
    if (__isset.resourceDescription != rhs.__isset.resourceDescription)
      return false;
    else if (__isset.resourceDescription && !(resourceDescription == rhs.resourceDescription))
      return false;
    if (__isset.ownerName != rhs.__isset.ownerName)
      return false;
    else if (__isset.ownerName && !(ownerName == rhs.ownerName))
      return false;
    if (__isset.resourceSize != rhs.__isset.resourceSize)
      return false;
    else if (__isset.resourceSize && !(resourceSize == rhs.resourceSize))
      return false;
    if (__isset.creationTime != rhs.__isset.creationTime)
      return false;
    else if (__isset.creationTime && !(creationTime == rhs.creationTime))
      return false;
    if (__isset.lastModifiedTime != rhs.__isset.lastModifiedTime)
      return false;
    else if (__isset.lastModifiedTime && !(lastModifiedTime == rhs.lastModifiedTime))
      return false;
    if (__isset.resourceMetadata != rhs.__isset.resourceMetadata)
      return false;
    else if (__isset.resourceMetadata && !(resourceMetadata == rhs.resourceMetadata))
      return false;
    if (__isset.dataReplicaLocations != rhs.__isset.dataReplicaLocations)
      return false;
    else if (__isset.dataReplicaLocations && !(dataReplicaLocations == rhs.dataReplicaLocations))
      return false;
    return true;
  }
  bool operator != (const DataResourceModel &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const DataResourceModel & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  friend std::ostream& operator<<(std::ostream& out, const DataResourceModel& obj);
};

void swap(DataResourceModel &a, DataResourceModel &b);

typedef struct _DataReplicaLocationModel__isset {
  _DataReplicaLocationModel__isset() : replicaId(false), resourceId(false), replicaName(false), replicaDescription(false), creationTime(false), lastModifiedTime(false), replicaLocationCategory(false), replicaPersistentType(false), dataLocations(false), replicaMetadata(false) {}
  bool replicaId :1;
  bool resourceId :1;
  bool replicaName :1;
  bool replicaDescription :1;
  bool creationTime :1;
  bool lastModifiedTime :1;
  bool replicaLocationCategory :1;
  bool replicaPersistentType :1;
  bool dataLocations :1;
  bool replicaMetadata :1;
} _DataReplicaLocationModel__isset;

class DataReplicaLocationModel {
 public:

  static const char* ascii_fingerprint; // = "781A1748A91BB45A79F33F79DC9474F1";
  static const uint8_t binary_fingerprint[16]; // = {0x78,0x1A,0x17,0x48,0xA9,0x1B,0xB4,0x5A,0x79,0xF3,0x3F,0x79,0xDC,0x94,0x74,0xF1};

  DataReplicaLocationModel(const DataReplicaLocationModel&);
  DataReplicaLocationModel& operator=(const DataReplicaLocationModel&);
  DataReplicaLocationModel() : replicaId(), resourceId(), replicaName(), replicaDescription(), creationTime(0), lastModifiedTime(0), replicaLocationCategory((ReplicaLocationCategory::type)0), replicaPersistentType((ReplicaPersistentType::type)0) {
  }

  virtual ~DataReplicaLocationModel() throw();
  std::string replicaId;
  std::string resourceId;
  std::string replicaName;
  std::string replicaDescription;
  int64_t creationTime;
  int64_t lastModifiedTime;
  ReplicaLocationCategory::type replicaLocationCategory;
  ReplicaPersistentType::type replicaPersistentType;
  std::vector<std::string>  dataLocations;
  std::map<std::string, std::string>  replicaMetadata;

  _DataReplicaLocationModel__isset __isset;

  void __set_replicaId(const std::string& val);

  void __set_resourceId(const std::string& val);

  void __set_replicaName(const std::string& val);

  void __set_replicaDescription(const std::string& val);

  void __set_creationTime(const int64_t val);

  void __set_lastModifiedTime(const int64_t val);

  void __set_replicaLocationCategory(const ReplicaLocationCategory::type val);

  void __set_replicaPersistentType(const ReplicaPersistentType::type val);

  void __set_dataLocations(const std::vector<std::string> & val);

  void __set_replicaMetadata(const std::map<std::string, std::string> & val);

  bool operator == (const DataReplicaLocationModel & rhs) const
  {
    if (__isset.replicaId != rhs.__isset.replicaId)
      return false;
    else if (__isset.replicaId && !(replicaId == rhs.replicaId))
      return false;
    if (__isset.resourceId != rhs.__isset.resourceId)
      return false;
    else if (__isset.resourceId && !(resourceId == rhs.resourceId))
      return false;
    if (__isset.replicaName != rhs.__isset.replicaName)
      return false;
    else if (__isset.replicaName && !(replicaName == rhs.replicaName))
      return false;
    if (__isset.replicaDescription != rhs.__isset.replicaDescription)
      return false;
    else if (__isset.replicaDescription && !(replicaDescription == rhs.replicaDescription))
      return false;
    if (__isset.creationTime != rhs.__isset.creationTime)
      return false;
    else if (__isset.creationTime && !(creationTime == rhs.creationTime))
      return false;
    if (__isset.lastModifiedTime != rhs.__isset.lastModifiedTime)
      return false;
    else if (__isset.lastModifiedTime && !(lastModifiedTime == rhs.lastModifiedTime))
      return false;
    if (__isset.replicaLocationCategory != rhs.__isset.replicaLocationCategory)
      return false;
    else if (__isset.replicaLocationCategory && !(replicaLocationCategory == rhs.replicaLocationCategory))
      return false;
    if (__isset.replicaPersistentType != rhs.__isset.replicaPersistentType)
      return false;
    else if (__isset.replicaPersistentType && !(replicaPersistentType == rhs.replicaPersistentType))
      return false;
    if (__isset.dataLocations != rhs.__isset.dataLocations)
      return false;
    else if (__isset.dataLocations && !(dataLocations == rhs.dataLocations))
      return false;
    if (__isset.replicaMetadata != rhs.__isset.replicaMetadata)
      return false;
    else if (__isset.replicaMetadata && !(replicaMetadata == rhs.replicaMetadata))
      return false;
    return true;
  }
  bool operator != (const DataReplicaLocationModel &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const DataReplicaLocationModel & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  friend std::ostream& operator<<(std::ostream& out, const DataReplicaLocationModel& obj);
};

void swap(DataReplicaLocationModel &a, DataReplicaLocationModel &b);

}}}}} // namespace

#endif
