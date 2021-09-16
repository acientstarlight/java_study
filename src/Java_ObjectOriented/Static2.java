package Java_ObjectOriented;

public class Static2 {
    public static void main(String[] args) {
        //在其他对静态方法和变量有访问权限的类中，访问静态变量和静态方法，要用类名.方法名
        Static.num = 20;
        Static.get();
        Static s = new Static();
        //在其他对静态方法和变量有访问权限的类中，可以用实例来调用静态方法和静态变量，不过会有警告，不推荐
        s.num = 10;
        s.get();
        System.out.println(s.num);
        //其他类中对于非静态变量和非静态方法的访问：
        s.name = "王菲";
        s.send();
    }

}
