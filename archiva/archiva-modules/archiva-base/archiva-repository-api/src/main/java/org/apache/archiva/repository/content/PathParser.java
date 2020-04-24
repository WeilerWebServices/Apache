package org.apache.archiva.repository.content;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.archiva.model.ArtifactReference;
import org.apache.archiva.repository.LayoutException;

/**
 * PathParser interface.
 */
public interface PathParser
{

    /**
     * Take a path and get the ArtifactReference associated with it.
     *
     * @param path the relative path to parse.
     * @return the ArtifactReference for the provided path. (never null)
     * @throws LayoutException if there was a problem parsing the path.
     */
    ArtifactReference toArtifactReference( String path )
        throws LayoutException;


    /**
     * Return a item selector for the given path.
     *
     * @param path the path relative to the repository
     * @return a item selector instance
     * @throws LayoutException if the path does not reference a valid item
     */
    ItemSelector toItemSelector( String path ) throws LayoutException;


}
