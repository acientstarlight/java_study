package Java_ObjectOriented;

/**
 * 方法的重载
 */
public class Overload {
    public void get(){
        int a = 2;
        System.out.println("A:\t"+a);
    }

    public static void get(String a,int b){
        System.out.println("方法的重载");
    }

    public String get(String a){
        return a;

    }

    public String get(String a,int[] c) throws Exception{
        try {
            System.out.println("2021");
        }catch (Exception e){
            e.printStackTrace();
        }
        return a;

    }

    public static void main(String[] args) throws Exception {
        Overload ov = new Overload();
        ov.get();
        ov.get("a");
        int[] a = {1,2,3};
        ov.get("s",a);
        get("w",2);
    }

}
