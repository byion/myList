package com.ion.task;

import java.util.*;

/**
 * Created by iieseanu on 3/20/2017.
 */
public class MyList implements List {

    public List data = new ArrayList();


    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public boolean contains(Object o) {
        return data.contains(o);
    }

    public Iterator iterator() {
        return data.iterator();
    }

    public Object[] toArray() {
        return data.toArray();
    }

    public boolean add(Object o) {
        return data.add(o);
    }

    public boolean remove(Object o) {
        return data.remove(o);
    }

    public boolean addAll(Collection c) {
        return data.addAll(c);
    }

    public boolean addAll(int index, Collection c) {
        return data.addAll(index, c);
    }

    public void clear() {
        data.clear();

    }

    public boolean equals(Object o) {
        return data.equals(o);
    }

    public int hashCode() {
        return data.hashCode();
    }

    public Object get(int index) {
        return data.get(index);
    }

    public Object set(int index, Object element) {
        return data.set(index, element);
    }

    public void add(int index, Object element) {
        data.add(index, element);

    }

    public Object remove(int index) {
        return data.remove(index);
    }

    public int indexOf(Object o) {
        return data.indexOf(o);
    }

    public int lastIndexOf(Object o) {
        return data.lastIndexOf(o);
    }

    public ListIterator listIterator() {
        return data.listIterator();
    }

    public ListIterator listIterator(int index) {
        return data.listIterator(index);
    }

    public List subList(int fromIndex, int toIndex) {
        return data.subList(fromIndex, toIndex);
    }

    public boolean retainAll(Collection c) {
        return data.retainAll(c);
    }

    public boolean removeAll(Collection c) {
        return data.removeAll(c);
    }

    public boolean containsAll(Collection c) {
        return data.containsAll(c);
    }

    public Object[] toArray(Object[] a) {
        return data.toArray(a);
    }
}
