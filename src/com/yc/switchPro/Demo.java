package com.yc.switchPro;

/**
 * @author 小潘
 * @create 2020-06-10-17:13
 */
/*

    float double long 不支持  需要转化成int

    支持int,byte,short,char类型
      java7中支持String
      支持原理：通过对case后的String对象调用hashcode()方法，得到一个int类型的hash值
        然后用这个hash值来标识case。
 */
public class Demo {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        String num = sc.next();
        switch (num){
            case "1":
                System.out.println("1");
                break;
            case "2":
                System.out.println("2");
                break;
        }*/

    }
}
