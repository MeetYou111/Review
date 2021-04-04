package com.yc.collectionMap.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPro {
    public static void main(String[] args) {
        /*
        HashSet 是set接口下常用的实现类
        底层是哈希表数据结构
        它的数据是唯一的
         */
        HashSet<String> hs = new HashSet<>();

        hs.add("湖南");
        hs.add("上海");
        hs.add("北京");
        hs.add("广东");
        //lambda表达式删除
        hs.removeIf(a -> a == "湖南");
        hs.forEach(System.out::println);
        //新增一样的数据，是无法新增进去的
        hs.add("湖南");
        //没有获取指定数据的方法，也没有修改元素的方法

        //获取元素个数的方式
        System.out.println(hs.size());

        //删除指定数据
        hs.remove("上海");

        //判断是否为空
        System.out.println(hs.isEmpty());

        //遍历
        //迭代器遍历
        Iterator it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //foreach遍历
        for (String h : hs) {
            System.out.println(h);
        }


        //清空数据
        hs.clear();

    }
}
