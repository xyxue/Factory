package DesignPattern.JDK1_8;

/**
 * Created by wy_xue on 2018/3/19.
 */
public interface TestInterface

{

    default  String get(String aa,String bb)
    {
        System.out.println("我是jdk1.8默认实现方法...");
        return "";
    }

    String aa = "2222222";

    //这个是静态方法
        static void staticmethod(){System.out.println("我是静态方法"+aa);}
}
