package com.yc.lambda.collection;

import com.yc.lambda.entity.Person;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @Author: XiaoPan
 * @CreateTime: 2020-12-17 22:18
 */
public class setLambda {
    public static void main(String[] args) {
        //使用lambda表达式给TreeSet进行排序输出 效果为倒序
        TreeSet<Person> treeSet = new TreeSet<>((o1, o2) -> {
            //如果数据里面有相同的值，则进行判断不返回0就可以避免被消除输出
            if (o1.age >= o2.age){
                return -1;
            }else{
                return 1;
            }
        });
        treeSet.add(new Person("张三", 12));
        treeSet.add(new Person("李四", 20));
        treeSet.add(new Person("王五", 18));
        treeSet.add(new Person("王五2", 18));
        treeSet.add(new Person("赵六", 13));
        treeSet.add(new Person("小七", 21));
        treeSet.forEach(System.out::println);
        System.out.println("==========================================");

        //使用lambda表达式给HashSet进行排序输出 效果为升序
        //有相同数据 在输出时，不会被排除
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(new Person("张三", 12));
        hashSet.add(new Person("李四", 20));
        hashSet.add(new Person("王五", 18));
        hashSet.add(new Person("王五2", 18));
        hashSet.add(new Person("赵六", 13));
        hashSet.add(new Person("小七", 21));
        hashSet.stream().sorted((o1,o2) -> o2.age - o1.age).forEachOrdered(System.out::println);
        System.out.println("==========================================");

        //使用lambda表达式给LinkedHashSet进行排序输出 效果为升序
        //有相同数据 在输出时，不会被排除
        LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new Person("张三", 12));
        linkedHashSet.add(new Person("李四", 20));
        linkedHashSet.add(new Person("王五", 18));
        linkedHashSet.add(new Person("王五2", 18));
        linkedHashSet.add(new Person("赵六", 13));
        linkedHashSet.add(new Person("小七", 21));
        linkedHashSet.stream().sorted((o1,o2) -> o1.age - o2.age).forEach(System.out::println);
    }
}
