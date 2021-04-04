package com.yc.designMode.DailiPro;

/**
 * @author 小潘
 * @create 2020-07-25-19:33
 */
public class Proxy implements Sourceable {
    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        atfer();

    }

    private void atfer(){
        System.out.println("在...之后");
    }

    private void before(){
        System.out.println("在...之前");
    }
}
