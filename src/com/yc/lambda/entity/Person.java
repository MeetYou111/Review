package com.yc.lambda.entity;

/**
 * @Author: XiaoPan
 * @CreateTime: 2020-12-16 17:13
 */
public class Person {
    public String name;

    public int age;

    public Person() {
        System.out.println("Person的无参构造执行了");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person的有参构造执行了");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
