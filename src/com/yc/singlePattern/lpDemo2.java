package com.yc.singlePattern;

/**
 * @author 小潘
 * @create 2020-06-09-16:49
 */
/*
--静态内部类形式----- 最好用
    在内部类加载和初始化时，才创建INSTANCE实例对象
    静态内部类不会自动随着外部类的加载和初始化而初始化，它是单独去加载和初始化的
    因为是在内部类加载和初始化时创建的，因此是线程安全的
 */
public class lpDemo2 {

    private lpDemo2(){

    }
    private static class Inner{
        private static final lpDemo2 INSTANCE = new lpDemo2();
    }

    public static lpDemo2 getInstance(){
        return Inner.INSTANCE;
    }
}
