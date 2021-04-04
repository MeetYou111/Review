package com.yc.ReflectMechanism.entity;

public class Student implements MyInterface,MyInterface2{

    private int id;

    private String name;

    private int age;

    //public公共属性
    public int a;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static void staticMethod(){
        System.out.println("static方法");
    }



    private void parivetMenthod(){
        System.out.println("一个私有的方法");
    }

    @Override
    public void MyInterfaceOne() {
        System.out.println("MyInterfaceOne---接口的方法");
    }

    @Override
    public void MyInterfaceTwo() {
        System.out.println("MyInterfaceTwo---接口的方法");
    }

    private void parameterMethod(String value){
        System.out.println("这是一个带参数的方法 "+value);
    }

    //私有的构造方法
    private Student(int id,String name){
        this.id=id;
        this.name=name;
    }


}
