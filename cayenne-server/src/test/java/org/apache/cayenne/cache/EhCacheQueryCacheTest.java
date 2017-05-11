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
package org.apache.cayenne.cache;

import net.sf.ehcache.CacheManager;
import org.apache.cayenne.query.QueryMetadata;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SuppressWarnings("deprecation")
public class EhCacheQueryCacheTest {

    private CacheManager cacheManager;

    @Before
    public void setUp() throws Exception {
        cacheManager = new CacheManager();
    }

    @After
    public void tearDown() throws Exception {
        cacheManager.shutdown();
    }

    @Test
    public void testGet() {

        EhCacheQueryCache cache = new EhCacheQueryCache(cacheManager);

        QueryMetadata md = mock(QueryMetadata.class);
        when(md.getCacheKey()).thenReturn("k1");

        assertNull(cache.get(md));

        List<?> results = new ArrayList<Object>();
        cache.put(md, results);
        assertSame(results, cache.get(md));
    }

    @Test
    public void testGet_WithFactory() {

        EhCacheQueryCache cache = new EhCacheQueryCache(cacheManager);

        ArrayList[] lists = new ArrayList[] { new ArrayList<>(), new ArrayList<>(), new ArrayList<>() };
        QueryCacheEntryFactory factory = mock(QueryCacheEntryFactory.class);
        when(factory.createObject()).thenReturn(lists[0], lists[1], lists[2]);

        QueryMetadata md = mock(QueryMetadata.class);
        when(md.getCacheKey()).thenReturn("k1");

        assertEquals(lists[0], cache.get(md, factory));
        assertEquals(lists[0], cache.get(md, factory));
        assertEquals(lists[0], cache.get(md, factory));

        List<?> results = new ArrayList<Object>();
        cache.put(md, results);
        assertSame(results, cache.get(md));
    }

    @Test
    public void testGet_WithFactory_WithCacheGroups() {

        EhCacheQueryCache cache = new EhCacheQueryCache(cacheManager);

        ArrayList[] lists = new ArrayList[] { new ArrayList<>(), new ArrayList<>(), new ArrayList<>() };
        QueryCacheEntryFactory factory = mock(QueryCacheEntryFactory.class);
        when(factory.createObject()).thenReturn(lists[0], lists[1], lists[2]);

        QueryMetadata md = mock(QueryMetadata.class);
        when(md.getCacheKey()).thenReturn("k1");
        when(md.getCacheGroups()).thenReturn(new String[] { "cg1" });

        assertEquals(lists[0], cache.get(md, factory));
        assertEquals(lists[0], cache.get(md, factory));
        assertEquals(lists[0], cache.get(md, factory));

        List<?> results = new ArrayList<Object>();
        cache.put(md, results);
        assertSame(results, cache.get(md));
    }

    @Test
    public void testRemoveGroup_WithFactory_WithCacheGroups() {

        EhCacheQueryCache cache = new EhCacheQueryCache(cacheManager);

        ArrayList[] lists = new ArrayList[] { new ArrayList<>(), new ArrayList<>(), new ArrayList<>() };
        QueryCacheEntryFactory factory = mock(QueryCacheEntryFactory.class);
        when(factory.createObject()).thenReturn(lists[0], lists[1], lists[2]);

        QueryMetadata md = mock(QueryMetadata.class);
        when(md.getCacheKey()).thenReturn("k1");
        when(md.getCacheGroups()).thenReturn(new String[] { "cg1" });

        assertEquals(lists[0], cache.get(md, factory));
        assertEquals(lists[0], cache.get(md, factory));

        cache.removeGroup("cg0");
        assertEquals(lists[0], cache.get(md, factory));

        cache.removeGroup("cg1");
        assertEquals(lists[1], cache.get(md, factory));

    }
}
