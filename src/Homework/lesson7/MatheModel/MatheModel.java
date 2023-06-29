package Homework.lesson7.MatheModel;

import Homework.lesson7.LoggerText.FileName;
import Homework.lesson7.LoggerText.LoggerCalc;
import Homework.lesson7.Model.CalcModel;

public class MatheModel extends CalcModel implements FileName {
    public MatheModel() {
    }

    @Override
    public double result() {
        String nameClass = "Calculator";
        double result = 0;
        switch (operator) {
            case ("+") -> {
                result = a + b;
            }
            case ("-") -> {
                result = a - b;
            }
            case ("*") -> {
                result = a * b;
            }
            case ("/") -> {
                if (b == 0) {
                    System.out.println("на ноль делить нельзя.");
                } else {
                    result = a / b;
                }
            }
            case ("//") -> {
                result = Math.sqrt(a);
            }
            case ("^") -> {
                result = Math.pow(a, b);
            }
        }
        String resultLog;
        if (operator.equals("/") && b == 0) {
            resultLog = a + " на ноль делить нельзя ";
        } else {
            resultLog = a + operator + b + " = " + result;
        }
        LoggerCalc.setLogger(nameClass, operator, resultLog);
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
