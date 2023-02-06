package org.example;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(new KrwCalculator());

        System.out.println(calculator.sum(10, 10));
    }
}