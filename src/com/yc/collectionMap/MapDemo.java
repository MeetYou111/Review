package com.yc.collectionMap;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author 小潘
 * @create 2020-06-15-2:06
 */
public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("年龄","20");
        hashMap.put("年龄","21");
        hashMap.put("11","222");
        //使用KeySet的方式遍历
        for (String key:hashMap.keySet()){
            System.out.println("key="+key+" value="+hashMap.get(key));
        }
        //通过Map.EntrySet使用iterator的方式遍历  适合在大量数据的时候
        for (java.util.Map.Entry<String,String> entry:hashMap.entrySet()){
            System.out.println("key="+entry.getKey()+" value="+entry.getValue());
        }

        //通过Map.entrySet使用Iterator遍历
        Iterator<java.util.Map.Entry<String,String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            java.util.Map.Entry<String,String> entry = iterator.next();
            System.out.println("key="+entry.getKey()+" value="+entry.getValue());
        }

        //这种是遍历所有value  不能遍历出来key
        for (String value:hashMap.values()){
            System.out.println("value="+value);
        }
    }
}
