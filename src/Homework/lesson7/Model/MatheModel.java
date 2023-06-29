package Homework.lesson7.Model;

public class MatheModel extends CalcModel {
    public MatheModel() {
    }

    @Override
    public double result() {

        double result = 0;
        switch (operator) {
            case ("+") -> {
                result = addition();
            }
            case ("-") -> {
                result = subtraction();
            }
            case ("*") -> {
                result = multiplication();
            }
            case ("/") -> {
                result = division();
            }
        }
        return result;
    }

    private double addition() {
        return a + b;
    }

    private double subtraction() {
        return a - b;
    }

    private double division() {
        if (b == 0) {
            System.out.println("на ноль делить нельзя.");
        }
        return a / b;
    }

        private double multiplication () {
            return a * b;
        }

        @Override
        public void setA ( double arg){
            super.a = arg;
        }

        @Override
        public void setB ( double arg){
            super.b = arg;
        }

        @Override
        public void setOperation (String arg){
            super.operator = arg;
        }
    }
