package Java_ObjectOriented;

interface Interface2 {

    //接口中的成员变量只能是public static final的常量
    public static final String name2 = "王刚";

    //定义抽象方法（省略了修饰符public abstract）,可以写具体执行语句
    void run();

    //定义defult方法
    default void send(){
        System.out.println("接口1的默认方法");
    }

    //定义static方法
    static void drink(){
        System.out.println("接口1的静态方法");
    }

    //定义static方法
    static void have(){
        System.out.println("接口2的静态方法");
    }
}
