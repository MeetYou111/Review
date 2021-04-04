package com.yc.ReflectMechanism.test;


import com.yc.ReflectMechanism.entity.Student;

import java.awt.print.Book;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Properties;

//反射的三种方式  Class.forName();   类名.Class;   对象.getClass();
public class reflect {


    public static void main(String[] args) throws Exception {
        //通过反射获取类
        //reflectClass();

        //通过反射获取公共方法
        //reflectMethod();

        //获取当前类的所有方法
        //getThisMethods();

        //通过反射获取接口
        //getJieKou();

        //获取所有的父类
        //getSup();

        //获取父类   此处效果为Object 因为默认继承Object
        //getSup();

        //获取所有的构造方法
        //getConstructors();

        //获取所有公共的属性
        //getFields();


        //获取当前类的所有属性
        //getThisFiilds();

        //通过反射实例化当前类
        //newInstace();

        //获取对象的实例  操作对象
        //newInstace2();

        //操作属性
        //newInstace3();

        //操作方法
        //caozuoMethod();

        //动态加载 类 和 方法
        //dynamicTest();

        //使用反射越过 泛型检查
        //FX();

        //万能set
        wangnengSet();


    }

    //通过反射获取类
    public static void reflectClass() throws ClassNotFoundException {

        Class<?> aClass = Class.forName("entity.Student");
        System.out.println(aClass);

        Class<Student> studentClass = Student.class;
        System.out.println(studentClass);

        Student student = new Student();
        Class<? extends Student> aClass1 = student.getClass();
        System.out.println(aClass1);
    }

    //通过反射获取公共方法
    public static void reflectMethod() throws ClassNotFoundException {
        //一般使用Class.forName();  入口
        Class<?> aClass = Class.forName("entity.Student");

        //获取公共的方法
        Method[] methods = aClass.getMethods();
        for (Method method:methods
             ) {
            System.out.println(method);

        }
    }

    //获取当前类所有方法
    public static void getThisMethods() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("entity.Student");
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method method:declaredMethods
             ) {
            System.out.println(method);
            
        }
    }


    //获取所有的接口
    public static void getJieKou() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("entity.Student");
        Class<?>[] interfaces = aClass.getInterfaces();
        for (Class<?> aClass1:interfaces//返回的数组
             ) {
            System.out.println(aClass1);
        }
    }

    //获取所有父类
    public static void getSup() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("entity.Student");
        Class<?> superclass = aClass.getSuperclass();
        System.out.println(superclass);//父类是单个值  （单继承多实现）
    }

    //获取所有构造方法
    public static void getConstructors() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> aClass = Class.forName("entity.Student");
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor:constructors
             ) {
            System.out.println(constructor);
        }

        System.out.println("------------");

        //获取无参的构造方法
        Constructor<?> declaredConstructor1 = aClass.getDeclaredConstructor();
        System.out.println(declaredConstructor1);

        System.out.println("------------");

        //指定获取构造方法 通过参数获取
        Constructor<?> constructor = aClass.getConstructor(int.class);
        System.out.println(constructor);

        System.out.println("------------");

        //获取私有的指定构造方法  用getDeclaredConstructor
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(int.class,String.class);
        System.out.println(declaredConstructor);

        System.out.println("------------");

        //通过构造方法也可以拿到对象
        declaredConstructor.setAccessible(true);//通过私有的构造方法拿对象 需要先给私有的构造方法放行
        Student student = (Student) declaredConstructor.newInstance(19,"pl");//由于调用构造方法是有参数的 所以得传参
        System.out.println(student);



    }

    //获取所有的公共属性 (包括父类的，接口的，public的)
    public static void getFields() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("entity.Student");
        Field[] fields = aClass.getFields();
        for (Field field:fields
             ) {
            System.out.println(field);
        }
    }

    //获取当前类所有的属性 (不包括父类的，接口的，不在乎修饰符)
    public static void getThisFiilds() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("entity.Student");
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field:declaredFields
             ) {
            System.out.println(field);
        }
    }

    //通过反射实例化当前类
    public static void newInstace() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName("entity.Student");
        Object o = aClass.newInstance();
        //为了证明成功实例化 强转成Student 如果成功就成功实例化
        Student student= (Student) o;//成功
        student.MyInterfaceOne();//掉成功 也说明实例化成功
    }

    //获取对象的实例  操作对象
    public static void newInstace2() throws Exception {
        Class<?> aClass = Class.forName("entity.Student");
        Student student = (Student) aClass.newInstance();
        student.setName("zs");
        student.setAge(18);
        System.out.println(student.getName()+" "+student.getAge());
    }

    //操作属性
    public static void newInstace3() throws Exception {
        Class<?> aClass = Class.forName("entity.Student");
        Student student = (Student) aClass.newInstance();
        Field Studentname = aClass.getDeclaredField("name");

        //由于属性name是私有的 只有通过本类的setName()赋值或getName()取值  所以我们需要修改访问权限
        Studentname.setAccessible(true);

        Studentname.set(student,"pl");
        System.out.println(student.getName());
    }

    //操作方法
    public static void caozuoMethod() throws Exception {
        Class<?> aClass = Class.forName("entity.Student");
        Student student = (Student) aClass.newInstance();

        Method myInterfaceOne = aClass.getDeclaredMethod("parivetMenthod", null);
        //访问私有的方法需要放行 修改权限
        myInterfaceOne.setAccessible(true);
        myInterfaceOne.invoke(student,null);

        System.out.println("---------------------");

        //调用有参数的
        Method parameterMethod = aClass.getDeclaredMethod("parameterMethod", String.class);
        parameterMethod.setAccessible(true);
        parameterMethod.invoke(student,"潘磊");
    }

    //动态加载 类 和 方法
    public static void dynamicTest() throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Properties properties = new Properties();
        properties.load(new FileReader("src/Test/Class.txt"));
        String className = properties.getProperty("ClassName");
        String classMethod = properties.getProperty("ClassMethod");

        Class<?> aClass = Class.forName(className);
        Method method = aClass.getMethod(classMethod);
        method.invoke(aClass.newInstance());
    }

    //使用反射越过 泛型检查
    public static void FX() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(520);
        list.add(1314);
        list.add(888);

        Class<?> aClass = list.getClass();
        Method method = aClass.getMethod("add", Object.class);
        method.invoke(list,"pl");
        System.out.println(list);
    }

    //万能set   (一个无论什么对象，什么属性，什么值，都可以用这个)
    public static void wangnengSet() throws NoSuchFieldException, IllegalAccessException {
        //第一个对象
        Student student = new Student();
        helper.setProperty(student,"name","zs");
        System.out.println(student);

        //第二个对象
        Book book = new Book();
        helper.setProperty(book,"bkid",18);
        System.out.println(book);
    }
}
