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
<ivy-module version="2.0" xmlns:ea="http://www.easyant.org"> 
    <info organisation="@project.organisation@" module="@project.module@" 
            status="integration" revision="@project.revision@">
        <!--
            This easyant section is equivalent to having a module.ant like this:
            
            <project name="@project.organisation@;@project.module@"
                xmlns:ea="antlib:org.apache.easyant">
                
                <ea:import organisation="org.apache.easyant.buildtypes" module="build-webapp-java" revision="0.9"/>
            </project>              
          -->
        <!-- note that in a module.ivy the organisation attribute is not mandatory
            if not specified easyant will use the default organisation for build type / plugin -->
        <ea:build organisation="org.apache.easyant.buildtypes" module="build-webapp-java" revision="0.9"/>
    </info>
    <configurations>
        <conf name="default" visibility="public" description="runtime dependencies artifact can be used with this conf"/>
        <conf name="test" visibility="private" description="this scope indicates that the dependency is not required for normal use of the application, and is only available for the test compilation and execution phases."/>
        <conf name="provided" visibility="public" description="this is much like compile, but indicates you expect the JDK or a container to provide it. It is only available on the compilation classpath, and is not transitive."/>
    </configurations>
    <dependencies>
        <!-- your project dependencies goes here -->
        <!--
            <dependency org="junit" name="junit" rev="4.4" conf="test->default" />
        -->
    </dependencies>
</ivy-module>