package Test.Pro;

/**
 * @author 小潘
 * @create 2020-08-03-1:35
 */
/*
    单例模式  之  饿汉式写法
饿汉式 也就是 很饿 很急
类一旦被使用 就急着创建实例对象
 */
public  class ehanshi {
    //当类加载时 就创建对象
    private static final ehanshi EHANSHI = new ehanshi();

    //构造器 私有化
    private ehanshi(){
    }

    //提供一个对外唯一暴露的接口（方法）
    public static ehanshi getInstance(){
        return EHANSHI;
    }
}
