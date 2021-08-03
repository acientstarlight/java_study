package Java_Base;


/**
 * 访问修饰符
 * 1.defult修饰符访问权限（同包）
 */


public class Modifier2 {
    String name ="li";
    public final String name2 = "wang";
    void get(){
        //1.1defult修饰符访问权限（同包），new对方类的实例对象访问对方的default的类（Modifier）和default变量
        Modifier modifier = new Modifier();
        modifier.age = 20;
        System.out.println("年龄为：" +modifier.age);
        //1.1defult修饰符访问权限（同包），new对方类的实例对象访问可以对方的default方法
        modifier.send();
    }

    public void set(){
        System.out.println("我的世界");
    }

    public static void main(String args[]){
        Modifier2 modifier2 = new Modifier2();
        modifier2.get();
    }

}
