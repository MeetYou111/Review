package com.yc.designMode.DailiPro;

/**
 * @author 小潘
 * @create 2020-07-25-19:27
 */
/*
代理模式
 */
public class dailiDemo {
    public static void main(String[] args) {
        Sourceable sourceable = new Proxy();
        sourceable.method();
    }
}
