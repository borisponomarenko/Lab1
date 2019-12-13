package lab1;

import java.lang.*;
public class testbok {
    public static void main(String[] args) {
        bok b1 = new bok(20, "white");
        System.out.println("Pages "+ b1.getPage()
                +" color is " + b1.getColor());

        bok b2 = new bok(15);
        System.out.println("Pages " + b2.getPage()
                + " color is " + b2.getColor());

        bok b3 = new bok(12 , "grey");
        System.out.println("Pages " + b3.getPage()
                +" color is " + b3.getColor());
    }
}