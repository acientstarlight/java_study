package Java_Base;

import java.util.Arrays;

/**
 * While循环
 */

public class While {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        String[] b = new String[]{"A", "B"};
        int c = 5;
        int d = 1;
        int e = 1;
        int f = 2;
        //判断条件，true则执行语句，加上break防止死循环
        while (a[0] > 2) {
            System.out.println("" + Arrays.toString(a));
            break;
        }
        System.out.println("数组a不符合要求");

        //先判断条件，为true，执行块中语句，d的值+1，再进行下一次条件判断及循环，直到条件不成立为false
        while (d < c) {
            System.out.println("while循环,当前d的值为： " + d);
            d++;
        }

        //先执行块中语句，再判断e < c，为true，执行下一次循环，e的值+1，直到e < c不成立，为false,结束循环
        do {
            e++;
            System.out.println("do while循环,当前e的值为： " + e);
        } while (e < c);

        //先执行块中语句，再判断f > c，为false结束循环
        do {
            f++;
            System.out.println("do while循环,当前f的值为： " + f);
        } while (f > c);
    }
}
