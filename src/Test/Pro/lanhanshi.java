package Test.Pro;

/**
 * @author 小潘
 * @create 2020-08-03-2:14
 */
/*
 懒汉式写法
 */
public class lanhanshi {
    //私有构造器
    private lanhanshi(){

    }

    //私有的类 类型变量
    private static lanhanshi lanhanshi;

    //向外提供的接口
    public synchronized static lanhanshi getInstance(){
        if (lanhanshi == null)
            lanhanshi = new lanhanshi();
        return lanhanshi;
    }
}
