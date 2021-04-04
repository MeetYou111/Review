package com.yc.collectionMap.List;

import java.util.ArrayList;

public class ArrayListPro {
    public static void main(String[] args) {
        /*
        ArrayList 是list接口下的一个实现类
        底层是数组的数据结构
        在查找和遍历方面快，不适合插入和删除
        它是线程不安全的 不同步的
         */
        ArrayList al = new ArrayList();
        al.add("张三");
        al.add("李四");
        al.add("王五");

//        System.out.println(al.get(1));

        //会覆盖原有的元素
        al.set(1,"李四四");

        //清空元素
//        al.clear();

        //删除元素
        al.remove("张三");

        //根据下标删除
        al.remove(0);

        //判断是否为空
        System.out.println(al.isEmpty());
        //获取集合元素个数
        System.out.println(al.size());

        //迭代器遍历
       /* Iterator it = al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/

       //foreach遍历
        /*for (Object o : al) {
            System.out.println(o);
        }*/

        //for循环遍历
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

    }
}
