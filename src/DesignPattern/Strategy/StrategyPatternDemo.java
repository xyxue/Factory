package DesignPattern.Strategy;

/**
 * 策略模式
 * Created by wy_xue on 2018/3/14.
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());
        System.out.printf("10-5="+context.executeStrategy(10,5  ));
    }
}
