package com.ion.task;

/**
 * Created by iieseanu on 3/21/2017.
 */
public class TestMyList {

    public static void main(String[] args) {

        MyListImpl list = new MyListImpl();
        System.out.println(list.size());
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }
        System.out.println(list.toString());
        System.out.println(list.size());
        list.remove(4);
        System.out.println(list.toString());
        System.out.println(list.size());
        System.out.println("Is empty : "+list.isEmpty());
        System.out.println("Contains : "+list.contains(12));


    }


}
