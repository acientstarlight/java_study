package Java_Base;

import java.util.*;

/**
 * 定义和打印数组
 * 数组作为函数的参数
 * 数组作为函数的返回值
 * 多维数组定义和引用
 * Arrays sort排序
 */

public class List1 {
    int[] list4;
    boolean flag;

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
        List list6 = new ArrayList();
        list6.get(0);
        list6.set(0,"2");

        //遍历整个数组
        //方法一 ：Arrays.toString(list)(为Sting类型)
        System.out.println("方法一："+ Arrays.toString(list3));
        String a = Arrays.toString(list3);

        //遍历整个数组
        //方法二：Arrays.toString(list)
        System.out.println("方法二："+Arrays.asList(list3));

        //遍历整个数组打印出,历数组
        //方法一：for循环打印数组
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

    //数组的冒泡排序
    //对数组从小到大排序
    public int[] bubbleSort(int[] num){
        int temp;
        int i;
        for(i=0;i<num.length-1;i++) {
            flag = true; //在方法中定义全局变量flag(见上方)，在此处初始化值
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    //每一轮删选出最大的数，方式：从第一个数开始比较，如果前面大则交换前面一
                    // 个数和后面一个数的值，把更大的数放到后面，除了最大数确定，剩余其他的数的大小关系不知道，
                    //所以下一轮去除j个数的剩余数重新进行少选出最大的数到最后，以此类推，直到i=num.length结束

                    //两个数的值互换
                    //先保留num[j+1]原来的值
                    temp = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = temp;
                    //发生了元素交换
                    flag = false;
                    System.out.println("正在在第"+(i+1)+"轮排序,此时调整后的数组为\n"+Arrays.toString(num));
                }
            }
            //如果此轮没有发生元素交换说明此时排序已经完成，则不需要进行下一轮的i循环
            if(flag) {
                System.out.println("在第"+(i+1)+"轮完成了排序");
                break;
            }
        }
        return num;
    }

    //sort排序（默认升序）
    public void sort() {
        int[] sortNum = {1, 3, 5, 2, 4, 1, 3, 9, 7};
        //Arrays 排序(默认升序)
        Arrays.sort(sortNum);
        System.out.println("" + Arrays.toString(sortNum));
//      System.out.println(""+Arrays.asList(sortNum));
        for (int i = 0; i < sortNum.length; i++) {
            System.out.print(""+sortNum[i] + "\t");
        }
        //Arrays list排序(升序)
        java.util.List<Integer> list = new LinkedList<Integer>();
        Collections.sort(list);
        list.add(1);
        list.add(55);
        list.add(9);
        list.add(0);
        list.add(2);
        for (Integer n:list){
            System.out.println(""+n+"\t");
        }
    }

    //降序排序(利用Collections的reverseOrder方法)
    public Integer[] sortDescReverseOrder(Integer[] numbers){
        Arrays.sort(numbers,Collections.reverseOrder());
        System.out.println("降序排序后的数组为： "+Arrays.toString(numbers));
        return numbers;
    }

    //降序排序(利用Comparator接口复写compare方法)
    public Integer[] sortDescComparator(Integer[] numbers){
        //注意，要想改变默认的排列顺序，不能使用基本类型（int-Integer,double-Double, char-Character,）,而要使用它们对应的类
       Comparator comparator = new MyCompator();
       Arrays.sort(numbers,comparator);
        System.out.println("降序排序后的数组为： "+Arrays.toString(numbers));
        return numbers;
    }

    //实现Comparator接口
    class MyCompator implements Comparator<Integer>{
        @Override
        public int compare(Integer a,Integer b){
            return a > b ? -1 : 1;
        }
    }

    public static void main(String[] args) {
        List1 listOperate = new List1();

        listOperate.countList();

        int[] a = new int[]{1,2,3};
        listOperate.printList(a);

        int[] b=new int[]{10,11,12};
        get(b);
        listOperate.doubleList();

        listOperate.list4 = new int[]{11, 12, 13};
        System.out.println("111"+ Arrays.toString(listOperate.list4));

        listOperate.sort();;

        int[] ns = {1,2,3,11,21,22,9,10,8};
        int[] numsort = listOperate.bubbleSort(ns);
        System.out.println("排序后的num："+Arrays.toString(numsort));

        Integer[] numbers = new Integer[]{1,3,5,1,2,18,24,12};
        listOperate.sortDescReverseOrder(numbers);

        Integer[] numbers2 = new Integer[]{1,3,5,1,2,18,24,12};
        listOperate.sortDescComparator(numbers2);


    }

}
