import DesignPattern.AbstractFactoryPattern.AbstractFactory;
import DesignPattern.AbstractFactoryPattern.Color;
import DesignPattern.AbstractFactoryPattern.ColorFactory;
import DesignPattern.AbstractFactoryPattern.FactoryProducer;
import DesignPattern.FactoryPattern.Circle;
import DesignPattern.FactoryPattern.Rectangle;
import DesignPattern.FactoryPattern.Shape;
import DesignPattern.FactoryPattern.ShapeFactory;

public class Main {

    public static void main(String[] args) {


        AbstractFactory();


    }


    public static void Factory() {
        //<editor-fold desc="工厂设计模式">
        ShapeFactory shapeFactory = new ShapeFactory();
        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();

        Rectangle rectangle = (Rectangle) ShapeFactory.getClass(Rectangle.class);
        rectangle.draw();

        Circle circle = (Circle) ShapeFactory.getClass(Circle.class);
        circle.draw();
        //</editor-fold>
    }

    public static void AbstractFactory() {

        DesignPattern.AbstractFactoryPattern.ShapeFactory shape = (DesignPattern.AbstractFactoryPattern.ShapeFactory) FactoryProducer.getFactory("SHAPE");
        //获取形状为 Circle 的对象
        DesignPattern.AbstractFactoryPattern.Shape shape1 = shape.getShape("CIRCLE");
        shape1.draw();

        //获取颜色工厂

        ColorFactory colorFactory1 = (ColorFactory) FactoryProducer.getFactory("COLOR");
        Color color1 = colorFactory1.getColor("RED");

        color1.fill();

        //<editor-fold desc="错误">
        //        //调用 Circle 的 draw 方法
//        shape1.draw();
//        //获取形状工厂
//        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
//
//        //获取形状为 Circle 的对象
//        Shape shape1 = shapeFactory.getShape("CIRCLE");
//
//        //调用 Circle 的 draw 方法
//        shape1.draw();
        //</editor-fold>

    }
}
