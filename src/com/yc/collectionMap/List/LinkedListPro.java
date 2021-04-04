package com.yc.collectionMap.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPro {
    public static void main(String[] args) {
        /*
        LinkedList 是list接口下的一个实现类
        底层数据结构是 链表结构
        在插入和删除方面快，而在查询和遍历方面慢，因为在获取一个元素时，需要从头到尾一个一个检索查询
        它是线程不安全的 不同步的
         */
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(6);
        ll.add(5);

        //用法和ArrayList基本一样

        for (Object o : ll) {
            System.out.println(o);
        }
        System.out.println("------------");
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));

        }
        System.out.println("------------");
        Iterator it = ll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
