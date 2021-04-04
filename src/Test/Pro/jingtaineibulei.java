package Test.Pro;

/**
 * @author 小潘
 * @create 2020-08-03-1:26
 */
/*
 静态内部类策略好用
因为内部类 不会随着外部类的初始化而初始化
只有当使用内部类的时候 才会进行初始化和实例对象
也是线程安全的  因为是内部类
 */
public class jingtaineibulei {
    //私有的构造器
    private jingtaineibulei(){

    }

    //定义静态内部类
    private static class Inner{
        //实例对象 创建对象
        private static final jingtaineibulei JINGTAINEIBULEI = new jingtaineibulei();
    }

    //提供对外唯一暴露的接口
     public static jingtaineibulei getInstance(){
        return Inner.JINGTAINEIBULEI;
    }

}
