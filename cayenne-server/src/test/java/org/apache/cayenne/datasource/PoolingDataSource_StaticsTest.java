/*****************************************************************
 *   Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 ****************************************************************/
package org.apache.cayenne.datasource;

import static org.junit.Assert.assertEquals;

import org.apache.cayenne.datasource.PoolingDataSource;
import org.junit.Test;

public class PoolingDataSource_StaticsTest {

	@Test
	public void testMaxIdleConnections() {

		assertEquals(1, PoolingDataSource.maxIdleConnections(1, 1));
		assertEquals(2, PoolingDataSource.maxIdleConnections(1, 2));
		assertEquals(1, PoolingDataSource.maxIdleConnections(0, 2));
		assertEquals(2, PoolingDataSource.maxIdleConnections(0, 3));
		assertEquals(2, PoolingDataSource.maxIdleConnections(0, 4));
		assertEquals(3, PoolingDataSource.maxIdleConnections(0, 5));
		assertEquals(6, PoolingDataSource.maxIdleConnections(5, 6));

	}

}