package Test.TestSinglePattern;

import java.math.BigDecimal;

/**
 * @author 小潘
 * @create 2020-06-08-18:15
 */
public class TestHungry {
    public static void main(String[] args) {
        //直接实例化饿汉式
        /*Demo demo = Demo.DEMO;
        System.out.println(demo);*/

        //枚举式   枚举帮我们实现了tostring方法
        /*Demo2 demo2 = Demo2.DEMO_2;
        System.out.println(demo2);*/

        //静态代码块（适合复杂实例化）
        /*Demo3 demo3 = Demo3.DEMO_3;
        System.out.println(demo3);*/
    }

}
