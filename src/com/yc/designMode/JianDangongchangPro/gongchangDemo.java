package com.yc.designMode.JianDangongchangPro;

/**
 * @author 小潘
 * @create 2020-07-25-17:25
 */
/*
工厂模式 ，  一个类可以实现多个产品对象
1.公共的接口
2.不一样的产品实现公共的接口
3.生产工厂类
 */
public class gongchangDemo {
    public static void main(String[] args) {
        /*PublicJiekou lanbojini = plant.getqiche("lanbojini");
        lanbojini.openWhatCar();*/

        //多个工厂模式
        //plant.getmaikailun().openWhatCar();

        //抽象工厂模式
        PubliJiekouTwo lanbojiniGC = new lanbojiniGC();
        PublicJiekou produce = lanbojiniGC.produce();
        produce.openWhatCar();
    }

}
//生产工厂类
class plant{
    //简单工厂模式
   /* public static PublicJiekou getqiche(String type){
        if (type.equals("lanbojini")){
            return new OpenLanbojini();
        }else if (type.equals("kenisaige")){
            return new OpenKenisaige();
        }else{
            System.out.println("你没车，开拖拉机吧");
            return null;
        }
    }*/

   //多个工厂模式  (加上static就是静态工厂模式，不需要实例工厂类)
   public static PublicJiekou getlanbojini(){
       return new OpenLanbojini();
   }
   public static PublicJiekou getkenisaige(){
       return new OpenKenisaige();
   }
   public static PublicJiekou getmaikailun(){
       return new OpenMaikailun();
   }
}

/*-------------------------*/
/*
    抽象工厂模式
    1.新增一个接口，产品工厂类变成一个一个的新接口的实现类

    这样写的好处就是 不需要更改原先的代码文件
    当我们要新增一个功能的时候，只需做一个实现类，实现publicjiekou，在做一个工厂类，实现publicjiekoutwo
    这样做 扩展性好
 */

// 以下都是产品工厂类实现新接口
class lanbojiniGC implements PubliJiekouTwo{

    @Override
    public PublicJiekou produce() {
        return new OpenLanbojini();
    }
}
class kenisaigeGC implements PubliJiekouTwo{

    @Override
    public PublicJiekou produce() {
        return new OpenKenisaige();
    }
}
class maikailunGC implements PubliJiekouTwo{

    @Override
    public PublicJiekou produce() {
        return new OpenMaikailun();
    }
}
