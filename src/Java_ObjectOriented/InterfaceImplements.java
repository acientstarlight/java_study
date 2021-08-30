package Java_ObjectOriented;

public class InterfaceImplements implements Interface,Interface2{

    //实现接口的类（非抽象类，抽象类可以不做限制）必须实现或者重写接口的所有方法，因为接口的所有方法都是抽象的,包括抽象方法
    //可以直接调用接口中的抽象方法或者重写
    //直接调用接口中的抽象方法
    public void eat(){
        System.out.println("实现类实现接口1的抽象方法");
    }
    //可以重写接口中的抽象方法
    @Override
    public void run(){
        String name2 = "你";
        System.out.println(""+name2+"重写接口2的抽象方法");
    }
    //此处因为该实现类重写两个接口中都定义了一摸一样的default方法send().因此必须在实现类中实现或者重写该default方法
    @Override
    public void send() {
        System.out.println("重写两个接口类一样的默认（0default)方法--sen的()");
    }
    //这样写也可以。实现两个接口中都定义了一摸一样的default方法send()，自己定义方法体
//    public void send() {
//        System.out.println("重写两个接口类一样的默认（0default)方法--sen的()");
//    }

    //此处直接调用或者重写接口的静态方法都会报错，只能通过接口类名.方法名去调用
//    @Override
//    public static drink(){
//    }
//    public static drink(){
//    }

    public static void main(String[] args) {
        //调用实现接口的抽象方法
        InterfaceImplements interfaceImplements = new InterfaceImplements();
        interfaceImplements.eat();
        interfaceImplements.run();
        //实现类调用重写两个接口类一样的默认（0default)方法
        interfaceImplements.send();

        //调用实现类的静态方法（不能在实现类中重写和实现），通过接口名.方法名调用可以直接去分开
        Interface.drink();
        Interface2.drink();
    }
}
