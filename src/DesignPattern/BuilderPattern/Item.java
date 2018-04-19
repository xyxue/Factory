package DesignPattern.BuilderPattern;

/**
 * Created by wy_xue on 2017/12/8.
 * 食物条目接口
 */
public interface Item {
    public String name();

    public Packing packing();

    public float price();

}
