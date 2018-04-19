package DesignPattern.BuilderPattern;

/**
 * Created by wy_xue on 2017/12/8.
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
