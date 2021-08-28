package Java_ObjectOriented;

/**
 * 构造函数
 */
public class Constructor {
    //定义类的成员变量
    private String name;
    private int age;
    private String num;

    //所有类默认都有无参构造函数，省略掉了，但如果定义了有参的构造函数，则需要写出来
    public Constructor(){
        //调用其他的构造函数，但必须写在第一行
        this("小丽",28);
        System.out.println("无参构造方法");
    }

    public Constructor(String a,int b){
        name = a;
        age = b ;
        System.out.println("两个参数的构造方法");
    }

    public Constructor(String c){
        this("小丽",28);
        num = c;
        System.out.println("一个两个参数的构造方法");
    }

    public Constructor(String a,int b,String c){
        name = a;
        age = b ;
        //在构造器中调用本类的其他方法
        resgiter(true);
        System.out.println("三个参数的构造方法");
    }

    public void resgiter(Boolean flag){
        System.out.println("进行登记与否： "+flag);
    }

    public static void main(String[] args) {
        //所有类默认都有无参构造函数的调用方式
        Constructor constructor1 = new Constructor();
        //有参构造函数的调用方式
        Constructor constructor2 = new Constructor("小明",21);
        Constructor constructor3 = new Constructor("1000");
        Constructor constructor4 = new Constructor("小王",30,"200");
    }
}
