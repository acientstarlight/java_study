package Java_Base;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 1.实例方法中实例变量的直接调用
 * 2.静态方法和main方法（本质也是静态方法）中对于实例变量的调用
 * 3.实例方法的调用(被静态方法调用以及被同类中其他实例方法调用)
 * 4.类方法（静态方法）的调用(被同类实例方法、静态方法、main调用)，可以直接通过方法名调用
 * 5.全局变量中类变量（静态变量）的调用以及实例变量的调用，对比两者被类的对象引用后值是否改变
 * 6.局部变量的定义
 * 7.final修饰的变量
 * 8.静态变量在实例方法、静态方法和main方法中的访问
 */

class Instance1 {
        int age = 29;    //实例变量
        int height;
        int weight;
        public static String name = "wamhmogn";    //静态变量
        //7.final修饰的变量为不可变变量,只能直接被引用
        public static final String a = "wamhmogn";    //静态变量

        //int send(int a){

        //实例方法
        void send(int a){
            System.out.println(a);
            //6.局部变量的定义，只在该方法体内有用
            int[] list = {1,2,3};
            System.out.println(list);
            //1.实例变量在实例方法中可以直接调用
            System.out.println(+age);
            a = age+1;
            System.out.println("岁数为"+age);
            //return a;
         }

        int send2(int b){
        height = 180;
        System.out.println(+height);
        b = height+1;
        System.out.println("身高为"+b);
        //3.1同一个类中其他实例方法调用其他实例方法不需要new对象，直接用方法名()
        send(3);
        return b;
    }

    public static void send3(){
            //2.1实例变量在静态方法中需要new对象来引用，对象.变量名
            Instance1 instance = new Instance1();
            instance.weight = 50;
            int c;
            c = instance.weight;
            System.out.println("体重为："+c);
            //3.2同一个类中其他静态方法调用实例方法，需要new对象，通过对象.方法名来调用
            instance.send(5);
            System.out.println();
    }

    void send4(){
        //1.实例变量在实例方法中可以直接调用
        int c = weight;
        c = 60;
        System.out.println("局部变量c体重为："+c);
        //4.1实例方法调用同类中的静态方法直接可以使用方法名来调用
        send5();
        send3();
        age = 20;
        System.out.println("实例一个对象，改变此处的age值后为:"+age);
        //8.1静态变量在实例方法直接通过变量名访问
        name ="sasa";
        System.out.println("实例一个对象，改变此处的age值后为:"+name);
    }

    public static void send5(){
        //4.2静态方法调用同类中的静态方法直接通过方法名调用
        Instance1 instance = new Instance1();
        //8.2静态变量在静态方法直接通过变量名访问
        name = "100";
        send3();
    }

    public static void main(String[] args) {
        Instance1 instance1 = new Instance1();
        Instance1 instance2 = new Instance1();
        //2.2实例变量在main方法中需要new对象来引用，对象.变量名
        System.out.println(instance1.weight);
        //8.3静态变量在main方法直接通过变量名访问
        System.out.println(name);
        //3.3同一个类中main方法调用实例方法，需要new对象，通过对象.方法名来调用
        instance1.send(2);
        instance1.send2(185);
        send3();
        //4.3main调用同类中的静态方法直接通过方法名调用
        send5();
        instance1.send4();
        System.out.println("instance1调用send4方法改变全局变量age后，该类的age实例变量值为:"+instance1.age);
        //5.1实例变量不同对象有其对应副本，不会互相影响
        System.out.println("instance1调用send4方法改变全局变量age后，另一个对象instance2的该变量age值为:"+instance2.age);
        //5.2静态变量是该类的公共资源，其中一个对象将其改变，其他对象再引用时时改变后的结果
        System.out.println("方法中改变全局变量name后该类的实例变量值为:"+name);
    }

}

