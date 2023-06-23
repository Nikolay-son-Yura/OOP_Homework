package Homework.lesson5.Task1.MatheModel;


public class MatheModel extends CalcModel {
    public MatheModel() {

    }

    @Override
    public double result() {
        double result = 0;
        switch (operator) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> result = a / b;
        }
        return result;
    }


    @Override
    public void setA(double arg) {
        super.a = arg;
    }

    @Override
    public void setB(double arg) {
        super.b = arg;
    }

    @Override
    public void setOperation(String arg) {
        super.operator = arg;
    }


}
