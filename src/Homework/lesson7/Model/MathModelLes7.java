package Homework.lesson7.Model;

import Homework.lesson7.LoggerText.FileName;
import Homework.lesson7.LoggerText.LoggerCalc;

public class MathModelLes7 extends MatheModel implements FileName{
    public MathModelLes7(){
    }
    @Override
    public double result() {
        String nameClass = "Calculator";
        double result1 = super.result();;
        switch (operator) {
            case ("//") -> {
                result1 = square();
            }
            case ("^") -> {
                result1 = pow();
            }
        }
        String logger = LoggerCalc.resultLogger(operator, a, b, result1);
        LoggerCalc.setLogger(nameClass, operator, logger);
        return result1;
    }
    protected double square() {
        return Math.sqrt(a);
    }

    protected double pow() {
        return Math.pow(a, b);
    }

}
