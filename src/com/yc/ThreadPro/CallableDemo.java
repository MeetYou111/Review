package com.yc.ThreadPro;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author 小潘
 * @create 2020-07-24-20:05
 */
/*
实现Callable接口实现线程
 */
public class CallableDemo {
    public static void main(String[] args) {
        //开启多个线程
        /*MyCallable myCallable = new MyCallable();
        for (int i = 0; i < 5; i++) {
            FutureTask futureTask = new FutureTask(myCallable);
            new Thread(futureTask,"小白"+i).start();
        }*/

        //普通写法
        Callable callable = new MyCallable();
        FutureTask futureTask = new FutureTask(callable);
        Thread thread = new Thread(futureTask);
        thread.start();
    }
}

class MyCallable implements Callable{

    @Override
    public Object call() throws Exception {
        System.out.println("实现Callable接口的服务员"+Thread.currentThread().getName());
        return null;
    }
}
