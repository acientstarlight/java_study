package Java_Base;

import java.sql.SQLOutput;

/**
 * 算术运算符
 */

public class ArithmeticOperator {
    public void calculate(){
        int a = 2;
        int b = 5;
        int c,d,e,f,g,h,i;
        c = a+b;
        d = b-a;
        e = b*a;
        f = b/a;
        g = b%a;    //取余数
        //写成a = a++,先进行表达式运算（a=a）,a的值没有改变，应该写成a++，只进行a的值的+1
        a = a++;
        System.out.println("A:"+a);
        a++;
        System.out.println("A:"+a);
        //++在前面先进行自增，在进行表达式运算，流程：a = a+1,再有a=1
        a = ++a;    //等同于++a
        System.out.println("A:"+a);
        b++;
        System.out.println("B:"+b);
        h = 2*++a;
        System.out.println("A:"+a);
        i = 2*b++;
        System.out.println("B:"+b);
        System.out.println(""+c+"\n"+d+"\n"+e+"\n"+f+"\n"+g+"\n"+a+"\n"+b+"\n"+h+"\n"+i);
        //如果有任何运算单元的长度超过int,那么运算结果就按照最长的长度计算
        long aa = 20;
        int bb = 10;
        //a+b的运算结果是long型，所以要进行强制转换
        int cc = (int)(aa+bb);
        System.out.println(cc);
        //如果任何运算单元的长度都不超过int,那么运算结果就按照int来计算
        byte aaa = 20;
        byte bbb = 21;
        //虽然a b都是byte类型，但是运算结果是int类型，需要进行强制转换
        byte ccc = (byte)(aaa+bbb);
        System.out.println(ccc);
    }

    public static void main(String[] args){
        ArithmeticOperator arithmeticOperator = new ArithmeticOperator();
        arithmeticOperator.calculate();
    }
}
