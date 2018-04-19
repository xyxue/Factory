package DesignPattern.PrototypePattern;

/**
 * Created by wy_xue on 2017/12/11.
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
