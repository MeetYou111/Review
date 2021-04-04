package com.yc.singlePattern.lazyPattern;

/**
 * @author 小潘
 * @create 2020-06-09-16:49
 */
/*
    懒汉式
        延迟创建这个实例对象

    1.构造器私有化
    2.用一个静态变量保存这个唯一的实例
    3.提供一个静态方法。获取这个实例对象

    有线程安全问题
 */
public class lpDemo {
    private static lpDemo lpDemo;
    private lpDemo(){

    }

    public static lpDemo getInstance(){
        synchronized (lpDemo.getClass()){ //保证线程安全的方法
            if (lpDemo == null){
                try { //休眠一个线程
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lpDemo = new lpDemo();
            }
        }
        return lpDemo;
    }
}
