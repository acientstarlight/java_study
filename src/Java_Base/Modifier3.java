package Java_Base;

/**
 * 1.default修饰符访问权限（子类且同一个包）
 */

public class Modifier3 extends Modifier{
    private void get(){
        int weight2= person.weight;
        System.out.println(weight2);
        //1.1继承来自父类的成员变量和方法
        age = 30;
        send();
        System.out.println("年纪为："+age);
        //1.1default修饰符访问权限（子类且同一个包），new父类的实例对象访问父类的default的类（Modifier）和default变量
        Modifier modifier = new Modifier();
        modifier.age = 30;
        int age2 = modifier.age;
        System.out.println("年龄为："+age2);
        //1.2default修饰符访问权限（子类且同一个包），new父类的实例对象可以访问对方的default方法b
        modifier.send();
    }

    public static void main(String args[]){
        Modifier3 modifier3 = new Modifier3();
        modifier3.get();
    }

}
