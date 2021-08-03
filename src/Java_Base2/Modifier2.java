package Java_Base2;

/**
 * 1.default访问修饰符访问权限（不同包的子孙类）
 */

//1.1default访问修饰符访问权限（不同包）-继承不了default修饰的类
//public class Modifier2 extends Java_Base.Modifier {(报错)
public class Modifier2 extends Java_Base.Modifier2 {
    void send(){
        Modifier2 modifier2 = new Modifier2();
        //1.2default访问修饰符访问权限（不同包的子孙类）,访问不了父类的default变量
        //String name3 = modifier2.name;(报错)
        String name3 = modifier2.name2;
        System.out.println("name3为："+name3);
        //1.2default访问修饰符访问权限（不同包的子孙类）,访问不了父类的default变量
        //modifier2.get();(报错)
        modifier2.set();
    }

    public static void main(String args[]){
        Modifier2 modifier2 = new Modifier2();
        modifier2.send();
    }
}
