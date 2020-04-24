#!/bin/sh

for i in target/lib/*.jar
do
  CLASSPATH=$CLASSPATH:$i
done

CLASSPATH=$CLASSPATH:target/airavata-myproxy-client-0.1-SNAPSHOT.jar:./config

echo $CLASSPATH

java -classpath $CLASSPATH org.apache.airavata.security.myproxy.SecurityContext $*
