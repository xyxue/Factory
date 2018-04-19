package DesignPattern.PrototypePattern;

/**
 * Created by wy_xue on 2017/12/11.
 */
public class Rectangle extends Shape {

    public Rectangle()
    {
        type = "Rectangle";
    }

    @Override
    public void draw()
    {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
