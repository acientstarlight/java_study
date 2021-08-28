package Java_ObjectOriented;

/**
 * 方法
 */
public class Method {
    String name;

    public void getname1(){
        this.name = name;//得到成员变量name，效果等同于 getname3()
    }

    public void getname2(String names){
        this.name = names;//拿到传入的参数值,效果等同于 getname4()
    }

    public String getname3(){
       return name;//得到成员变量name
    }

    public String getname4(String names){
        return names;//拿到传入的参数值
    }
}
