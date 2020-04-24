<!--
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
-->
<project name="@project.organisation@;@project.module@-test" xmlns:au="antlib:org.apache.ant.antunit">
    
    <!-- Defines a setUp / tearDown (before each test) that cleans the environnement --> 
    <target name="clean" description="remove stale build artifacts before / after each test">
        <delete dir="${basedir}" includeemptydirs="true">
            <include name="**/target/**"/>
            <include name="**/lib/**"/>
        </delete>
    </target>
    
    <target name="setUp" depends="clean"/>
    <target name="tearDown" depends="clean"/>
    
    <!--
        A sample ant unit test case, 
        see the antunit official documentation for more informations
        
        <target name="testSample" description="a sample of ant unit test case">
            <au:assertTrue>
                <matches string="abc" pattern="abc"/>
            </au:assertTrue>
        </target>
    -->

</project>