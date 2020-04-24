package org.apache.archiva.policies;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.archiva.repository.storage.StorageAsset;

import java.util.Map;
import java.util.Properties;

/**
 * Policy to apply after the download has completed, but before the
 * resource is made available to the calling client.
 *
 *
 */
public interface DownloadErrorPolicy
    extends Policy
{
    /**
     * Apply the download error policy.
     *
     * @param policySetting      the policy setting.
     * @param request            the list of request properties that the policy might use.
     * @param localFile
     * @param exception          the exception that triggered the error
     * @param previousExceptions any previously triggered exceptions
     * @return True, if the exception should be processed, False if the exception should be ignored.
     * @throws PolicyConfigurationException if the policy is improperly configured
     */
    boolean applyPolicy( PolicyOption policySetting, Properties request, StorageAsset localFile, Exception exception,
                         Map<String, Exception> previousExceptions )
        throws PolicyConfigurationException;
}
