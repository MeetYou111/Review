package com.yc.collectionMap.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author: XiaoPan
 * @CreateTime: 2021-01-12 9:51
 */
public class 复习遍历 {
    public static void main(String[] args) {
        HashMap<String,Object> map = new HashMap<>();
        map.put("one", "张三");
        map.put("two", 12);
        map.put("four", 78);
        map.put("three", "李四");

        //java8独有的写法 简单明了
        map.forEach((k,v) -> System.out.println("key = "+k+" value = "+v));
        System.out.println("--------------------");

        //通过keyset 使用for遍历
        for (String key:map.keySet()){
            System.out.println("key = "+key+" value = "+map.get(key));
        }

        System.out.println("----------------------");
        //通过entryset 配合iterator  遍历
        Iterator<Map.Entry<String,Object>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Object> entry = iterator.next();
            System.out.println("key = "+entry.getKey()+" value = "+entry.getValue());
        }

        System.out.println("---------------");
        //通过entryset 使用foreach循环
        for (Map.Entry<String,Object> entry : map.entrySet()){
            System.out.println("key = "+entry.getKey()+" value = "+entry.getValue());
        }

        System.out.println("--------------------");
        //这种方式只能遍历value值
        for (Object str : map.values()){
            System.out.println(str);
        }
    }
}
