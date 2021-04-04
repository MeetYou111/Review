package com.yc.singlePattern;

/**
 * @author 小潘
 * @create 2020-06-18-2:41
 */
/*
懒汉式写法
 */
public class weikongxiefa {
    private weikongxiefa(){

    }
    private static weikongxiefa weikongxiefa;
    public static synchronized weikongxiefa getInstance(){
        if (weikongxiefa == null){
            weikongxiefa = new weikongxiefa();
        }
        return weikongxiefa;
    }
}
