package DesignPattern.AbstractFactoryPattern;

/**
 * Created by wy_xue on 2017/12/7.
 */

/**
 * 工厂创造器
 */
public class FactoryProducer  {

public  static  AbstractFactory getFactory (String choice)
{
    if(choice.equalsIgnoreCase("SHAPE")){
        return new ShapeFactory();
    } else if(choice.equalsIgnoreCase("COLOR")){
        return new ColorFactory();
    }
    return null;
}

}
