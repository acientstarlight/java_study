package Java_Base;

/**
 * break和continue
 */

public class BreakAndContinue {
    public static void main(String[] args) {
        int sum =0;
        int sum2 =0;
        //break--计算1-1000的和sum，当和大于2000时，退出循环，返回最后一个不大于2000的sum值
        for (int i=1;i<1000;i++){
            sum = sum+i;
            System.out.println("求和到"+i+"时的sum值为： "+sum);
            if(sum>=2000){
                break;
            }
            //break后结束所处的该层for循环，后面的语句也不执行（下面的打印不会执行）
            System.out.println("最后一个不大于2000的sum值为： "+sum+"\n此时求和数为1+2+3......"+i);
        }

        //continue  计算1-50（不包括20这个数）的和sum
        for (int i=1;i<=50;i++){
            if(i==20){
                continue;
            }
            //continue后结束本次循环，后面的语句不会执行（下方的相加语句不会执行），继续执行下一次循环
            sum2 = sum2+i;
            System.out.println("求和到"+i+"时的sum值为： "+sum2);
        }
        System.out.println("1-50(不包括20)的和的值为：)"+sum2);
    }
}
