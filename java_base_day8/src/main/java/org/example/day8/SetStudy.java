package org.example.day8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetStudy {
    public static void main(String[] args){
        //时间复杂度O(1)
        Set<String> set = new HashSet<>();
        set.add("a");

        //时间复杂度O(1)
        Set<String> treeSet= new TreeSet<>();
        //时间复杂度O(log(n))
        treeSet.add("a");

    }
}
