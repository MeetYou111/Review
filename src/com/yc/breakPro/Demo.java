package com.yc.breakPro;

/**
 * @author 小潘
 * @create 2020-06-09-18:31
 */
public class Demo {
    public static void main(String[] args) {
        out:
        while (true){
            while (true){
                while (true){
                    System.out.println("1");
                    break out;
                }
            }
        }


    }
}
