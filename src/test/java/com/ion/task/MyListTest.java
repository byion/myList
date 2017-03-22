package com.ion.task;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by iieseanu on 3/21/2017.
 */
public class MyListTest {

    MyList list = new MyList();

    @Before
    public void setUp() throws Exception {
        list.data.add(8);
        list.data.add(3);
        list.data.add(5);


    }


    @After
    public void tearDown() throws Exception {
        list.data.clear();

    }

    @Test
    public void testSize() throws Exception {
        assertEquals(3, list.size());


    }

    @Test
    public void testIsEmpty() throws Exception {
        assertFalse(list.isEmpty());
    }

    @Test
    public void testContains() throws Exception {
        assertTrue(list.contains(8));
    }

    @Test
    public void testIterator() throws Exception {
        assertEquals(8, list.iterator().next());
    }

    @Test
    public void testToArray() throws Exception {
        Object[] numbers = {8, 3, 5};
        assertArrayEquals(numbers, list.toArray());
    }


    @Test
    public void testAdd() throws Exception {
        assertTrue(list.add(5));
    }

    @Test
    public void testRemove() throws Exception {

        assertTrue(list.remove((Object) 8));
    }

    @Test
    public void TestAddAll() throws Exception {
        List a = new ArrayList();
        a.add(4);
        assertTrue(list.addAll(a));
    }

    @Test
    public void TestAddAll_AtIndex() throws Exception {
        List a = new ArrayList();
        a.add(4);
        list.addAll(0, a);
    }

    @Test
    public void TestClear() throws Exception {
        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    public void TestEquals() throws Exception {
        List a = new ArrayList();
        a.add(4);

        assertFalse(list.equals(a));
    }

    @Test
    public void testHashCode() throws Exception {
        List a = new ArrayList();
        a.add(4);
        assertNotSame(a.hashCode(), list.hashCode());
    }

    @Test
    public void testGet() throws Exception {
        assertEquals(8, list.get(0));
    }

    @Test
    public void testSet() throws Exception {
        list.set(1, 4);
        assertEquals(4, list.get(1));
    }

    @Test
    public void testAdd_AtIndex() throws Exception {
        list.add(2, 5);
        assertEquals(5, list.get(2));

    }

    @Test
    public void testRemove_AtIndex() throws Exception {
        list.remove(0);
        assertEquals(2, list.size());
    }

    @Test
    public void TestIndexOf() throws Exception {
        assertEquals(0, list.indexOf(8));
    }

    @Test
    public void testLastIndexOf() throws Exception {
        assertEquals(0, list.lastIndexOf(8));
    }

    @Test
    public void testListIterator() throws Exception {
        assertEquals(8, list.listIterator().next());
    }

    @Test
    public void testListIterator_AtIndex() throws Exception {
        assertEquals(3, list.listIterator(1).next());
    }

    @Test
    public void testSubList() throws Exception {
        Object[] array = {3,5};
        assertArrayEquals(array,list.subList(1,3).toArray());
    }

    @Test
    public void testRetainAll() throws Exception {
        Object[] array = {3,5};
        list.retainAll(Arrays.asList(array));
        assertArrayEquals(array, list.toArray());
    }

    @Test
    public void testRemoveAll() throws Exception {
        Object[] array = {3,5};
        Object[] arrayExpect ={8};
        list.removeAll(Arrays.asList(array));
        assertArrayEquals(arrayExpect, list.toArray());
    }

    @Test
    public void testContainsAll() throws Exception {
        Object[] array = {3,5};
        assertTrue(list.containsAll(Arrays.asList(array)));
    }

    @Test
    public void testToArray_WithAnArrayAsArgument() throws Exception {
        Object[] array = {3,5,6};
        Object[] arrayResult = list.toArray(array);
        assertArrayEquals(array,arrayResult );
    }

}