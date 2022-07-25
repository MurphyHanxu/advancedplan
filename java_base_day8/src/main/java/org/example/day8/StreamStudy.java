package org.example.day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamStudy {
    public static void main(String[] args){

        List<Integer> list1 = new ArrayList<>(20);
        for (int i = 0; i<10; i++){
            list1.add(new Random().nextInt(10));
        }


        //stream遍历
        list1.stream().forEach(o->{
            Integer i = o + 1;
            System.out.println(i);
        });

        //排序
        list1.stream()
                .sorted(((o1, o2) -> o1 - o2))
                .filter(o -> o > 1)
                .distinct()
                .forEach(o->{
                    System.out.println(o);
                });

        //map
        Set<Integer> set2 = list1.stream().map(o->{
            return o+1;
        }).collect(Collectors.toSet());




    }

}
