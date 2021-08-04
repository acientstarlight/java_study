package Java_Base;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 数组
 */

public class List {
    public static void main(String[] args) {
        int[] list1 = new int[]{1,2,3,4,5};
        int[] list2 = {1,2,3,4,5};
        System.out.println(list1[0]);
        System.out.println(list2[0]);
        System.out.println(list2.length);
        //重新在堆中创建了一个新的数组，把原数组标签list1撕下来贴到了新数组上面而已。原来的数组长度并没有改变，
        // 没有标签的原数组内存空间会按照回收机制被回收。
        list1 = new int[]{6,7,8};
        System.out.println(list1.length);
        int[] list3 = new int[2];
        //数组的赋值
        list3[0] = 9;
        list3[1] = 10;

        //打印整个数组
        //方法一 ：Arrays.toString(list)(为Sting类型)
        System.out.println("方法一："+ Arrays.toString(list3));
        String a = Arrays.toString(list3);

        //打印整个数组
        //方法二：Arrays.toString(list)
        System.out.println("方法二："+Arrays.asList(list3));

        //一个个分别打印出数组的元素
        //方法一：遍历数组
        for (int i = 0;i<list3.length;i++){
            System.out.println("第"+(i+1)+"个元素值为："+list3[i]);
        }
        //一个个分别打印出数组的元素
        //方法二：循环打印数组
        for(int n : list3){
            System.out.println(n+"");
        }



    }

}
