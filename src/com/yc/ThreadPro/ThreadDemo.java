package com.yc.ThreadPro;

/**
 * @author 小潘
 * @create 2020-07-24-19:16
 */
//练习使用thread  实现线程
public class ThreadDemo extends Thread {

    private String name;

    public ThreadDemo(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println("服务员"+name);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new ThreadDemo("小白"+(i+1)).start();
        }

    }
}
