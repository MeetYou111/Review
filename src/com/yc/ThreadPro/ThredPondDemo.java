package com.yc.ThreadPro;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 小潘
 * @create 2020-07-24-20:16
 */
/*
使用线程池的方式实现线程
 */
public class ThredPondDemo {

    private static int POOL_NUM = 10; //线程池数量

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < POOL_NUM; i++) {
            MyThreadPond runnable = new MyThreadPond();
            executorService.execute(runnable);
        }

        //关闭线程池
        executorService.shutdown();
    }
}
class MyThreadPond implements Runnable{

    @Override
    public void run() {
        System.out.println("通过线程池创建线程："+Thread.currentThread().getName()+"");
    }
}
