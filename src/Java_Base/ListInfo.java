package Java_Base;

import java.util.*;
import java.util.List;

/**
 * 定义和打印数组
 * 数组作为函数的参数
 * 数组作为函数的返回值
 * 多维数组定义和引用
 * Arrays sort排序
 */

public class ListInfo {
    int[] list4;
    public void countList() {
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
        //方法一：for循环遍历数组
        for (int i = 0;i<list3.length;i++){
            System.out.println("第"+(i+1)+"个元素值为："+list3[i]);
        }
        //一个个分别打印出数组的元素
        //方法二：for each循环打印数组
        for(int n : list3){
            System.out.println(n+"");
        }

        //声明数组并且赋值
        double[] list = new double[5];
        list[0] = 1.1;
        list[1] = 6.2;
        list[2] = 3.3;
        list[3] = 6.4;
        list[4] = 5.5;
        //求出数组中最大的值
        double max = 0;
        for(int i =0;i<list.length;i++){
            if(max<list[i]){
                max = list[i];
            }
        }
        System.out.println("double数组的最大值为： "+max);
    }

    //数组作为函数的参数
    public void printList(int[] a){
        System.out.println("数组为： "+a);
    }

    public void doubleList(){
        //多维数组的定义输出
        String strings[][] = new String[2][3];
        //strings[0] = new String[2];
        //strings[1] = new String[3];
        strings[0][0] = new String("A: ");
        strings[0][1] = new String("B:");
        strings[1][0] = new String("1");
        strings[1][1] = new String("2");
        strings[1][2] = new String("3");
        System.out.println("二维数组输出为："+Arrays.toString(strings));
        //多维数组的另一种定义
        int[][] ints = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11}
        };

        System.out.println(Arrays.asList(ints));
    }

//    @Override
//    public String toString(){
//        return ""+ Arrays.toString(list4);
//    }

    //数组作为函数的返回值
    public static int[] get(int[] b){
        b = new int[]{5, 6, 7};
        int[] res = b;
        System.out.println(""+res);
        return res;
    }


    public void sort() {
        int[] sortNum = {1, 3, 5, 2, 4, 1, 3, 9, 7};
        //Arrays 排序(默认升序)
        Arrays.sort(sortNum);
        System.out.println("" + Arrays.toString(sortNum));
//        System.out.println(""+Arrays.asList(sortNum));
        for (int i = 0; i < sortNum.length; i++) {
            System.out.print(+sortNum[i] + "\t");
        }
        //Arrays list排序(升序)
        List<Integer> list = new LinkedList<Integer>();
        Collections.sort(list);
        list.add(1);
        list.add(55);
        list.add(9);
        list.add(0);
        list.add(2);
        for (Integer n:list){
            System.out.print(""+n+"\t");
        }
    }

    public static void main(String[] args) {
        ListInfo listInfo = new ListInfo();
        listInfo.countList();
        int[] a = new int[]{1,2,3};
        listInfo.printList(a);
        int[] b=new int[]{10,11,12};
        get(b);
        listInfo.doubleList();
        listInfo.list4 = new int[]{11, 12, 13};
        System.out.println("111"+ Arrays.toString(listInfo.list4));
        listInfo.sort();
    }

}
