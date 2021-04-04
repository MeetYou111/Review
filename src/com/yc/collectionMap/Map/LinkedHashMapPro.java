package com.yc.collectionMap.Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: XiaoPan
 * @CreateTime: 2020-09-03 2:49
 */
public class LinkedHashMapPro {
    public static void main(String[] args) {
        /*
        LinkedHashMap 是Map接口下的一个实现类
        继承于 HashMap ，实现 Map
        底层是数组 + 双向链表
        特点是 遍历出来 是 插入的顺序，即先进先出(FIFO)
         */
        LinkedHashMap<String,String> lhm = new LinkedHashMap<String,String>();
        lhm.put("one", "王五五");
        lhm.put("two", "李四");
        lhm.put("three", "张三");

        Iterator<Map.Entry<String,String>> iterator = lhm.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        for (String key : lhm.keySet()){
            System.out.println("key = "+key+",value = "+lhm.get(key));
        }
    }
}
