package com.yc.singlePattern;

import java.io.IOException;
import java.util.Properties;

/**
 * @author 小潘
 * @create 2020-06-08-18:19
 */
/*
    --静态代码块（适合复杂实例化）
    比如要查出文本文件里的数据
 */
public class Demo3 {
    public static final Demo3 DEMO_3;
    private String info;
    static{
        try {
            Properties pro = new Properties();
            pro.load(Demo3.class.getClassLoader().getResourceAsStream("single.properties"));
            DEMO_3 = new Demo3(pro.getProperty("info"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private Demo3(String info){
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Demo3{" +
                "info='" + info + '\'' +
                '}';
    }
}
