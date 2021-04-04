package com.yc.designMode;

/**
 * @author 小潘
 * @create 2020-07-25-17:03
 */
/*
单列模式，就是一个类只能实例一次
 */
public class danlieDemo {
    // 用来保存保存实例对象 (也可以不赋值为null，赋了null是为了延迟加载)
    private static danlieDemo instance = null;

    //构造器私有化
    private danlieDemo() {

    }

    //创建一个方法 用来创建对象以及返回对象
    /*
    这种单例模式 放入多线程里 肯定会出问题，所以我们加上synchronized
     */
    public static synchronized danlieDemo getInstance(){
        // 如果instance 为空 就说明还未创建对象
        if (instance == null){
            //创建对象
            instance = new danlieDemo();

        }
        //如果有实例了 即返回对象
        return instance;
    }

    public static void main(String[] args) {
        danlieDemo s1 = danlieDemo.getInstance();
        danlieDemo s2 = danlieDemo.getInstance();
        //使用的是用一个对象，地址一样的，输出true
        System.out.println(s1==s2);
        //重新new 了对象 地址不一样 ，输出false
        danlieDemo s3 = new danlieDemo();
        System.out.println(s2==s3);
    }
}
