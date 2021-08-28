package Java_ObjectOriented;

public class Method2 {

    public static void main(String[] args) {
        Method method = new Method();
        method.getname1();
        //此处执行 this.name = names将wanggang赋值给了当前实例的成员变量name，此处该实例成员变量的值已经发生改变
        //如果该成员变量是static静态的成员变量，则该类的其他对象的该变量值也被改变，如果是实例变量，则该类的每个对维护一个自己的副本
        method.getname2("wanggang");
        //此处执行return name，拿到刚才被赋值的成员变量name
        String person1 = method.getname3();
        System.out.println(person1);
        //直接返回传入的参数值
        String person2 = method.getname4("xiaoming");
        System.out.println(person2);
    }
}
