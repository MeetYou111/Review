package com.yc.singlePattern;

/**
 * @author 小潘
 * @create 2020-06-08-17:52
 */
/*          ----最简单的写法
    在类运行的时候直接常见实例对象
    ---直接实例化饿汉式（简洁直观）----
    直接创建实例对象，不管你是否需要这个对象
    1.构造器私有化
    2.自行创建,并且用静态变量保存
    3.向外提供这个实例
    4.强调这是一个单例，我们可以用final修饰一下

 */
public class Demo {
    //向外直接暴露这个实例对象的变量
    public static final Demo DEMO= new Demo();
    private Demo(){

    }
}
