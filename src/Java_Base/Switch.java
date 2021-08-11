package Java_Base;

/**
 * switch语句
 */

public class Switch {
    public void switch1(){
        int num = 1;
        String  name = "cao";
        int b;
        switch (name){
            case "li":
                //可以在case语句块中给白能量赋值
                b = 1;
                System.out.println("第"+b+"次选择了li");
                break;
            case "wang":
                b = 2;
                System.out.println("第"+b+"次选择了wang");
                break;
                //可以同时写多个case，来满足匹配到其中一个值时，也可以输出
            case "cao":
            case "zhang":
                b = 3;
                System.out.println("第"+b+"次选择了cao或者zhang");
                break;
                //如果匹配不成功默认返回default
            default:
                System.out.println("没有选择到");
        }
        //System.out.println("最终选到了");(一般没有必要写)
    }

    public static void main(String[] args) {
        Switch switch1 = new Switch();
        switch1.switch1();
    }
}
