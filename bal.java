package lab1;

import java.lang.*;
public class bal {
    private double weight;
    private String color;

    private bal() {
        weight = 1.2;
        color = "green";
    }
    public bal(double w) {
        weight = w;
        color = "blue";
    }
    public bal (double w, String c) {
        weight = w;
        color = c;
    }

    public double getWeight() {
        return weight;
    }
    public String getColor() {
        return color;
    }
}