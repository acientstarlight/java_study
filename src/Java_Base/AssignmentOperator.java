package Java_Base;

/**
 * 赋值运算符
 */

public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 1;
        int d = a;
        int e = 4;
        e += a;
        int f = 5;
        f -= a;
        int g = 6;
        g *= a;
        int h = 7;
        h /= a;
        int i = 8;
        i %= a;
        //位赋值忽略
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
    }
}
