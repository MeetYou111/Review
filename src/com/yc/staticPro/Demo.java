package com.yc.staticPro;

/**
 * @author 小潘
 * @create 2020-06-09-18:58
 */
/*
静态变量 和 非静态变量

静态变量属于类  非静态变量属于对象

被static修饰的属性是属于类的  实例化后 值也不会改变
而非静态属性则反之

被static修饰的方式 无需创建对象就可以用类名调用 则反之
 */
public class Demo {
    public static int staticInt = 0; //静态属性
    public int noStaticNum = 0; //非静态属性
    public static void main(String[] args) {
        Demo d = new Demo();
        d.staticInt++;
        d.noStaticNum++;
        System.out.println(d.staticInt);
        System.out.println(d.noStaticNum);

        Demo d2 = new Demo();
        System.out.println(d2.staticInt);
        System.out.println(d2.noStaticNum);

        d.staticInt++;
        d.noStaticNum++;
        Demo d3 = new Demo();
        System.out.println(d3.staticInt);
        System.out.println(d3.noStaticNum);
    }
    public static void say(){
        /*
            被static修饰的方法中不能拥有this 和 super

            此方法中只能调用静态的属性和方法
         */

    }
    public static void a(){//静态方法  say()方法可以调用此方法

    }
    public void b(){//非静态方法     则反之不能调用

    }
    
}
