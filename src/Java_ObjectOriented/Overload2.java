package Java_ObjectOriented;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 子类重载父类的方法
 */
public class Overload2 extends Overload{
    //重写父类的get方法
    public static void get(int[] a){
        System.out.println(""+ Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] list = new int[]{1, 2, 3};
        get(list);
    }
}
