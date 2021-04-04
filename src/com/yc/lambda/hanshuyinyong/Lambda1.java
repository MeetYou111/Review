package com.yc.lambda.hanshuyinyong;

/**
 * @Author: XiaoPan
 * @CreateTime: 2020-11-30 17:05
 */
/*
     函数式引用
    语法： 类::静态方法
    注意事项：   想引用的方法后面不要加括号，否则就是方法的调用而不是引用了
                 引用的这个方法、参数数量、参数类型、返回值类型，必须要跟接口中定义的方法一样!

 */
public class Lambda1 {
    private static interface Calculate {
        int calculateSay(int a,int b);
    }

    private static int calculateSa(int x,int y){
        if (x > y){
            return x - y;
        } else if (x < y){
           return y - x;
        }
        return x + y;
    }

    public static void main(String[] args) {
        //静态方法 函数式引用
        // ：：引用接口中的方法，方法名相同，参数类型相同，返回类型相同，因此达到引用
        Calculate calculate = Lambda1::calculateSa;
        System.out.println(calculate.calculateSay(10, 10));

        //非静态方法引用 ，只要把上面的calculateSa方法改成非静态,下面通过new 类名就可以了
        /*Calculate calculate2 = new Lambda1()::calculateSa;
        System.out.println(calculate.calculateSay(10, 10));*/
    }
}
