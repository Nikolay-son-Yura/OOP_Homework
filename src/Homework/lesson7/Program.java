package Homework.lesson7;

import Homework.lesson7.Model.MathModelLes7;
import Homework.lesson7.Presenter.Presenter;
import Homework.lesson7.View.View;


public class Program {
    public static void main(String[] args) {
        var calculator =new Presenter<>(new MathModelLes7(),new View());
        calculator.start();
    }
}
