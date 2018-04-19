package DesignPattern.BuilderPattern;

/**
 * Created by wy_xue on 2017/12/8.
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}