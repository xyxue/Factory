package DesignPattern.AbstractFactoryPattern;

/**
 * Created by wy_xue on 2017/12/7.
 */

/**
 * 抽象类
 * <p>
 * <p>
 * abstract 关键字可以修饰类或方法。
 * abstract 类可以扩展（增加子类），但不能直接实例化。
 * abstract 方法不在声明它的类中实现，但必须在某个子类中重写。
 */
public abstract class AbstractFactory {

    /**
     * dfadf
     * @param color
     * @return
     */
    abstract  Color getColor(String color);

    /**
     * dfadf
     * @param chape
     * @return
     */
    abstract Shape getShape(String chape);
}
