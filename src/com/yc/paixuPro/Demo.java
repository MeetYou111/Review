package com.yc.paixuPro;

/**
 * @author 小潘
 * @create 2020-06-18-2:49
 */
/*
冒泡排序
 */
public class Demo {
    public static void main(String[] args) {
        
        int [] ary = new int[]{4,1,3,5,2,-0,100};
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary.length-1; j++) { // 内部循环 只是判断 相邻的 两个元素，所有内部循环完，还要在循环六（元素六个）遍 ，才能保证实现
                if (ary[j] > ary[j+1]){ //判断第一位元素是否大于 第二位元素
                    // 进行转换
                    int count = ary[j];// 把第一位元素 赋入 新的变量里
                    ary[j] = ary[j+1]; // 把 第二元素 放到第一位
                    ary[j+1] = count;// 把新的变量里的 元素放入第二位
                }
            }
        }
        //遍历结果
        for (int i : ary) {
            System.out.println(i);
        }
    }
}
