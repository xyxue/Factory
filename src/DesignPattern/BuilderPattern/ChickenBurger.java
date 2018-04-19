package DesignPattern.BuilderPattern;

/**
 * Created by wy_xue on 2017/12/8.
 */
public class ChickenBurger extends  Burger {
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
