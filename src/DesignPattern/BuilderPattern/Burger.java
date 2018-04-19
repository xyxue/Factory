package DesignPattern.BuilderPattern;

import java.util.Iterator;

/**
 * Created by wy_xue on 2017/12/8.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
    @Override
    public abstract float price();
}
