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
package org.apache.accumulo.testing.randomwalk.concurrent;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.accumulo.core.client.AccumuloClient;
import org.apache.accumulo.core.client.AccumuloSecurityException;
import org.apache.accumulo.core.client.Scanner;
import org.apache.accumulo.core.client.TableDeletedException;
import org.apache.accumulo.core.client.TableNotFoundException;
import org.apache.accumulo.core.client.TableOfflineException;
import org.apache.accumulo.core.data.Key;
import org.apache.accumulo.core.data.Value;
import org.apache.accumulo.core.security.Authorizations;
import org.apache.accumulo.testing.randomwalk.RandWalkEnv;
import org.apache.accumulo.testing.randomwalk.State;
import org.apache.accumulo.testing.randomwalk.Test;

public class ScanTable extends Test {

  @Override
  public void visit(State state, RandWalkEnv env, Properties props) throws Exception {
    AccumuloClient client = env.getAccumuloClient();
    String tableName = state.getRandomTableName();

    try {
      Scanner scanner = client.createScanner(tableName, Authorizations.EMPTY);
      Iterator<Entry<Key,Value>> iter = scanner.iterator();
      while (iter.hasNext()) {
        iter.next();
      }
      log.debug("Scanned " + tableName);
    } catch (TableDeletedException e) {
      log.debug("Scan " + tableName + " failed, table deleted");
    } catch (TableNotFoundException e) {
      log.debug("Scan " + tableName + " failed, doesnt exist");
    } catch (TableOfflineException e) {
      log.debug("Scan " + tableName + " failed, offline");
    } catch (RuntimeException e) {
      if (e.getCause() instanceof AccumuloSecurityException) {
        log.debug("BatchScan " + tableName + " failed, permission error");
      } else {
        throw e;
      }
    }
  }
}
