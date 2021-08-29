package Java_ObjectOriented;

/**
 * 向上和向下转型
 */
public class UpAndDownTransform {
}

class Fruit{
    public void eat(){
        System.out.println("水果可以吃");
    }
    //传入父类的对象，执行方法
    public static void get(Fruit fruit){
        fruit.eat();
        System.out.println("拿到水果吃水果");
    }
}

class Apple extends Fruit{
    //重写父类的方法（调用父类的方法和重写父类的方法不能同时存在）
    @Override
    public void eat(){
        String name = "苹果啊";
        System.out.println(""+name+"可以用来吃");
    }
    //子类自己的方法
    public void show(){
        System.out.println("苹果外观圆的");
    }

    public static void main(String[] args) {
        //新建父类的引用指向子类的实例，即将子类的实例赋予了父类的对象引用，
        // 向上转型--这样当向上转型之后，父类引用变量可以访问子类中属于父类的属性和方法（该方法被重写也可以）
        System.out.println("**********************向上转型***************");
        Fruit f = new Apple();
        //执行的就是子类Apple重写父类的方法
        f.eat();
//        f.show();  会报错
        //体现了向上转型的作用，主类或者其他包里面的任何其他类需要传入父类对象的方法，可以向上转型后可以
        get(new Apple());
        //相当于Fruit f = new Apple(); f.eat();
        // (传入了父类引用（向上转型了子类apple的实例），父类引用再执行就会去执行apple重写的方法

        //其他类需要传入父类的方法
        UpAndDownTransform2 upAndDownTransform2 = new UpAndDownTransform2();
        upAndDownTransform2.send(new Apple());//相当于Fruit f = new Apple();  传入了子类
        System.out.println("**********************向下转型***************");
        //向下转型,只有对子类对象实例向上转型过的父类对象的引用可用（f）,调用子类独有的方法
        Apple b = (Apple) f;
        //这样就可以执行子类中独有的方法
        b.show();
    }
}


