package org.example;

public class Calculator {

    private iCalculator iCalculator;

    public Calculator(iCalculator iCalculator){
        this.iCalculator = iCalculator;
    }

    public int sum(int x, int y){
        return this.iCalculator.sum(x,y);
    }

    public int minus(int x, int y){
        return this.iCalculator.minus(x,y);
    }
}
