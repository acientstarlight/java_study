package Java_ObjectOriented;

/**
 * 抽象类的抽象子类
 * 抽象类可以继承抽象类或者非抽象类
 */

abstract class Abstract3 extends Abstract{

    //抽象子类可以重写父类的任何方法,不需要必须重写抽象父类的方法，也不是必须有抽象方法
    @Override
    public void send(){
    }

    //也可以定义自己的抽象方法
    abstract void drink();
}
