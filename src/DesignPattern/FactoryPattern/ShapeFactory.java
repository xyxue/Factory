package DesignPattern.FactoryPattern;

/**
 * Created by wy_xue on 2017/12/7.
 *
 * 工厂类
 */
public class ShapeFactory {

    /**
     * 最简单的工厂类，缺点，每次新增加一个Shape的继承子类，都需要加一条 else if 语句。当工厂类后续不断壮大，会导致难以维护。
     *
     * @param shapeType
     * @return
     */
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


    //反射机制 解决每次增加一个产品，都要增加一个对象实现工厂的缺点

    /**
     * 定义一个静态方法，可以直接用类名点取得到
     *
     * @param clazz 限定一定是要继承Shape类的子类
     * @return
     */
    public static Object getClass(Class<? extends Shape> clazz) {
        Object obj = null;

        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return obj;


    }
}
