package org.example;

public class DollarCalculator implements iCalculator{

    private int price = 1;
    private MarketApi marketApi;

    public void init(){
        this.price = marketApi.connect();
    }

    public DollarCalculator(MarketApi marketApi){
        this.marketApi = marketApi;
    }

    @Override
    public int sum(int x, int y) {
        x *= price;
        y *= price;
        return x + y;
    }

    @Override
    public int minus(int x, int y) {
        x *= price;
        y *= price;
        return x - y;

    }
}