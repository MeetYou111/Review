package com.yc.tips;

/**
 * @Author: XiaoPan
 * @CreateTime: 2020-12-16 15:10
 */
public class Demo {

    public static int test(int count){
        System.out.println("count的值为:"+count);
        if (count == 1){
            System.out.println("----------结束-----------");
            return count;
        } else {
            return count*test(count-1);
        }
    }

    public static void main(String[] args) {
        int count = test(5);
        System.out.println("count返回的值为："+count);
    }
}
