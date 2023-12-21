package test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Test test = new Test(new int[]{5, -12, 7 ,9, -15});
        System.out.println(test.max());
        System.out.println(test.min());
        System.out.println(test.get(true));
        System.out.println(test.get(false));
      //  test.invert();
       // test.positive();
        test.changeSign(true);


    }


}
