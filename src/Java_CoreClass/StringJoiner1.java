package Java_CoreClass;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class StringJoiner1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

        /* 声明StringJoiner, 每个元素通过 "." 分割 */
        StringJoiner stj = new StringJoiner(".");
        list.forEach(stj ::add);
        System.out.println(stj.toString());

        /* 每个元素通过 "," 分割，并且用 "[" 和 "]" 包住前后 */
        StringJoiner stj2 = new StringJoiner(",","[","]");
        list.forEach(stj2::add);
        System.out.println(stj2.toString());

        /*  将joner和joner2的元素合并，并且每个元素通过 "." 分割，并且用 "[" 和 "]" 包住前后 */
        stj.merge(stj2);
        System.out.println(stj);

        /* 当StringJoiner为空时，可以设置默认值*/
        StringJoiner stj3 = new StringJoiner(".");
        stj3.setEmptyValue("QQ");
        System.out.println("stj3: "+stj3);
    }
}
