package com.yc.collectionMap.Map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author: XiaoPan
 * @CreateTime: 2020-09-03 2:33
 */
public class HashTablePro {
    public static void main(String[] args) {
        /*
        HashTable 是Map接口下的 一个实现类
        底层也是 数组 加 单向链表的数据结构
        继承于 Dictionary(滴克寻奥瑞)，实现于 Map
        特点是 它的方法是 同步的 也是 线程安全的（）
         */
        Hashtable<String,String> ht = new Hashtable<String,String>();
        ht.put("one", "张三");
        ht.put("two", "李四");
        ht.put("three", "王五");

        //其它用法和 HashMap 基本一样

        //通过entrySet 使用迭代器遍历
        Iterator<Map.Entry<String,String>> it = ht.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String, String> next = it.next();
            System.out.println(next.getKey()+"-"+next.getValue());
        }
    }
}
