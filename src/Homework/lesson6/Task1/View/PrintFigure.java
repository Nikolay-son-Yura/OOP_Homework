package Homework.lesson6.Task1.View;

import Homework.lesson6.Task1.Figure.Heir.Circle;
import Homework.lesson6.Task1.Figure.Heir.Rectangle;
import Homework.lesson6.Task1.Figure.Parent.Figure;
import Homework.lesson6.Task1.Figure.Parent.Polygon;

import java.util.ArrayList;

public class PrintFigure {

    public void print(ArrayList<Figure> arg) {
        for (Figure item : arg) {
            if (item instanceof Circle) {
                System.out.println(item.getName() +
                        "\n радиус: " + ((Circle) item).getRadius() +
                        "\n длина окружности : " + ((Circle) item).getLen() +
                        "\n имеет площадь: " + item.getArea());
            } else {
                int count = 1;
                while (count <= ((Polygon) item).getNumberOfSides()) {
                    System.out.println(item.getName() +
                            "\n Стороны " + count + " : " + ((Polygon) item).getSides(count-1));
                    count++;
                }
                System.out.println("Площадь фигуры: " + item.getArea() +
                        "\n Периметр фигуры: " + ((Polygon) item).getPeremetr());
            }
            System.out.println();
        }
    }
}

