package com.yc.collectionMap.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: XiaoPan
 * @CreateTime: 2020-09-03 3:06
 */
public class TreeMapPro {
    public static void main(String[] args) {
        /*
        TreeMap 是 实现Map 的实现类
        底层是 红黑树
        TreeMap中的元素是有序的，默认的排序规则是按照key的字典顺序升序排序。
        继承AbstractMap 实现NavigableMap(来V歌波 map)
         */
        TreeMap<String,String> tm = new TreeMap<String,String>();
        tm.put("1", "小张");
        tm.put("3", "小明呀");
        tm.put("2", "小红花朵");

        //用法和 hashmap基本一样


        Iterator<Map.Entry<String, String>> it = tm.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String, String> next = it.next();
            System.out.println(next.getKey()+" = "+next.getValue());
        }
    }
}
