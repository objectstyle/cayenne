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

package org.apache.cayenne.query;

import org.apache.cayenne.testdo.testmap.Painting;
import org.apache.cayenne.unit.util.TstBean;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class OrderingTest {

    @Test
    public void testPathSpec1() throws Exception {
        String pathSpec = "a.b.c";
        Ordering ord = new Ordering();
        assertNull(ord.getSortSpec());

        ord.setSortSpecString(pathSpec);
        assertEquals(pathSpec, ord.getSortSpec().getOperand(0));
    }

    @Test
    public void testPathSpec3() throws Exception {
        String pathSpec = "a.b.c";
        Ordering ord = new Ordering(pathSpec, SortOrder.DESCENDING);
        assertEquals(pathSpec, ord.getSortSpec().getOperand(0));
    }

    @Test
    public void testAscending1() throws Exception {
        Ordering ord = new Ordering();
        ord.setAscending();
        assertTrue(ord.isAscending());
        assertFalse(ord.isDescending());
    }

    @Test
    public void testAscending2() throws Exception {
        Ordering ord = new Ordering();
        ord.setSortOrder(SortOrder.ASCENDING);
        assertTrue(ord.isAscending());
        assertFalse(ord.isDescending());
    }

    @Test
    public void testAscending3() throws Exception {
        Ordering ord = new Ordering();
        ord.setSortOrder(SortOrder.ASCENDING_INSENSITIVE);
        assertTrue(ord.isAscending());
        assertFalse(ord.isDescending());
    }

    @Test
    public void testDescending1() throws Exception {
        Ordering ord = new Ordering();
        ord.setDescending();
        assertFalse(ord.isAscending());
        assertTrue(ord.isDescending());
    }

    @Test
    public void testDescending2() throws Exception {
        Ordering ord = new Ordering();
        ord.setSortOrder(SortOrder.DESCENDING);
        assertFalse(ord.isAscending());
        assertTrue(ord.isDescending());
    }

    @Test
    public void testDescending3() throws Exception {
        Ordering ord = new Ordering();
        ord.setSortOrder(SortOrder.DESCENDING_INSENSITIVE);
        assertFalse(ord.isAscending());
        assertTrue(ord.isDescending());
    }

    @Test
    public void testCaseInsensitive3() throws Exception {
        Ordering ord = new Ordering("M", SortOrder.ASCENDING_INSENSITIVE);
        assertTrue(ord.isCaseInsensitive());
    }

    @Test
    public void testCaseInsensitive4() throws Exception {
        Ordering ord = new Ordering("N", SortOrder.ASCENDING);
        assertFalse(ord.isCaseInsensitive());
    }

    @Test
    public void testCaseInsensitive5() throws Exception {
        Ordering ord = new Ordering("M", SortOrder.DESCENDING_INSENSITIVE);
        assertTrue(ord.isCaseInsensitive());
    }

    @Test
    public void testCaseInsensitive6() throws Exception {
        Ordering ord = new Ordering("N", SortOrder.DESCENDING);
        assertFalse(ord.isCaseInsensitive());
    }

    @Test
    public void testCompare3() throws Exception {
        Painting p1 = new Painting();
        p1.setEstimatedPrice(new BigDecimal(1000.00));

        Painting p2 = new Painting();
        p2.setEstimatedPrice(new BigDecimal(2000.00));

        Painting p3 = new Painting();
        p3.setEstimatedPrice(new BigDecimal(2000.00));

        Ordering ordering = new Ordering("estimatedPrice", SortOrder.ASCENDING);
        assertTrue(ordering.compare(p1, p2) < 0);
        assertTrue(ordering.compare(p2, p1) > 0);
        assertTrue(ordering.compare(p2, p3) == 0);
    }

    @Test
    public void testCompare4() throws Exception {
        // compare on non-persistent property
        TstBean t1 = new TstBean(1000);
        TstBean t2 = new TstBean(2000);
        TstBean t3 = new TstBean(2000);

        Ordering ordering = new Ordering("integer", SortOrder.ASCENDING);
        assertTrue(ordering.compare(t1, t2) < 0);
        assertTrue(ordering.compare(t2, t1) > 0);
        assertTrue(ordering.compare(t2, t3) == 0);
    }

    @Test
    public void testOrderList2() throws Exception {
        // compare on non-persistent property
        List<TstBean> list = new ArrayList<TstBean>(3);

        list.add(new TstBean(5));
        list.add(new TstBean(2));
        list.add(new TstBean(3));

        new Ordering("integer", SortOrder.ASCENDING).orderList(list);
        assertEquals(2, ((TstBean) list.get(0)).getInteger().intValue());
        assertEquals(3, ((TstBean) list.get(1)).getInteger().intValue());
        assertEquals(5, ((TstBean) list.get(2)).getInteger().intValue());
    }

    @Test
    public void testOrderListWithMultipleOrderings2() throws Exception {
        // compare on non-persistent property
        List<TstBean> list = new ArrayList<TstBean>(6);

        list.add(new TstBean("c", 1));
        list.add(new TstBean("c", 30));
        list.add(new TstBean("a", 5));
        list.add(new TstBean("b", 1));
        list.add(new TstBean("b", 2));
        list.add(new TstBean("b", 5));

        List<Ordering> orderings = new ArrayList<Ordering>(2);
        orderings.add(new Ordering("string", SortOrder.ASCENDING));
        orderings.add(new Ordering("integer", SortOrder.DESCENDING));

        // clone list and then order
        List<TstBean> orderedList = new ArrayList<TstBean>(list);
        Ordering.orderList(orderedList, orderings);

        assertEquals(list.get(2), orderedList.get(0));
        assertEquals(list.get(5), orderedList.get(1));
        assertEquals(list.get(4), orderedList.get(2));
        assertEquals(list.get(3), orderedList.get(3));
        assertEquals(list.get(1), orderedList.get(4));
        assertEquals(list.get(0), orderedList.get(5));
    }
    
    @Test
    public void testOrderedListInstanceMethod() {
    	Collection<TstBean> set = new HashSet<TstBean>(6);
    	
    	TstBean shouldBe0 = new TstBean("a", 0);
    	TstBean shouldBe1 = new TstBean("b", 0);
    	TstBean shouldBe2 = new TstBean("c", 0);
    	TstBean shouldBe3 = new TstBean("d", 0);
    	TstBean shouldBe4 = new TstBean("f", 0);
    	TstBean shouldBe5 = new TstBean("r", 0);
    	
    	set.add(shouldBe1);
    	set.add(shouldBe0);
    	set.add(shouldBe5);
    	set.add(shouldBe3);
    	set.add(shouldBe2);
    	set.add(shouldBe4);
    	
    	List<TstBean> orderedList = new Ordering("string", SortOrder.ASCENDING).orderedList(set);
    	
    	assertEquals(shouldBe0, orderedList.get(0));
    	assertEquals(shouldBe1, orderedList.get(1));
    	assertEquals(shouldBe2, orderedList.get(2));
    	assertEquals(shouldBe3, orderedList.get(3));
    	assertEquals(shouldBe4, orderedList.get(4));
    	assertEquals(shouldBe5, orderedList.get(5));
    }
    
    @Test
    public void testOrderedListStaticMethod() {
        Collection<TstBean> set = new HashSet<TstBean>(6);

        TstBean shouldBe0 = new TstBean("a", 5);
        TstBean shouldBe1 = new TstBean("b", 5);
        TstBean shouldBe2 = new TstBean("b", 2);
        TstBean shouldBe3 = new TstBean("b", 1);
        TstBean shouldBe4 = new TstBean("c", 30);
        TstBean shouldBe5 = new TstBean("c", 1);

        set.add(shouldBe0);
        set.add(shouldBe5);
        set.add(shouldBe3);
        set.add(shouldBe1);
        set.add(shouldBe4);
        set.add(shouldBe2);
        
        List<Ordering> orderings = new ArrayList<Ordering>(2);
        orderings.add(new Ordering("string", SortOrder.ASCENDING));
        orderings.add(new Ordering("integer", SortOrder.DESCENDING));

        List<TstBean> orderedList = Ordering.orderedList(set, orderings);
        
        assertEquals(shouldBe0, orderedList.get(0));
        assertEquals(shouldBe1, orderedList.get(1));
        assertEquals(shouldBe2, orderedList.get(2));
        assertEquals(shouldBe3, orderedList.get(3));
        assertEquals(shouldBe4, orderedList.get(4));
        assertEquals(shouldBe5, orderedList.get(5));
    }
}
