package com.ion.task;

import java.util.*;

/**
 * Created by iieseanu on 3/21/2017.
 */
public class MyListImpl implements List {

    public MyListImpl(int capacity) {
        this.capacity = capacity;
    }

    public MyListImpl() {
    }

    private int capacity = 128;
    private Object[] array = new Object[capacity];

    private int lastIndex = 0;

    public int size() {
        return lastIndex;
    }

    public boolean isEmpty() {
        if (lastIndex == 0)return true;
        return false;
    }

    public boolean contains(Object o) {
        boolean exist =false;

        for (int i=0; i<lastIndex; i++) {
            if (array[i].equals(o)){
                exist=true;
                break;
            }
        }


        return exist;
    }

    public Iterator iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public boolean add(Object o) {
        boolean succes = false;

        if (lastIndex == array.length) {
            int newCapacity = (array.length * 3) / 2 + 1;
            Object[] tempArray = new Object[newCapacity];        // Arrays.copyOf(array, array.length + newCapacity);
            System.arraycopy(array, 0, tempArray, 0, array.length);
            array = tempArray;
        }

        array[lastIndex] = o;
        lastIndex++;
        succes = true;

        return succes;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public boolean addAll(int index, Collection c) {
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        if (index >= 0 && index < lastIndex) {


            return array[index];
        } else {
            return null;
        }
    }


    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        Object returnObject = array[index];
        System.out.println(returnObject);
        Object[] beforeArray = Arrays.copyOfRange(array, 0, index);
        Object[] afterArray = Arrays.copyOfRange(array, index + 1, array.length);
        Object[] rezult = concat(beforeArray, afterArray);


        array = rezult;
        lastIndex--;
        return returnObject;


    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator listIterator() {
        return null;
    }

    public ListIterator listIterator(int index) {
        return null;
    }

    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public String toString() {
        return "MyListImpl{" +
                "array=" + Arrays.toString(array) +
                '}'+"capacity: "+capacity;
    }

    public Object[] concat(Object[] a, Object[] b) {
        int aLen = a.length;
        int bLen = b.length;
        Object[] c = new Object[aLen + bLen];
        System.arraycopy(a, 0, c, 0, aLen);
        System.arraycopy(b, 0, c, aLen, bLen);
        return c;
    }
}
