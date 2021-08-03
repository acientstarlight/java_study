package Java_Base;

/**
 * 1.protected修饰访问权限（同包）
 */

public class Protected2 {
    protected void send(){
        Protected p = new Protected();
        //1.protected修饰访问权限（同包）-访问protected修饰的变量和方法，可以new类的实例访问
        System.out.println(p.name);
        p.get();
    }

    public static void main(String[] args){
        Protected2 p = new Protected2();
        p.send();

    }
}
