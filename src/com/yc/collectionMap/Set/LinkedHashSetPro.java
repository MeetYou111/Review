package com.yc.collectionMap.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPro {
    public static void main(String[] args) {
        /*
        LinkedHashSet 是Set接口下的 实现类
        底层数据结构是 链表 和 哈希表
        链表保证了此集合的 顺序  哈希表保证了此集合的元素唯一性
         LinkedHashSet 继承了HashSet
         */
        //！！！！！用法和 HashSet 基本一样
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("张三");
        lhs.add("李四");
        lhs.add("王五");
        lhs.add("赵六");

        //特点就是 查出来的数据 是插入的顺序（先进先出（FIFO））
        Iterator it = lhs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
