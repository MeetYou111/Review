package com.yc.tips;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author: XiaoPan
 * @CreateTime: 2020-12-16 15:04
 */
public class getComputersMessage {
    public static void main(String[] args) throws UnknownHostException {
        //获取当前计算机的ip地址
        String ip = InetAddress.getLocalHost().getHostAddress();
        System.out.println(ip);

        //获取当前计算机的名称
        String name = InetAddress.getLocalHost().getHostName();
        System.out.println(name);
    }
}
