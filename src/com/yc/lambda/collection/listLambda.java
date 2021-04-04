package com.yc.lambda.collection;

import com.yc.lambda.entity.Person;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: XiaoPan
 * @CreateTime: 2020-12-16 18:58
 */
public class listLambda {
    public static void main(String[] args) {
        //ArrayList集合，类型为对象，进行排序 此效果为升序
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三", 12));
        list.add(new Person("李四", 20));
        list.add(new Person("王五", 18));
        list.add(new Person("赵六", 13));
        list.add(new Person("小七", 21));
        //底层实现了排序
        list.sort((o1,o2) -> o1.age - o2.age);
        list.forEach(System.out::println);

        System.out.println("-------------------");
        //ArrayList排序 此效果为降序
        List<String> list1 = new ArrayList<>();
        list1.add("12");
        list1.add("20");
        list1.add("18");
        list1.add("15");
        list1.sort((p1,p2) -> p2.compareTo(p1));
        list1.forEach(System.out::println);

        System.out.println("-------------------");
        //数组排序  此效果为降序
        String [] str = new String[]{"12","23","10","15","13"};
        //第二个参数可以进行指定升降序
        Arrays.sort(str,(String s1,String s2) -> s2.compareTo(s1));
        for (String s : str) {
            System.out.println(s);
        }

        System.out.println("-------------------");
        //LinkedList排序  此效果为降序
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(12);
        linkedList.add(20);
        linkedList.add(18);
        linkedList.add(15);
        Collections.sort(linkedList,(o1,o2) -> o2 - o1);
        linkedList.forEach(System.out::println);

        System.out.println("-------------------");
        //Vector排序 此效果为升序
        Vector<Person> vector = new Vector<>();
        vector.add(new Person("张三", 12));
        vector.add(new Person("李四", 20));
        vector.add(new Person("王五", 18));
        vector.add(new Person("赵六", 13));
        vector.add(new Person("小七", 21));
        vector.sort((o1,o2) -> o1.age - o2.age);
        vector.forEach(System.out::println);
        System.out.println("\n");

        System.out.println("去重");
        List<Person> people = new ArrayList<>();
        people.add(new Person("张三", 12));
        people.add(new Person("李四", 20));
        people.add(new Person("王五", 18));
        people.add(new Person("赵六", 13));
        people.add(new Person("小七", 21));
        people.add(new Person("小七2", 21));
        ArrayList<Person> collect = people.stream()
                .collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<Person>(Comparator.comparing(o -> o.age))), ArrayList::new));
        System.out.println(collect);

    }
}
