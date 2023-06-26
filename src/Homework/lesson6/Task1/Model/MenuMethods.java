package Homework.lesson6.Task1.Model;

import Homework.lesson6.Task1.Figure.Heir.Circle;
import Homework.lesson6.Task1.Figure.Parent.Figure;
import Homework.lesson6.Task1.Figure.Parent.Polygon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MenuMethods {

    static Scanner scanner = new Scanner(System.in);
    public void getAllParameter(ArrayList<Figure> arg) {
        Double perimeter = 0.0;
        int index = 0;
        for (Figure item : arg) {
            if (item instanceof Polygon) {
                index++;
                perimeter += ((Polygon) item).getPerimeter();
            }
        }
        System.out.println("Периметр " + index + " возможных фигур = " + perimeter + ";");
    }

    public void getAreaAll(ArrayList<Figure> arg) {
        Double square = 0.0;
        int index = 0;
        for (Figure item : arg) {
            index++;
            square += item.getArea();
        }
        System.out.println("Площадь " + index + " возможных фигур = " + square + ";");
    }

    public void getAllParameters(ArrayList<Figure> arg) {
        Double square = 0.0;
        Double perimeter = 0.0;
        Double circumference = 0.0;
        int index = 0;
        for (Figure item : arg) {
            index++;
            square += item.getArea();
        }
        System.out.println("Площадь всех возможных " + index + " фигур = " + square + ";");
        index = 0;
        for (Figure item : arg) {
            if (item instanceof Polygon) {
                index++;
                perimeter += ((Polygon) item).getPerimeter();
            }
        }
        System.out.println("Периметр всех возможных " + index + " фигур = " + perimeter + ";");
        index = 0;
        for (Figure item : arg) {
            if (item instanceof Circle) {
                index++;
                circumference += ((Circle) item).getLen();
            }
        }
        System.out.println("Длина окружности всех возможных " + index + " фигур = " + circumference + ";");
        index = 0;
    }

    public void countList(ArrayList<Figure> arg) {
        int count = 0;
        for (Figure i : arg) {
            System.out.println(count + "-" + i.getName() + ";");
            count++;
        }
    }

    public void removeFigure(ArrayList<Figure> arg) {
        System.out.println("Какую фигуру удалить?");
        int index = scanner.nextInt();
        arg.remove(index);
    }

    public void sortAll(ArrayList<Figure> arg) {
        Collections.sort(arg);
        System.out.println("-----Фигуры отсортированы по размеру площади-----");
    }
}

