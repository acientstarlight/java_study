package Java_Base;

/**
 * 接口定义default修饰的成员变量和default修饰的方法
 */

interface Modifier4 {
    int num = 20;
    default void getNum(){
        System.out.println("接口的方法");
    }
}
