package com.example.kalkulator;

class Calculator {

    public double add(double first, double second){
        return first + second;
    }

    public double sub(double first, double second){
        return first - second;
    }

    public double mul(double first, double second){
        return first * second;
    }

    public double div(double first, double second){
        if(second == 0) throw new ArithmeticException("Division by zero");
        return first / second;
    }
}

class App{
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println(calc.add(5.4, 2.3));
        System.out.println(calc.sub(5.4, 2.3));
        System.out.println(calc.mul(5.4, 2.3));
        System.out.println(calc.div(5.4, 2.3));
    }
}
