package Homework.lesson6.Task1.View;

import Homework.lesson6.Task1.Figure.Heir.Circle;
import Homework.lesson6.Task1.Figure.Heir.Rectangle;
import Homework.lesson6.Task1.Figure.Parent.Figure;
import Homework.lesson6.Task1.Figure.Parent.Polygon;

public class PrintFigure {

    public void print(Figure arg) {
        if (arg instanceof Circle) {
            System.out.println(arg.getName() +
                    "\n радиус: " + ((Circle) arg).getRadius() +
                    "\n длина окружности : " + ((Circle) arg).getLen() +
                    "\n имеет площадь: " + arg.getArea());
        } else {
            int count = 0;
            while (count <= ((Polygon) arg).getNumberOfSides()) {
                System.out.println(arg.getName() +
                        "\n Стороны " + count + " : " + ((Rectangle) arg).getSides(count));
                count++;
            }
            System.out.println("Площадь треугольника: " + arg.getArea() +
                    "\n Периметр треугольника: " + ((Rectangle) arg).getPeremetr());
        }
    }
}

