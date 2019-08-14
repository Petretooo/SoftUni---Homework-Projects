package com.softuni.entity;

public class Calculator {

    private double leftOperand;
    private String operator;
    private double rightOperand;


    public Calculator(double leftOperand, String operator, double rightOperand) {
        this.leftOperand = leftOperand;
        this.operator = operator;
        this.rightOperand = rightOperand;
    }

    public double getLeftOperand() {
        return leftOperand;
    }

    public String getOperator() {
        return operator;
    }

    public double getRightOperand() {
        return rightOperand;
    }


    public double calculateResult() {
        double result = 0.0;
        switch (this.operator) {
            case "+":
                result = this.leftOperand + this.rightOperand;
                break;
            case "-":
                result = this.leftOperand - this.rightOperand;
                break;
            case "*":
                result = this.leftOperand * this.rightOperand;
                break;
            case "/":
                result = this.leftOperand / this.rightOperand;
                break;
        }
        return result;
    }
}
