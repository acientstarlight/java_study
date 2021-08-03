package Java_Base;

/**
 * 1.protected修饰变量、变量
 * 2.protected修饰访问权限变（当前类）
 * 3.protected修饰内部类
 */

public class Protected {
    protected String name = "wanggang";
    protected void get(){
        System.out.println("protected方法");
    }

    //protected修饰内部类
    protected class Person{
        int age = 30;
    }

    public static void main(String[] args){
        Protected p = new Protected();
        //2.protected修饰（当前类）-访问default修饰的变量和方法
        System.out.println(p.name);
        p.get();
    }

}
