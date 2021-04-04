package com.yc.collectionMap.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author: XiaoPan
 * @CreateTime: 2020-09-03 1:21
 */
public class HashMapPro {
    public static void main(String[] args) {
        /*
        HashMap 是Map接口下的一个实现类，最常用
        底层是 数组+单向链表 的数据结构，但是在java1.8用来红黑树，当然也是有条件的，当链表的长度大于8时，便会由链表转换成红黑树
        继承 于 AbstractMap（啊波丝jua克特Map），实现于 Map
         */
        HashMap<String,String> hm = new HashMap();
        hm.put("one", "张三");
        hm.put("two", "李四");
        hm.put("three", "王五");

        //添加相同的key  会覆盖原先的value
        //hm.put("one", "张三三");
        //添加相同value，不会覆盖原先的value
        //hm.put("four", "张三");

        /*System.out.println("-----批量添加-----");
        HashMap<String,String> hm2 = new HashMap<String,String>();
        hm2.put("1", "a");
        hm2.put("2", "b");
        HashMap<String,String> hm3 = new HashMap<String,String>();
        hm3.putAll(hm2);
        for (String key : hm3.keySet()){
            System.out.println(key+"-"+hm3.get(key));
        }*/

        //获取元素 根据key获取对应的value
        System.out.println(hm.get("one"));

        //当key为空时，可以自定义确认一个key和value
        System.out.println(hm.getOrDefault("five", "赵六"));

        //获取集合元素个数
        System.out.println(hm.size());

        //删除元素 两种方式
        //hm.remove("one");
        //hm.remove("one","张三");

        //修改元素
        hm.replace("one", "张三3");

        //判断是否为空
        System.out.println(hm.isEmpty());

        System.out.println("----------hashmap遍历四种方式------------");

        //使用 keySet 遍历
        for (String key : hm.keySet()){
            System.out.println(key+"-"+hm.get(key));
        }
        System.out.println("-----------");
        //通过entrySet用 iterator遍历
        Iterator<Map.Entry<String,String>> iterator = hm.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey()+"-"+next.getValue());
        }
        /*使用增强版for循环
        for (iterator = hm.entrySet().iterator();iterator.hasNext();){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey()+"-"+next.getValue());
        }*/
        System.out.println("-----------");
        //通过entrySet用 foreach遍历
        for (Map.Entry<String,String> entry : hm.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
        System.out.println("------------");
        //这种方式无法遍历key，只可以遍历value值，在只需要value时，可以使用，简单快捷
        for (String va : hm.values()){
            System.out.println(va);
        }
    }
}
