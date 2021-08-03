package Java_Base2;

import Java_Base.Modifier2;

//1.1default修饰符访问权限（不同包）-default修饰的类，不能引入（访问）
//import Java_Base.Modifier;(报错)

/**
 * 1.default修饰符访问权限（不同包）
 */

public class Modifier {
    void send(){
        Modifier2 modifier2 = new Modifier2();
        //1.2default修饰符访问权限（不同包）-default修饰的变量，不能访问
        //String name4 = modifier2.name;（报错）
        String name3 = modifier2.name2;
        System.out.println("name3的值为："+name3);
        //1.2default修饰符访问权限（不同包）-default修饰的方法，不能访问
        //modifier2.get();（报错）
        modifier2.set();
    }

    public static void main(String args[]) {
        Modifier modifier = new Modifier();
        modifier.send();
    }
}
