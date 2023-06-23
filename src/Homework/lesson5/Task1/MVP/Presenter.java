package Homework.lesson5.Task1.MVP;


import Homework.lesson5.Task1.MatheModel.CalcModel;

public class Presenter<T extends CalcModel> {
    View view;
    IModel model;

    public Presenter(T m, View v) {
        model = m;
        view = v;
    }

    public void start() {
        double a = view.getInput("Число а: ");
        char oper = view.getInputOperator("+ - * / ");
        double b = view.getInput("Число b: ");
        model.setA(a);
        model.setOperation(String.valueOf(oper));
        model.setB(b);
        double result = model.result();
        view.print(result, "Результат: ");
    }

}
