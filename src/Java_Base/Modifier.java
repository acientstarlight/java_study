package Java_Base;

/**
 * 修饰符
 *1.default修饰符修饰类、方法、变量、接口
 *2.defult的访问权限
 */

//1.default修饰符修饰类
class Modifier {
    //default修饰符修饰变量
    int age;
    //default修饰符修饰方法
    int getAge(int a){
        int b;
        return a;

    }
    //default修饰符修饰接口
    interface person{
        int weight = 10;
    }

   void send(){
        //2.1defult的访问权限(当前类),可以访问当前类的default对象
        age=10;
       //2.2defult的访问权限(当前类),可以访问当前类的default对象
        getAge(5);
    }

}
