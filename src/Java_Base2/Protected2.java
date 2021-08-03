package Java_Base2;

import Java_Base.Protected;

/**
 * 1.protected修饰访问权限（不同包）访问权限
 */

public class Protected2 {
    public void send(){
        Protected p = new Protected();
        //1.protected修饰访问权限（不同包）访问权限，访问另一包类的protected修饰的变量和方法
        //p.name;(报错)
        //p.get();(报错)
    }
}
