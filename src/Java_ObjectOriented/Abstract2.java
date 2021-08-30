package Java_ObjectOriented;

/**
 * 抽象类的非抽象子类
 */
public class Abstract2 extends Abstract{

    //子类中必须要重写抽象父类所有的抽象方法，非抽象的方法可以不实现
    @Override
    public void eat(){
        System.out.println("可以吃苹果了");
    }

    @Override
    public void send() {
        num = 20;
        System.out.println("输送苹果"+num+"个");
    }

    public static void main(String[] args) {
        Abstract2 abstract2 = new Abstract2();
        abstract2.eat();
        abstract2.send();
        //父类的方法，继承而来只是没有重写
        abstract2.get();

        //可以通过向上转型，父类的引用直接调用子类的实现抽象方法
        Abstract a = new Abstract2();
        //这样有多个子类的话，就可以不用关心子类的类型，可以直接通过向上转型后的父类的引用直接调用子类重写的抽象方法
        // （和UpAndDownTransform里描绘的作用一样，只是应用于抽象类，抽象类还有有一个好处是，抽象父类中定义的子类共性的
        // 抽象方法不需要写具体的执行）
        a.eat();
        //也可以用自身子类没有实现的方法（实际上子类也继承了该方法，没有重写，本身可以直接用）
        a.get();
        a.send();
    }
}
