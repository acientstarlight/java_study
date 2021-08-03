package Java_Base;

/**
 * 1.protected修饰访问权限（同包子类）访问权限
 */

public class Protected3 extends Protected{
    public void send(){
        //1.protected修饰访问权限（同包子类）访问权限-访问父类protected修饰的变量和方法
        Protected p = new Protected();
        System.out.println(p.name);
        p.get();
    }

    public static void main(String[] args){
        Protected3 p = new Protected3();
        p.send();
    }


}
