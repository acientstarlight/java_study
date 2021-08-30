package Java_ObjectOriented;

/**
 * 接口类
 */
 interface Interface {
    //接口中的成员变量只能是public static final的常量
     public static final String name = "王刚";

    //定义抽象方法（省略了修饰符public abstract）,可以写具体执行语句
    void eat();

    //定义defult方法，可以有方法体
    default void send(){
        System.out.println("接口1的默认方法");
    }

    //定义static方法，可以有方法体
    static void drink(){
        System.out.println("接口1的静态方法");
    }

    //定义私有方法（在java 9以后可以定义）
//    private void work(){
//        System.out.println("接口1的私有方法");
//    }
    //定义私有静态方法（在java 9以后可以定义）
//    private static void go(){
//        System.out.println("接口1的私有静态方法");
//    }
}
