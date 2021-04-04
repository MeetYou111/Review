package com.yc.lambda.collection;

import java.util.*;

/**
 * @Author: XiaoPan
 * @CreateTime: 2020-11-29 13:19
 */
/*
    使用lambda表达式遍历map集合
 */
public class MapLambda {
    public static void main(String[] args) {
        System.out.println("-----------在lambda中学习HashMap使用遍历和升降序--------");
        HashMap<String,String> hashMap = new HashMap();
        hashMap.put("3","12");
        hashMap.put("2","22");
        hashMap.put("1","15");
        ////使用KeySet的方式遍历
        System.out.println("-----------使用KeySet的方式遍历--------");
        hashMap.keySet().forEach(Key -> System.out.println("key = "+Key+" value = "+hashMap.get(Key)));
        System.out.println("--------------");

        //通过entryset遍历  在大容量时推荐使用
        System.out.println("-----------通过entryset遍历--------");
        hashMap.entrySet().forEach(entry -> System.out.println("key = "+entry.getKey()+" value = "+entry.getValue()));

        /*
        * forEach 和 forEachOrdered 的区别在于 foreach是并行处理，速度快，后者是按顺序处理
        * */
        System.out.println("-----------通过entryset遍历-以key为条件-进行排序-升序--------");
        hashMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(entry -> System.out.println("key = "+entry.getKey()+" value = "+entry.getValue()));
        System.out.println("-----------通过entryset遍历-以value为条件-进行排序-降序--------");
        hashMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(String::toString).reversed()))
                .forEach(entry -> System.out.println("key = "+entry.getKey()+" value = "+entry.getValue()));
        System.out.println("--------------");

        //通过entryset使用iteerator的方式迭代
        System.out.println("-----------通过entryset使用iteerator的方式迭代--------");
        hashMap.entrySet().iterator().forEachRemaining(item -> System.out.println("key = "+item.getKey()+" value = "+item.getValue()));
        System.out.println("--------------");

        //这种方式是java 8  独有的
        System.out.println("-----------直接通过foreach遍历-这种方式是java 8  独有的--------");
        hashMap.forEach((k,v) -> System.out.println("key = "+k+" value = "+v));

        //这种只能遍历value值
        System.out.println("-----------通过点values()方法遍历，但是只能遍历value值，着情使用--------");
        hashMap.values().forEach(System.out::println);
        System.out.println("\n");

        //hashtable 根据value值 进行升序
        System.out.println("-----------在lambda中学习Hashtable使用遍历和升降序--------");
        Hashtable<String,Integer> hashtable = new Hashtable<>();
        hashtable.put("张三", 14);
        hashtable.put("李四", 20);
        hashtable.put("王五", 17);
        hashtable.put("赵六", 15);
        hashtable.put("小七", 15);
        System.out.println("-----------通过entryset遍历-以value为条件-进行排序-升序--------");
        hashtable.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
        System.out.println("-----------通过entryset遍历-以value为条件-进行排序-降序--------");
        hashtable.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparingInt(Integer::intValue).reversed()))
                .forEachOrdered(entry -> {
                        System.out.println("key = "+entry.getKey()+" value = "+entry.getValue());
                });
        System.out.println("\n");

        System.out.println("-----------在lambda中学习LinkedHashMap使用遍历和升降序--------");
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("张三", 14);
        linkedHashMap.put("李四", 20);
        linkedHashMap.put("王五", 17);
        linkedHashMap.put("赵六", 15);
        linkedHashMap.put("小七", 15);
        System.out.println("-----------使用KeySet的方式遍历--------");
        linkedHashMap.keySet().forEach(key -> System.out.println("key = "+ key +" value = "+linkedHashMap.get(key)));
        System.out.println("-----------使用entrySet的方式遍历-以value为条件-进行排序-升序-------");
        linkedHashMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println("key = "+entry.getKey()+" value = "+entry.getValue()));
        System.out.println("-----------使用entrySet的方式遍历-以value为条件-进行排序-降序-------");
        linkedHashMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparingInt(Integer::intValue).reversed()))
                .forEach(entry -> System.out.println("key = "+entry.getKey()+" value = "+entry.getValue()));
        System.out.println("-----------使用entrySet方法通过迭代器遍历-------");
        linkedHashMap.entrySet().iterator().forEachRemaining(item -> System.out.println("key = "+item.getKey()+" value = "+item.getValue()));
        System.out.println("-----------直接通过foreach遍历-这种方式是java 8  独有的--------");
        linkedHashMap.forEach((k,v) -> System.out.println("key = "+k+" value ="+v));
        System.out.println("\n");

        System.out.println("-----------在lambda中学习LinkedHashMap使用遍历和升降序--------");
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("张三", 14);
        treeMap.put("李四", 20);
        treeMap.put("王五", 17);
        treeMap.put("赵六", 15);
        treeMap.put("小七", 15);
        System.out.println("-----------使用KeySet的方式遍历--------");
        treeMap.keySet().forEach(key -> System.out.println("key = "+key+" value = "+treeMap.get(key)));
        System.out.println("-----------使用entrySet的方式遍历-以value为条件-进行排序-升序-------");
        treeMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(key -> System.out.println("key = "+key.getKey()+" value = "+key.getValue()));
        System.out.println("-----------使用entrySet的方式遍历-以value为条件-进行排序-降序-------");
        treeMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparingInt(Integer::intValue).reversed()))
                .forEachOrdered(key -> System.out.println("key = "+key.getKey()+" value = "+key.getValue()));
    }
}
