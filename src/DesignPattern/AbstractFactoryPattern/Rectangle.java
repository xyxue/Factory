package DesignPattern.AbstractFactoryPattern;

/**
 * Created by wy_xue on 2017/12/7.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
