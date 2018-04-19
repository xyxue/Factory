package DesignPattern.AbstractFactoryPattern;

/**
 * Created by wy_xue on 2017/12/7.
 */

/**
 * implements 用户继承接口 extends 用于继承父类
 */
public class Blue implements   Color {
    @Override
    public  void fill ()
    {
        System.out.println("Inside Blue::fill() method.");
    }
}
