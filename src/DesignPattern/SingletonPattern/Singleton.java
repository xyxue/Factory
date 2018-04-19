package DesignPattern.SingletonPattern;

/**
 * Created by wy_xue on 2018/4/17.
 */
public class Singleton {

    private  static  Singleton instance;
    private  Singleton (){}

    //不支持多线程 线程不安全
    public  static  Singleton getInstance()
    {

        if(instance == null)
        {
            instance = new Singleton();
        }
        return  instance;
    }

    //线程安全 ，lazy loading ，
    //缺点，效率低

    /**
     * 这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
     优点：第一次调用才初始化，避免内存浪费。
     缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
     getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
     * @return
     */
    public static  synchronized  Singleton getInstance2()
    {

        if(instance == null)
        {
            instance = new Singleton();
        }
        return  instance;
    }

}
