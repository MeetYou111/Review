package com.yc.ThreadPro;

/**
 * @author 小潘
 * @create 2020-07-24-19:22
 */
/*
实现Runnable接口实现线程
 */
public class RunnableDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new MyRunnable(),"小白"+i).start();
        }

    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("实现Runnable接口的服务员"+Thread.currentThread().getName());
    }
}

