package Homework.lesson7;

import Homework.lesson7.MatheModel.MatheModel;

import Homework.lesson7.Presenter.Presenter;
import Homework.lesson7.View.View;


public class Program {
    public static void main(String[] args) {
        var calculator =new Presenter<>( new MatheModel(),new View());
        calculator.start();
    }
}
