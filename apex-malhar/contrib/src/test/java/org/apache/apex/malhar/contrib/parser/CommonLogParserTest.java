/**
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
package org.apache.apex.malhar.contrib.parser;

import java.io.IOException;

import org.codehaus.jettison.json.JSONException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import org.apache.apex.malhar.contrib.parser.log.CommonLog;
import org.apache.apex.malhar.lib.testbench.CollectorTestSink;

public class CommonLogParserTest
{

  CommonLogParser commonLogParser = new CommonLogParser();

  private CollectorTestSink<Object> error = new CollectorTestSink<Object>();

  private CollectorTestSink<Object> pojoPort = new CollectorTestSink<Object>();

  @Rule
  public Watcher watcher = new Watcher();

  public class Watcher extends TestWatcher
  {
    @Override
    protected void starting(Description description)
    {
      super.starting(description);
      commonLogParser.err.setSink(error);
      commonLogParser.parsedOutput.setSink(pojoPort);
    }

    @Override
    protected void finished(Description description)
    {
      super.finished(description);
      error.clear();
      pojoPort.clear();
      commonLogParser.teardown();
    }
  }

  @Test
  public void TestEmptyInput()
  {
    String tuple = "";
    commonLogParser.setup(null);
    commonLogParser.beginWindow(0);
    commonLogParser.in.process(tuple.getBytes());
    commonLogParser.endWindow();
    Assert.assertEquals(0, pojoPort.collectedTuples.size());
    Assert.assertEquals(1, error.collectedTuples.size());
  }

  @Test
  public void TestNullInput()
  {
    commonLogParser.setup(null);
    commonLogParser.in.process(null);
    commonLogParser.endWindow();
    Assert.assertEquals(0, pojoPort.collectedTuples.size());
    Assert.assertEquals(1, error.collectedTuples.size());
  }

  @Test
  public void TestValidCommonLogInputCase() throws JSONException, IOException
  {

    commonLogParser.setup(null);
    commonLogParser.beginWindow(0);
    String log = "125.125.125.125 - dsmith [10/Oct/1999:21:15:05 +0500] \"GET /index.html HTTP/1.0\" 200 1043";
    commonLogParser.in.process(log.getBytes());
    commonLogParser.endWindow();
    Assert.assertEquals(1, pojoPort.collectedTuples.size());
    Assert.assertEquals(0, error.collectedTuples.size());
    Object obj = pojoPort.collectedTuples.get(0);
    Assert.assertNotNull(obj);
    Assert.assertEquals(CommonLog.class, obj.getClass());
    CommonLog pojo = (CommonLog)obj;
    Assert.assertNotNull(obj);
    Assert.assertEquals("125.125.125.125", pojo.getHost());
    Assert.assertEquals("dsmith", pojo.getUsername());
    Assert.assertEquals("10/Oct/1999:21:15:05 +0500", pojo.getDatetime());
    Assert.assertEquals("GET /index.html HTTP/1.0", pojo.getRequest());
    Assert.assertEquals("200", pojo.getStatusCode());
    Assert.assertEquals("1043", pojo.getBytes());
  }

  @Test
  public void TestInvalidCommonLogInput()
  {
    String tuple = "127.0.0.1 - dsmith 10/Oct/1999:21:15:05] \"GET /index.html HTTP/1.0\" 200 1043";
    commonLogParser.setup(null);
    commonLogParser.beginWindow(0);
    commonLogParser.in.process(tuple.getBytes());
    commonLogParser.endWindow();
    Assert.assertEquals(0, pojoPort.collectedTuples.size());
    Assert.assertEquals(1, error.collectedTuples.size());
  }

}
