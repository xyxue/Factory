package DesignPattern.SingletonPattern;

/**
 * Created by wy_xue on 2017/12/8.
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    /*
    priate 私有类 只能在类种访问 不能再其他类访问
     */
    private  SingleObject ()
    {

        //私有构造方法，只能由该类本身调用
    }


    /**
     * static 静态方法，不依赖创建对象 就可以直接访问的方法
     * @return
     */
    public  static  SingleObject getInstance()
    {
        return  instance;
    }

    public void showMessage()
    {
        System.out.print("hello world");
    }
}
