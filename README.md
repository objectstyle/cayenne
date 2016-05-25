<!--
	Licensed to the Apache Software Foundation (ASF) under one
	or more contributor license agreements.  See the NOTICE file
	distributed with this work for additional information
	regarding copyright ownership.  The ASF licenses this file
	to you under the Apache License, Version 2.0 (the
	"License"); you may not use this file except in compliance
	with the License.  You may obtain a copy of the License at
	
	http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing,
	software distributed under the License is distributed on an
	"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
	KIND, either express or implied.  See the License for the
	specific language governing permissions and limitations
	under the License.   
-->
ObjectStyle Builds of Apache Cayenne
======================================

This is a fork of [Apache Cayenne](http://cayenne.apache.org/) used to create unofficial builds of Cayenne, 
to facilitate testing and adoption of new Cayenne features between the official releases. It is used by 
[ObjectStyle LLC](http://objectstyle.com), its clients, and can be freely used by anyone else under the terms
of the Apache License.

To use the unofficial builds, add the following repository:

```xml
<repository>
	<id>cayenne-unofficial</id>
	<name>Cayenne Unofficial Releases @ ObjectStyle</name>
	<url>http://maven.objectstyle.org/nexus/content/repositories/cayenne-unofficial/</url>
</repository>
```

