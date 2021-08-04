package Java_Base;

/**
 * 逻辑运算符
 */

public class LogicalOperator {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;
        //都为true为true
        System.out.println(""+(a&&b));
        //其中一个以上为true为true
        System.out.println(""+(a||b));
        //取结果的反数，如果条件为true,则为false
        System.out.println(""+!(a&&b));
        int e = 5;
        int f = 10;
        int h = 20;
        //因为e<1为false，&&运算符后面的不执行
        boolean g = (e<1)&&(f++>5);
        boolean i = (e>1)&&(h++>5);
        System.out.println(e);
        System.out.println(f);
        System.out.println(h);

    }
}
