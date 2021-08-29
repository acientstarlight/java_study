package Java_ObjectOriented;

/**
 子类继承
 */
public class Extends {
    public static void main(String[] args) {
        Student s = new Student("Xiao Ming", 12, 89);
    }
}

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("构造方法的创建");
    }

    public void get(String name){
        System.out.println("我的世界");
    }
}

class Student extends Person {
    protected int score;

    public Student(String name, int age, int score) {
        //调用父类的构造方法(只能在子类的构造方法中调用父类的构造方法)
        super(name,age);
        this.score = score;
    }

    public void send(String name, int age,int score){
        //子类的普通方法中调用父类的普通方法
        super.get(name);
        System.out.println("姓名： "+name+"\t年龄： "+age+"分\t得分: "+score);
    }

    public static void main(String[] args) {
        Student student = new Student("小刚",21,100);
        student.send("黎明",22,99);
        System.out.println("1234");
    }
}
