package Java_Base2;

import Java_Base.Modifier2;
import Java_Base.Modifier5;

//1.4default修饰符访问权限（不同包）-不可引入default修饰的接口
//import Java_Base.Modifier4;(报错)

//1.1default修饰符访问权限（不同包）-default修饰的类，不能引入（访问）
//import Java_Base.Modifier;(报错)

/**
 * 1.default修饰符访问权限（不同包）
 */

public class Modifier implements Modifier5{
    void send(){
        Modifier2 modifier2 = new Modifier2();
        //1.2default修饰符访问权限（不同包）-default修饰的变量，不能访问
        //String name4 = modifier2.name;（报错）
        String name3 = modifier2.name2;
        System.out.println("name3的值为："+name3);
        //1.3default修饰符访问权限（不同包）-default修饰的方法，不能访问
        //modifier2.get();（报错）
        modifier2.set();
        //1.5default修饰符访问权限（不同包）-访问公共接口的default修饰的成员变量
        System.out.println(num);
        getNum();
    }

    public static void main(String args[]) {
        Modifier modifier = new Modifier();
        modifier.send();
    }
}
