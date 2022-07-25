package org.example.day8;

import java.util.*;

public class Case {
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>(10);
        List<Integer> list2 = new ArrayList<>(20);
        for (int i = 1; i<10; i++){
            list1.add(new Random().nextInt(10));
        }
        for (int i =0 ; i<20; i++){
            list2.add(new Random().nextInt(10));
        }
        Set<Integer> set = new HashSet<>();
        set.addAll(list1);
        set.addAll(list2);
        System.out.println(set);


    }
}
