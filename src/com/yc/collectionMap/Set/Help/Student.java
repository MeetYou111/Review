package com.yc.collectionMap.Set.Help;

/*
此实体类 是为了实现TreeSet 用自定义排序
 */
public class Student implements Comparable<Student>{
    private String name;

    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    //实现接口Comparable，并重写该接口的方法compareTo，该方法会定义排序规则。
    @Override
    public int compareTo(Student s) {
        // 排序规则描述如下
        // 按照姓名的长度排序,长度短的排在前面,长度长的排在后面
        // 如果姓名的长度相同，按字典顺序比较String
        // 如果姓名完全相同,按年龄排序,年龄小的排在前面,年龄大的排在后面
        int leng = this.name.length()-s.name.length();
        int name = leng == 0 ? this.name.compareTo(s.name) : leng;
        int age = name == 0 ? this.age - s.age : name;
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
