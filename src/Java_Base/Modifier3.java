package Java_Base;

/**
 * 1.default修饰符访问权限（子类且同一个包）
 */

public class Modifier3 extends Modifier{
    private void get(){
        int weight2= person.weight;
        System.out.println(weight2);
        //1.1default修饰符访问权限（子类且同一个包），new父类的实例对象访问对方的default的类（Modifier）和default变量
        Modifier modifier = new Modifier();
        modifier.age = 30;
        int age2 = modifier.age;
        System.out.println("年龄为："+age2);
        //1.2default修饰符访问权限（子类且同一个包），new父类的实例对象可以访问对方的default方法
        modifier.send();
    }

    public static void main(String args[]){
        Modifier3 modifier3 = new Modifier3();
        modifier3.get();
    }

}
