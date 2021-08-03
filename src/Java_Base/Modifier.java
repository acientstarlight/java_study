package Java_Base;

/**
 * 修饰符
 *1.default修饰符修饰类、方法、变量、接口
 *2.defult的访问权限（当前类）
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
        int weight = 100;
        default void pass(){
            System.out.println("美好的一天");
        }
    }

   void send() {
       //2.1defult的访问权限(当前类),可以访问当前类的default对象的变量
       age = 10;
       //2.2defult的访问权限(当前类),可以访问当前类的default对象的方法
       getAge(5);
       int weight2 = person.weight;
       System.out.println(weight2);
       }

       public static void main(String[] args){



   }


}
