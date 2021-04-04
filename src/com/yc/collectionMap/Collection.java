package com.yc.collectionMap;

import java.util.*;

/**
 * @author 小潘
 * @create 2020-06-13-18:49
 */
public class Collection {
    public static void main(String[] args) {
        /*
        Vector 去重方法
         */
        Vector vector = new Vector();
        vector.add("1");
        vector.add("2");
        vector.add("3");
        vector.add("4");
        vector.add("4");
        vector = getNewVector(vector);
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        /*
            测试HashSet 是否不重复 以及使用迭代器的方式打印
         */
        System.out.println("****");
        HashSet hashSet = new HashSet();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("4");
        hashSet.add("4");
        Iterator it = hashSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }






    private static Vector getNewVector(Vector vector){
        Vector vector1 = new Vector();
        for (int i = 0; i < vector.size(); i++) {
            String str = (String) vector.get(i);
            if (!vector1.contains(str)) {
                vector1.add(vector.get(i));
            }
        }
        return vector1;
    }




}
