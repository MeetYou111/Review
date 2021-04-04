package com.yc.lambda.hanshuyinyong;

/**
 * @Author: XiaoPan
 * @CreateTime: 2020-11-30 18:13
 */

/*
    构造方法引用
 */
public class Lambda2 {
    private static class Person {
        String name;

        int age;

        public Person() {
            System.out.println("Person类无参构造方法执行了");
        }

        public Person(String name) {
            this.name = name;
            System.out.println("Person类有一个参数的构造方法执行了");
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("Person类有多个参数的构造方法执行了");
        }
    }

    private static interface GetPersonNoParameter {
        Person get();
    }
    private static interface GetPersonYesOneParameter {
        Person get(String name);
    }
    private static interface GetPersonYesNParameter {
        Person get(String name,int age);
    }

    public static void main(String[] args) {
        //使用lambda表达式的函数引用，实现无参接口
        GetPersonNoParameter getPerson = Person::new;
        //使用lambda表达式的函数引用，实现有单个参数的接口
        GetPersonYesOneParameter getPerson2 = Person::new;
        //使用lambda表达式的函数引用，实现有单个参数的接口
        GetPersonYesNParameter getPerson3 = Person::new;

        getPerson.get();
        getPerson2.get("小明");
        getPerson3.get("小红", 20);
    }
}
