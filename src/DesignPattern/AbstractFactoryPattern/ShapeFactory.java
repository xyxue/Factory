package DesignPattern.AbstractFactoryPattern;

/**
 * Created by wy_xue on 2017/12/7.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }

    public static Object getClass(Class<? extends Shape> clazz) {
        Object object = null;
        try {
            object = Class.forName(clazz.getName()).getInterfaces();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }
}
