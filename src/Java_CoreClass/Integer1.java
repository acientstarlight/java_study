package Java_CoreClass;

import java.lang.String;

public class Integer1 {
    public static void main(String[] args){

            //自动装箱，将int类型转成Integer类型
            Integer x = 20;
            int i = 10;
            //自动装箱
            Integer y = i;   //等同于Integer y = new Integer(i);也可以写成 Integer y = Integer.valueOf(i);

            //自动拆箱，将integer类型转成int类型
            int a = 12;
            Integer b = a;
            //自动拆箱
            int c = b;  //等同于 int d = b.intValue();

            //将String类型转成Integer类型
            String d = "10";
            Integer e = Integer.valueOf(d);

            //将Integer装成String类型
            //方法一:Integer类的静态方法toString()
            String f = Integer.toString(e);
            //方法二:Integer类的成员方法toString()
            String g = e.toString();
            //方法三:String类的静态方法valueOf()
            String h = String.valueOf(e);
            System.out.println(f);
            System.out.println(g);
            System.out.println(h);

            //int转换成string
            int num=100;
            //1--""+变量形式
            String s1=""+num;
            System.out.println(s1);
            //2--String类的valueOf方法
            String s2 =String.valueOf(num);
            System.out.println(s2);
            //3--先将int类型转成包装类Interger类，再用Integer的成员方法toString
            Integer j =new Integer(num);
            String s3 =j.toString();
            System.out.println(s3);
            //4--先将int类型转成包装类Interger类，再用Integer的静态方法toString
            String s4 =Integer.toString(i);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);

            //String转换成int
            //1--先将String转成Integer类型，再将Integer类型转成int类型
            String k = "99";
            Integer m = Integer.valueOf(k);
            int n = m;
            //2--parseInt() 方法用于将字符串参数作为有符号的十进制整数进行解析(parseInt(String s))
            int o = Integer.parseInt(k);

            // Interger转成int等类型，比较大小
            Integer a1 = 20;
            Integer b1 = 21;
            System.out.println(a1.intValue());
            System.out.println(a1.byteValue());
            System.out.println(a1.shortValue());
            System.out.println(a1.longValue());
            //前一个值小于后一个值返回-1
            int a2 = Integer.compare(1,2);
            System.out.println(a2);
    }
}
