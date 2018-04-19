package DesignPattern.JDK1_8;


import java.util.Arrays;
import java.util.*;

/**
 * Created by wy_xue on 2018/3/19.
 */
public class demo {


    public void test() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        try {
            Collections.sort(names, (String a, String b) -> {
                return a.compareTo(b);
            });

            Collections.sort(names, (String a, String b) -> b.compareTo(a));

            Collections.sort(names, (a, b) -> a.compareTo(b));


        } catch (Exception e) {
            e.printStackTrace();
        }

        names.forEach(s -> System.out.println(s.toString()));

        TestInterface.staticmethod();
    }


    public static void main(String[] args) {

        //缩小转换
        int i = 13;
        byte b = (byte) i;

        //放大转换
        byte a = 11;
        int k = a;


        int z = 1;


        System.out.println("z++ : " + z++);
        System.out.println("~z : " + ~z);

        int y = 1;


        System.out.println("--y : " + --y);
        System.out.println("y : " + y);


    }
}
