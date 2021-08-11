package Java_Base;

import java.util.Arrays;

/**
 * For循环
 * 对一个整型数组的所有元素求和
 * 指定输出的顺序和个数（反向输出数组的）
 * 增强for循环
 * 练习：圆周率π可以使用公式计算：π/4=1-1/3+1/5-1/7+1/9......计算π的值
 */

public class For {
    private int[] list1;
    public void add() {
        list1 = new int[]{1, 2, 3, 4};
        int[] list2 = {5, 6, 7, 8};
        int sum1 = 0;
        int sum2 = 0;
        int k = list2.length - 1;
        double pi = 0;
        double fm = 0;
        double xh = 0;
        double you = 0;
        for (int i = 0; i < list1.length; i++) {
            System.out.println("打印整个数组：  " + Arrays.toString(list1));
            System.out.println("数打印整个数组   ：" + Arrays.asList(list1));
            //对一个整型数组的所有元素求和
            sum1 = sum1 + list1[i];
            // System.out.println("数组list1的元素和为："+sum1);
        }
        System.out.println("最终数组list1的元素和为：" + sum1);

        //反向输出数组元素
        for (int j = list2.length - 1; j >= 0; j--) {
            System.out.println("第" + j + "个元素为： " + list2[j]);
        }

        //两个数组首位和末位一一相加（单个for循环）
        for (int i = 0, j = list2.length - 1; i < list1.length && j >= 0; i++, j--) {
            sum2 = list1[i] + list2[j];
            System.out.println("sum2: " + sum2);
        }

        //两个数组首位和末位一一相加（双重for循环）
        for (int i = 0; i < list1.length; i++) {
            for (int j = k; j >= 0; j--) {
                sum2 = list1[i] + list2[j];
                break;
            }
            System.out.println("i:" + i + "   k:" + k + "   sum2:" + sum2);
            k--;
        }

        //增强for循环遍历数组元素并打印
        for (int n : list2) {
            System.out.print("数组原始版依次为：" + n);
        }

        //计算π的值--for循环
            for (int i=0;i<10000000;i++){
                fm = 1+i*2;
                xh = 1/fm;
                if (i%2==0&&i !=1) {
                    you = you + xh;
                    System.out.println("第"+i+"次获得的pi: "+you);
                }else {
                    you = you - xh;
                    System.out.println("第"+i+"次获得的pi: "+you);
                }
                pi = you*4;
                System.out.println("π值为："+pi);
            }

        //计算π的值--while循环
        double pitemp = 0;// 根据公式所得值
        double finalpi = 0; // 上次所得值（小数点后五位）
        double pii = 0;// 本次所得值（小数点后五位）
        int i = 0;// 计数器
        double b = 0;// 公式的括号内的值
        int ii = 20;// 所得相同值次数,可限制最后是有连续ii次所得相同值
        int finalii = 20;// 与ii值相同，用于在ii值变化后 ，恢复ii值
        // int iii=20;//限制相同次数
        while (true) {
            // 次数控制
            if (i == 1000000) {
                break;
            }
            double rs = 1 + 2 * i;
            double d = 1 / rs;
            if (i % 2 == 0 && i != 1) {
                b = b + d;
                // System.out.println("---"+i+"----正------***"+b);
            } else {
                b = b - d;
                // System.out.println("---"+i+"----负------***"+b);
            }
            i = i + 1;
            pitemp = (b) * 4;
            // System.out.println(pitemp);

        }
    }

    public static void main(String[] args) {
        For for1 = new For();
        for1.add();

    }

}
