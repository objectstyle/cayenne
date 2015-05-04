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
package org.apache.cayenne.configuration.server;

import javax.sql.DataSource;

import org.apache.cayenne.ConfigurationException;
import org.apache.cayenne.configuration.Constants;
import org.apache.cayenne.configuration.DataNodeDescriptor;
import org.apache.cayenne.configuration.RuntimeProperties;
import org.apache.cayenne.conn.DataSourceInfo;
import org.apache.cayenne.datasource.DataSourceBuilder;
import org.apache.cayenne.datasource.PoolingDataSource;
import org.apache.cayenne.di.AdhocObjectFactory;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.log.JdbcEventLogger;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * A {@link DataSourceFactory} that loads JDBC connection information from an
 * XML resource associated with the DataNodeDescriptor, returning a DataSource
 * with simple connection pooling.
 * 
 * @since 3.1
 */
// TODO: this factory does not read XML anymore, should we rename it to
// something else?
public class XMLPoolingDataSourceFactory implements DataSourceFactory {

	private static final Log logger = LogFactory.getLog(XMLPoolingDataSourceFactory.class);

	@Inject
	protected JdbcEventLogger jdbcEventLogger;

	@Inject
	private RuntimeProperties properties;

	@Inject
	private AdhocObjectFactory objectFactory;

	@Override
	public DataSource getDataSource(DataNodeDescriptor nodeDescriptor) throws Exception {

		DataSourceInfo descriptor = nodeDescriptor.getDataSourceDescriptor();

		if (descriptor == null) {
			String message = "Null dataSourceDescriptor for nodeDescriptor '" + nodeDescriptor.getName() + "'";
			logger.info(message);
			throw new ConfigurationException(message);
		}

		long maxQueueWaitTime = properties.getLong(Constants.SERVER_MAX_QUEUE_WAIT_TIME,
				PoolingDataSource.MAX_QUEUE_WAIT_DEFAULT);

		return DataSourceBuilder.builder(objectFactory, jdbcEventLogger).driver(descriptor.getJdbcDriver())
				.url(descriptor.getDataSourceUrl()).userName(descriptor.getUserName())
				.password(descriptor.getPassword()).minConnections(descriptor.getMinConnections())
				.maxConnections(descriptor.getMaxConnections()).maxQueueWaitTime(maxQueueWaitTime).build();
	}

}
