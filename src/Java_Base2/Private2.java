package Java_Base2;

import Java_Base.Private;

public class Private2 extends Private{
    public void send(){
    Private p = new Private();
    //1.1private修饰符的访问权限（不同包子类）-private修饰的变量和方法
    //p.name;(报错)
    //p.get();（报错）

}

    public static void main(String[] args){
        Protected2 p = new Protected2();
        //1.2protected修饰访问权限（同包子类）访问权限-可以通过子类的实例使用继承自父类的private修饰的变量和方法
        System.out.println(p.name);
        p.get();
    }
}
