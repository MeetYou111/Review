package com.yc.collectionMap.List;

import java.util.Vector;

/**
 * @Author: XiaoPan
 * @CreateTime: 2020-09-03 1:05
 */
public class VectorPro {
    public static void main(String[] args) {
        /*
        Vector 也是list接口下的一个实现类
        底层也是 数组结构
        但是它是线程安全的 同步的
        （在使用Vector时，你会发现很多方法都有synchronized关键字）
         */

        Vector vt = new Vector();
        vt.add("张三");
        vt.add("李四");
        vt.add("王五");

        // 其它用法和ArrayList基本一致

        System.out.println(vt.size());

        for (Object o : vt) {
            System.out.println(o);
        }
    }
}
