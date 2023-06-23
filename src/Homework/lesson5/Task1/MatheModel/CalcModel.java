package Homework.lesson5.Task1.MatheModel;


import Homework.lesson5.Task1.MVP.IModel;

public abstract class CalcModel implements IModel {
    public double a;
    public double b;

    public String operator;

    public abstract double result();



}
