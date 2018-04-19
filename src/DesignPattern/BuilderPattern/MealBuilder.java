package DesignPattern.BuilderPattern;

/**
 * Created by wy_xue on 2017/12/8.
 */
public class MealBuilder {


    public  Meal prepareVegMeal ()
    {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());

        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
