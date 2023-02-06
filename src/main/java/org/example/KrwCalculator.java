package org.example;

public class KrwCalculator implements iCalculator{

    private int price = 1;
    @Override
    public int sum(int x, int y) {
        y *= price;
        x *= price;
        return x + y;
    }

    @Override
    public int minus(int x, int y) {
        y *= price;
        x *= price;
        return x - y;
    }
}
