package Java_CoreClass;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * java核心类--String
 */
public class String1 {
    public static void main(String[] args) {

        /* String定义 */
        String a = "123";
        String b = new String("123");
        char c[] = {'s', 'u', 'z', 'h', 'o', 'u'};
        String d = new String(c);

        /* 返回指定索引处的 char 值 */
        char a1 = a.charAt(2);
        System.out.println(a1);

        /* String类型转int类型 */
        String str1 = "20";
        System.out.println(Integer.parseInt(str1));
        System.out.println(Integer.valueOf(str1).intValue());

        /* int类型转String */
        int num = 12;
        Integer num1 = num;
        String num2 = num1.toString();
        System.out.println(num2);
        String num3 = String.valueOf(num);
        String num4 = "" + num;

        /* 把这个字符串和另一个对象比较 */
        String aa = "123";
        String bb = "12345678";
        String cc = "123";
        String dd = "128";
        int e1 = aa.compareTo(bb);
        System.out.println("aa-bb: " + e1);
        int e2 = aa.compareTo(cc);
        System.out.println("aa-bb: " + e2);
        int e3 = aa.compareTo(dd);
        System.out.println("aa-dd: " + e3);

        /* 将指定字符串连接到此字符串的结尾 */
        String ee = "abc";
        String ff = "efg";
        String gg = ee.concat(ff);
        String ggg = ee + ff;
        System.out.println(gg);
        System.out.println(ggg);

        /* Java获取字符串长度 */
        String h = "ssdx";
        System.out.println(h.length());

        /* Java字符串大小写转换 */
        String hh = "HelloWorld";
        System.out.println(hh.toLowerCase());
        System.out.println(hh.toUpperCase());

        /* Java去除字符串中的空格 */
        String ii = " hello java ";
        System.out.println(ii);
        System.out.println(ii.trim());

        /* 截取字符串 */
        String i1 = ii.substring(2);
        System.out.println(i1);
        String i2 = ii.substring(2, 6);
        System.out.println(i2);

        /* 字符串分割符 */
        String Colors = "Red,Black,White,Yellow,Blue";
        String[] arr1 = Colors.split(","); // 不限制元素个数
        String[] arr2 = Colors.split(",", 3); // 限制元素个数为3
        System.out.println("所有颜色为：");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("前三个颜色为：");
        for (int j = 0; j < arr2.length; j++) {
            System.out.println(arr2[j]);
        }

        /* 字符串替换 */
        String j = "aa  bb  cc aa";
        String jj = j.replace("aa", "AA");
        System.out.println(jj);
        System.out.println(j.replaceFirst("aa","AA"));
        System.out.println(j.replaceAll("aa","AA"));

        /* 字符串比较 */
        String k1 = "aa";
        String k2 = "cc";
        String k3 = "aA";
        String k4 = "aa";
        System.out.println(k1.equals(k3));
        System.out.println(k1.equalsIgnoreCase(k3));
        System.out.println(k1.equalsIgnoreCase(k4));
        System.out.println(k1==(k4));
        String k5 = new String(k1);
        System.out.println(k1==k5);

        /* Java字符串查找 */
        String s = "Hello Java";
        int size = s.indexOf('v');
        int size2 = s.indexOf('v',2);
        int size6 = s.indexOf('w',2);
        int size3 = s.lastIndexOf("Ja");
        int size4 = s.lastIndexOf("Ja",2);
        int size5 = s.lastIndexOf("jaw",2);
        int size7 = s.lastIndexOf("J",3);
        System.out.println(size);
        System.out.println(size2);
        System.out.println(size3);
        System.out.println(size4);
        System.out.println(size5);
        System.out.println(size5);
        System.out.println(size6);
        System.out.println(size7);

        /* 判断字符串是否为空 */
        String l = "123";
        System.out.println(l.isEmpty());

        /* 判断字符串 */
        String l1 = "aaaaassss";
        System.out.println(l1.contains("sss"));

        /* String 匹配 */
        // 将一个字符串编译成 Pattern 对象
        Pattern p = Pattern.compile("a*b");
        // 使用 Pattern 对象创建 Matcher 对象
        Matcher m = p.matcher("aaaaab");
        boolean b2 = m.matches(); // 返回 true
        System.out.println(b2);
        //以上等同于：
        boolean b3 = Pattern.matches ("a*b","aaaaab");
        System.out.println(b3);

        // 使用字符串模拟从网络上得到的网页源码
        String str = "我想找一套适合自己的JAVA教程，尽快联系我13500006666" + "交朋友，电话号码是13611125565" + "出售二手电脑，联系方式15899903312";
        // 创建一个Pattern对象，并用它建立一个Matcher对象
        // 该正则表达式只抓取13X和15X段的手机号
        // 实际要抓取哪些电话号码，只要修改正则表达式即可
        Matcher m2 = Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(str);
        // 将所有符合正则表达式的子串（电话号码）全部输出
        while (m2.find()) {
            System.out.println(m2.group());
        }
    }
}
