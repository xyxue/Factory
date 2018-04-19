package DesignPattern.PrototypePattern;

/**
 * Created by wy_xue on 2017/12/11.
 */
public class PrototypePatternDemo {

    public static void main(String []args)
    {

        ShapeCache.loadCache();

        Shape clonedShape =  ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 =ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
