package Java_Base;

/**
 * 条件运算符
 */

public class ConditionOperator {
    public static void main(String[] args) {
        int a = 1;
        int b;
        int c;
        //条件满足，赋值为前面的值，否则赋值为后面的值
        b = (a>20)?100:200;
        c = (a<20)?100:200;
        System.out.println("b:"+b);
        System.out.println("c:"+c);
    }
}
