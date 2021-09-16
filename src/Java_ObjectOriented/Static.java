package Java_ObjectOriented;

/**
 * 静态字段和静态方法
 */
public class Static {
    //定义实例变量
    public String name;
    //定义静态字段（静态变量）
    public static int num;
    //定义静态方法
    public static void get(){
        System.out.println("调用静态变量成功");
    }
    public static void have(){
        num = 20;
        get();
        System.out.println("调用静态变量成功");
    }
    public void send(){
        name = "xiaoxiao";
        have();
        get();
        System.out.println("调用普通方法成功");
    }

    public static void main(String[] args) {
        //非静态的变量和方法不能通过类名.变量名或方法名来访问
//        Static.name = "20";  //会报错
//        Static.send();      //会报错

        //在本类中对静态变量进行赋值
        //可以直接用静态变量名来赋值
        num = 30;
        System.out.println("num的值为:\t"+num);
        //调用静态变量，调用静态变量，可以通过类名.字段来访问赋值
        Static.num = 20;
        System.out.println("num的值为:\t"+num);
        //调用静态变量，可以通过实例类来调用
        Static s = new Static();
        //可以使用实例对象.变量名来方法问，不过会有警告，不推荐这样写
        s.num = 10;
        System.out.println("num的值为:\t"+num);

        //通过实例来访问非静态的变量
//        name = "小王";  //直接调用会报错
        s.name = "小王";
        //通过实例来访问非静态的变量和方法
        s.send();

        //通过实例来访问静态方法,会警告
        s.get();
        //可以直接使用方法名或者类名.方法名
        get();
//        Static.get();
    }
}
