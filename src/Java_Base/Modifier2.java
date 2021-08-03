package Java_Base;


/**
 * 访问修饰符
 * 1.defult修饰符访问权限（同包）
 */


public class Modifier2 implements Modifier4{
    String name ="li";
    public final String name2 = "wang";
    void get(){
        //1.1defult修饰符访问权限（同包），new对方类的实例对象访问对方的default的类（Modifier）和default变量
        Modifier modifier = new Modifier();
        modifier.age = 20;
        System.out.println("年龄为：" +modifier.age);
        //1.2defult修饰符访问权限（同包），new对方类的实例对象访问可以对方的default方法
        modifier.send();
        int number1 = num;
        //1.3defult修饰符访问权限（同包），实现default修饰的接口，调用它的default修饰的方法
        getNum();
        //1.4defult修饰符访问权限（同包），实现default修饰的接口，获取其defaule修饰的成员变量
        System.out.println("获取接口的变量的值："+number1);

    }

    public void set(){
        System.out.println("我的世界");
    }

    public static void main(String args[]){
        Modifier2 modifier2 = new Modifier2();
        modifier2.get();
    }

}
