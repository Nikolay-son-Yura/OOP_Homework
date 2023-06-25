package Homework.lesson6.Task1.Data;


import Homework.lesson6.Task1.Figure.Heir.Circle;
import Homework.lesson6.Task1.Figure.Heir.Rectangle;
import Homework.lesson6.Task1.Figure.Heir.Square;
import Homework.lesson6.Task1.Figure.Heir.Triangle;
import Homework.lesson6.Task1.Figure.Parent.Figure;

import java.util.ArrayList;

public class Data {

    public ArrayList<Figure> addBase(ArrayList<Figure> arg) {

        arg.add(new Triangle("Треугольник 1", 2.0, 4.9, 6.2));
        arg.add(new Circle("Круг 1", 5.0));
        arg.add(new Square("Квадрат 1", 6.0));
        arg.add(new Rectangle("Прямоугольник 1", 6.0, 10.0));
        return arg;
    }
}
