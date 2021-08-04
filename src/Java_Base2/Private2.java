package Java_Base2;

import Java_Base.Private;
import Java_Base.Private3;

public class Private2 extends Private{
    public void send(){
    Private p = new Private();
    //1.1private修饰符的访问权限（不同包子类）-private修饰的变量和方法
    //p.name;(报错)
    //p.get();（报错）

}

    public static void main(String[] args){
        Private3 p = new Private3();
        /*1.2prvite修饰访问权限（不同包子类）访问权限-不可以通过
        /* 子类的实例使用继承自父类的private修饰的变量和方法,继承不了父类的private方法和变量
         */
        //System.out.println(p.name);（报错）
        //p.get();（报错）
    }
}
