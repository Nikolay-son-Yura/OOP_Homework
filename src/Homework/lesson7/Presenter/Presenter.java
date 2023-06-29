package Homework.lesson7.Presenter;

import Homework.lesson7.Model.CalcModel;
import Homework.lesson7.View.View;

public class Presenter<T extends CalcModel> {
    View view;
    CalcModel model;

    public Presenter(T m, View v) {
        model = m;
        view = v;
    }

    public void start() {
        String oper = view.getInputOperator("""
                 + сложить\s
                 - вычесть
                 * умножить
                 / разделить
                 // квадратный корень из a
                 ^  а возвести в степень b \
                """);
        System.out.println();
        model.setOperation(String.valueOf(oper));
        if (oper.equals("//")) {
            double a = view.getInput("Число а: ");
            model.setA(a);
            double result = model.result();
            view.print(result, "Результат: ");
        } else {
            double a = view.getInput("Число а: ");
            double b = view.getInput("Число b: ");
            model.setA(a);
            model.setB(b);
            double result = model.result();
            view.print(result, a + oper + b + " =");
        }

    }

}
