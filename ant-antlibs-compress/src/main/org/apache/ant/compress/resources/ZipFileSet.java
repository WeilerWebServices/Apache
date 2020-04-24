/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.apache.ant.compress.resources;

import org.apache.tools.ant.types.ArchiveScanner;
import org.apache.tools.ant.types.FileSet;

/**
 * A ZipFileSet is a FileSet with extra attributes useful in the context of
 * Zip/Jar tasks.
 *
 * A ZipFileSet extends FileSets with the ability to extract a subset of the
 * entries of a Zip file for inclusion in another Zip file.  It also includes
 * a prefix attribute which is prepended to each entry in the output Zip file.
 *
 */
public class ZipFileSet extends CommonsCompressFileSet {

    /** Constructor for ZipFileSet */
    public ZipFileSet() {
        super();
    }

    /**
     * Constructor using a fileset argument.
     * @param fileset the fileset to use
     */
    protected ZipFileSet(FileSet fileset) {
        super(fileset);
    }

    /**
     * Constructor using a zipfileset argument.
     * @param fileset the zipfileset to use
     */
    protected ZipFileSet(ZipFileSet fileset) {
        super(fileset);
    }

    /**
     * Constructor using a CommonsCompressFileSet argument.
     * @param fileset the fileset to use
     */
    protected ZipFileSet(CommonsCompressFileSet fileset) {
        super(fileset);
    }

    /**
     * Return a new archive scanner based on this one.
     * @return a new ZipScanner with the same encoding as this one.
     */
    @Override
    protected ArchiveScanner newArchiveScanner() {
        ZipScanner zs = new ZipScanner(getSkipUnreadableEntries(), getProject());
        zs.setEncoding(getEncoding());
        return zs;
    }

    @Override
    protected CommonsCompressFileSet newFileSet(FileSet fs) {
        if (fs instanceof ZipFileSet) {
            return new ZipFileSet((ZipFileSet) fs);
        }
        if (fs instanceof CommonsCompressFileSet) {
            return new ZipFileSet((CommonsCompressFileSet) fs);
        }
        return new ZipFileSet(fs);
    }

}