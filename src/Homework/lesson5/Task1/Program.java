package Homework.lesson5.Task1;


import Homework.lesson5.Task1.MVP.Presenter;
import Homework.lesson5.Task1.MVP.View;
import Homework.lesson5.Task1.MatheModel.MatheModel;

public class Program {
    public static void main(String[] args) {
        var calculator =new Presenter<>(new MatheModel(),new View());
        calculator.start();
    }
}
