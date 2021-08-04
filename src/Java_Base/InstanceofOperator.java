package Java_Base;

/**
 * instanceof运算符
 */

public class InstanceofOperator {
    public static void main(String[] args) {
        String a = "sws";
        //a变量属于属于String类型，为true
        Boolean b = a instanceof String;
        System.out.println(b);
        Instanceof i = new Instanceof();
        i.set();
    }
   public static class  Instanceof extends InstanceofOperator{
         public void set(){
             //创建父类的引用指向子类对象（多态）,i引用可以在Instanceof中使用，调用父类的属性和方法（如果
             // 父类某个方法被子类重写，则直接调用子类的该方法）,为true
           InstanceofOperator i = new Instanceof();
           Boolean c = i instanceof Instanceof;
           System.out.println(c);
       }
    }
}
