package DesignPattern.Strategy;

/**
 * Created by wy_xue on 2018/3/14.
 */
public class OperationAdd implements  Strategy{
    @Override
    public  int doOperation(int num1,int num2)
    {
return num1+num2;

    }
}
