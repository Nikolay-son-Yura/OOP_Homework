package Homework.lesson7.LoggerText;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerCalc implements FileName {
    public static void setLogger(String nameClass, String nameMethod, String result) {

        Logger logger = Logger.getLogger("Calculator");

        try {
            FileHandler fileHandler = new FileHandler(FileName, true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setUseParentHandlers(false);
            logger.logp(Level.INFO, nameClass, nameMethod,result);
            fileHandler.close();
        } catch (Exception e) {
            logger.logp(Level.WARNING, nameClass, nameMethod, "Ошибка логирования.");
        }
    }
    public static String resultLogger(String operator,double a,double b,double result) {
        String logger;
        if (operator.equals("/") && b == 0) {
            logger = a + " на ноль делить нельзя ";
        }
        if (operator.equals("//")) {
            logger = "квадратный корень из " + a + " = " + result;
        }
        if (operator.equals("^")) {
            logger = a + " в степени " + b + " = " + result;
        } else {
            logger = a + operator + b + " = " + result;
        }
        return logger;
    }
}
