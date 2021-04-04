package com.yc.ReflectMechanism;


import java.lang.reflect.Method;

/**
 * @author 小潘
 * @create 2020-06-09-16:10
 */
public class reflectDemo {

    class a {

        public void say(){
            System.out.println("你好");
        }
    }
    class b extends a {

        public void sub(){
            System.out.println("我不好");
        }
    }
    public static void main(String[] args) throws Exception {
        /*
        反射有三种方法
            Class.forName();    类名.Class    对象.getClass();
         */
        Class<?> aClass = Class.forName("com.yc.ReflectMechanism.reflectDemo$b");
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        System.out.println(reflectDemo.class.getSimpleName()+"---");

    }
}
