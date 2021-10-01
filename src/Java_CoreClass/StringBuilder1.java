package Java_CoreClass;

public class StringBuilder1 {
    public static void main(String[] args) {
        /* 创建StringBuilder对象 */
        StringBuilder stb = new StringBuilder("123");
        System.out.println(stb);

        /* 字符串拼接（连接）*/
        stb = stb.append("ABC");
        /* 返回此序列中数据的字符串表示形式 */
        String str = stb.toString();
        System.out.println(str);

        /* 进行链式操作 */
        stb.append("D").append("E").append("F").append("G");
        System.out.println(stb);

        /*  追加unicode编码 */
        stb.appendCodePoint(0x7f16).appendCodePoint(0x5b57);
        System.out.println(stb);

        /* 将第 i 个代码单元设置为 c */
        stb.setCharAt(1, '0');
        System.out.println(stb);
        /* 将第 某段 代码单元设置为其他值 */
        stb.replace(1,stb.length(),"11WWW");
        System.out.println(stb);

        /* 在指定位置之前插入字符(串)(也可以是其他的数据类型) */
        stb.insert(2,2);
        System.out.println(stb);
        stb.insert(2,"QQ");
        System.out.println(stb);
        /* 在某个位置,插入指定字符串的指定段 */
        stb.insert(1,"ss6666",0,3);
        System.out.println(stb);

        /* 删除字符 */
        stb.deleteCharAt(0);
        System.out.println(stb);
        stb.delete(0,2);
        System.out.println(stb);

        /* 查找字符（串）的位置 */
        System.out.println(stb.indexOf("2"));
        /* 从指定位置向后查找字符（串）的位置 */
        System.out.println(stb.indexOf("2",2));
        /* 从后往前，找到第一次出现某字符（串）的位置 */
        System.out.println(stb.lastIndexOf("W"));
        /* 从指定位置开始，从后往前，找出第一次出现某字符（串）的位置 */
        System.out.println(stb.lastIndexOf("Q",1));

        /* 反转字符（串顺序） */
        stb.reverse();
        System.out.println(stb);
    }
}
