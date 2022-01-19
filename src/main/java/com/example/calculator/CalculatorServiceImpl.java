package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    public String hello(){
        return "Welcome to the Calculator!";
    }

    public String plus(int num1, int num2){
        int sum = num1 + num2;
        return num1 + " + "  + num2 + " = " + sum ;
    }
    public String minus(int num1, int num2){
        int dif = num1 - num2;
        return num1 + " - "  + num2 + " = " + dif ;
    }
    public String multiply(int num1, int num2){
        int mult = num1 * num2;
        return num1 + " * "  + num2 + " = " + mult ;
    }
    public String divide(int num1, int num2){
        if (num2 == 0){
            return "Error! 0 can not be a divider";
        }else {
            int div = num1/num2;
            return num1 + " / " + num2 + " = " + div;
        }
    }

}
