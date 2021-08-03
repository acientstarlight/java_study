package Java_Base;

/**
 * 1.private修饰符修饰方法、变量
 * 2.private修饰符访问权限（当前类）
 */

public class Private {
    private String name = "WANG";
    private void get(){
        System.out.println("Private修饰符");
    }

    public static void main(String[] args){
        Private p = new Private();
        //2.private修饰符访问权限（当前类）-private修饰的变量和方法
        System.out.println(p.name);
        p.get();
    }
}
