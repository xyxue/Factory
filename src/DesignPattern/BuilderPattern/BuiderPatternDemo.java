package DesignPattern.BuilderPattern;

/**
 * Created by wy_xue on 2017/12/8.
 * 建造者模式
 */
public class BuiderPatternDemo {
    public  static void main(String [] args )
    {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.print("veg Meal");
        vegMeal.showItems();
        System.out.print("Total Cost:"+vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}
