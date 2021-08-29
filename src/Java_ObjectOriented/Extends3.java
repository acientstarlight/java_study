package Java_ObjectOriented;

/**
 子类继承
 */
public class Extends3 {
    public static void main(String[] args) {
        System.out.println("1235");
    }
}

class Person3{
    protected int age;
    protected String name;
    public void set(){
        System.out.println("person2");
    }
    public Person3(){
        System.out.println("1234");
    }
    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("构造方法的创建");
    }
}

class Teacher2 extends Person3{
    private String country = "中国";
    public Teacher2(String name,int age){
        //父类没有写默认的构造方法和其他有参的构造方法，如果子类想用父类本来就有的没有参数的构造方法，子类就必须显式调用super()
//        super();
        //如果父类有其他有参的构造方法,那么父类就必须显式写上无参的默认构造方法。可以直接用父类的有参构造方法，不用必须调用显式调用父类的super()
        super(name,age);
        System.out.println("老师的姓名：\t"+name);
    }

    public static void main(String[] args) {
        Teacher2 teacher2 = new Teacher2("小红",20);
        //此处
        System.out.println("老师国籍为：\t"+teacher2.country);
    }
}
