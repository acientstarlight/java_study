package Java_Base2;

import Java_Base.Protected4;

/**
 * 1.protected修饰访问权限（不同包子类）访问权限
 */

public class Protected extends Protected4 {
    public void send(){
        Protected4 p = new Protected4();
        //1.1protected修饰访问权限（不同包子类）访问权限-访问父类的protected修饰的变量和方法
        //p.name;（报错）
        //p.get();(报错)
        System.out.println("子类不同包");
    }

    public static void main(String[] args){
        Protected p = new Protected();
        p.send();
        //1.2protected修饰访问权限（不同包子类）访问权限-可以通过子类的实例使用继承自父类的protected修饰的变量和方法
        p.get();
        System.out.println(p.name);
    }
}
