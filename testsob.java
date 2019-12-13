package lab1;

import java.lang.*;
public class testsob {
    public static void main(String[] args) {
        sob d1 = new sob("Ray", 2);
        sob d2 = new sob("Muke", 7);
        sob d3 = new sob("Rob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
