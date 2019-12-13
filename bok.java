package lab1;

import java.lang.*;
public class bok{
    private String color;
    private int page;


    public bok() {
        color = "pink";
        page = 10;
    }
    public bok(int p) {
        color = "pink";
        page = p;
    }
    public bok(int p, String c) {
        color = c;
        page = p;
    }

    public int getPage() {
        return page;
    }
    public String getColor() {
        return color;
    }
}

