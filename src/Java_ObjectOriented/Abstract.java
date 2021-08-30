package Java_ObjectOriented;

/**
 * 抽象类
 * 抽象类定义了之后不是不许创建抽象方法，只定义没有问题
 */
abstract class Abstract {

    //抽象类也可以定义成员变量
    protected int num;
    //抽象类也可以定义非抽象的方法
    public void get() {

    }
    //定义抽象方法（不能被static修饰），但是没有具体的执行语句,即不能写{}
    abstract void eat();

    abstract void send();
}
