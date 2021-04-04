package com.yc.lambda.InterfaceAll;

/**
 * @Author: XiaoPan
 * @CreateTime: 2020-11-29 13:31
 */
/*
    函数式接口方法的实现
    参数类型可以不写 为之实现精简
    如果只有一个参数，括号也可以省略"()"，如果木有参数必须加个括号
    如果表达式中只有一行语句，花括号也可以省略"{}",如果是返回值，必须省略return关键字，否则语法报错
 */
public class Demo {
    public static void main(String[] args) {
        //1. 实现无返无参的函数式接口
        NoReturnNoParameter rp1 = () -> {
            System.out.println("这是一个无参无返的方法");
        };
        rp1.test();

        //2.实现无返有参的函数式接口 可以省略类型、花括号
        NoReturnYesParameter rp2 = (a,b) -> System.out.println("这是一个无返有参数的方法，参数a:"+a+",b:"+b);
        rp2.test(1, 2);

        //3.实现有返无参的函数式接口
        YesReturnNoParameter rp3 = () -> {
            System.out.println("这是一个有返无参的方法");
            return 200;
        };
        int ret1 = rp3.test();
        System.out.println(ret1);

        //4.实现有返有参的函数式接口 可以省略类型、花括号、return
        YesReturnYesParameter rp4 = (a,b) -> a+b;
        int ret2 = rp4.test(100, 200);
        System.out.println(ret2);
    }
}
