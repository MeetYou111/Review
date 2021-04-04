package com.yc.collectionMap.Set;

import com.yc.collectionMap.Set.Help.Student;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPro {
    public static void main(String[] args) {
        /*
        TreeSet 是Set接口下的 一个实现类
        底层数据结构是 红黑树
        保证元素的唯一性 和 顺序性
         */

        //！！！！！！！！用法和HashSet 基本上是一样的
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(2);
        ts.add(14);
        ts.add(4);
        ts.add(10);
        ts.forEach(System.out::println);

        System.out.println("======-==========");
        //存入对象时 treeset内部的排序不知道怎么排序，我们就可以使用自定义排序，
        //在对象类 实现Comparable 并且重写它的compareTo方法
        Set<Student> ts2 = new TreeSet<>();
        Student Student = new Student("张三",12);
        Student Student2 = new Student("李四四四",18);
        Student Student3 = new Student("王五五",15);
        Student Student4 = new Student("赵六六",16);
        ts2.add(Student);
        ts2.add(Student2);
        ts2.add(Student3);
        ts2.add(Student4);

        ts2.forEach(System.out::println);
        //Iterator it = ts2.iterator();
        //while (it.hasNext()){
        //    System.out.println(it.next());
        //}
    }
}
