package org.example.day8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapStudy {
    public static void main(String[] args){
        //学生姓名->学生学号
        Map<String, String> map = new HashMap<>();
        map.put("hanxu", "2020141210183");
        Integer stuNum = Integer.valueOf(map.get("小王"));
        System.out.println(stuNum);

        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> entry : set){
            System.out.println(entry.getKey() + ":" + entry.getKey());
        }
        System.out.println(map.getOrDefault("李诞","笑果文化"));

        Map<String, String> map1 = new LinkedHashMap<>();
        LinkedHashMap<String, String> map2 = new LinkedHashMap<>();

    }
}
