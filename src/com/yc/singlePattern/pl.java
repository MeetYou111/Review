package com.yc.singlePattern;

/**
 * @author 小潘
 * @create 2020-06-18-2:35
 */

/*
饿汉式写法
1、类加载 时，就实例对象
2、构造器私有化
3、提供一个 唯一对外暴露的接口 （方法）

 */
public class pl {
    private static pl pl = new pl();
    private pl(){

    }
    public static pl getInstance(){
        return pl;

    }
}
