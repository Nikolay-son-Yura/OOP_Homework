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
}
