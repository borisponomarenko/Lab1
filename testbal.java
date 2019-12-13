package lab1;

import java.lang.*;
public class testbal {
    public static void main(String[] args) {

        bal b1 = new bal(1.5, "blue");
        System.out.println(" Weight is " +b1.getWeight()

                +" Color is " + b1.getColor());

        bal b2 = new bal(3.0);
        System.out.println(" Weight is " +b2.getWeight()
                + " Color is " + b2.getColor());

        bal b3 = new bal (1, "white");
        System.out.println(" Weight is " +b3.getWeight()
                + " Color is " + b3.getColor());
    }
}
