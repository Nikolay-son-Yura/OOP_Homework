package Homework.lesson6.Task1.Model;

import Homework.lesson6.Task1.Figure.Heir.Circle;
import Homework.lesson6.Task1.Figure.Heir.Rectangle;
import Homework.lesson6.Task1.Figure.Heir.Square;
import Homework.lesson6.Task1.Figure.Heir.Triangle;
import Homework.lesson6.Task1.Figure.Parent.Figure;
import Homework.lesson6.Task1.Figure.Parent.Polygon;
import Homework.lesson6.Task1.View.PrintFigure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/** По всем параметрам этот класс является "божественным"*/

public class MenuMethods {
    public AddFigure addFigure;
    PrintFigure print;
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Figure> allFigure = new ArrayList<>();


//    public ArrayList<Figure> addData() {
//        allFigure.g
//        return allFigure;
//    }


    public void infoAll() {
        for (var figure : allFigure) {
            print.print(figure);

        }
    }

    public void getAllParameter() {
        Double perimeter = 0.0;
        int index = 0;
        for (Figure item : allFigure) {
            if (item instanceof Polygon) {
                index++;
                perimeter += ((Polygon) item).getPeremetr();
            }
        }
        System.out.println("Периметр " + index + " возможных фигур = " + perimeter + ";");
    }

    public void getAreaAll() {
        Double square = 0.0;
        int index = 0;
        for (Figure item : allFigure) {
            index++;
            square += item.getArea();
        }
        System.out.println("Площадь " + index + " возможных фигур = " + square + ";");
    }


    public void figureChange() {//вот тут тоже требуется вынести в отдельный класс и сделать намного проще
        int count = 0;
        for (Figure i : allFigure) {
            System.out.println(count + "-" + i.getName() + ";");
            count++;
        }
        System.out.println("Какую фигуру изменим?:");
        int choice = scanner.nextInt();
        //можно через создание новой фигуры, но я решил сделать так
        if (allFigure.get(choice) instanceof Square) {
            System.out.println("Какое поле менять будем?: ");
            System.out.println("1-Название фигуры\n2-Сторону");
            int n = scanner.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.println("Введите новое название: ");
                    String newName = scanner.next();
                    allFigure.get(choice).setName(newName);
                }
                case 2 -> {
                    System.out.println("Введите новое значение сторон: ");
                    double newSides = scanner.nextDouble();
                    ((Square) allFigure.get(choice)).setSides(new Double[]{newSides, newSides});
                }
            }
        }
        if (allFigure.get(choice) instanceof Circle) {
            System.out.println("Какое поле менять будем?: ");
            System.out.println("1-Название фигуры\n2-Радиус");
            int n = scanner.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.println("Введите новое название: ");
                    String newName = scanner.next();
                    allFigure.get(choice).setName(newName);
                }
                case 2 -> {
                    System.out.println("Введите новое значение радиуса: ");
                    double newRadius = scanner.nextDouble();
                    ((Circle) allFigure.get(choice)).setRadius(newRadius);
                }
            }
        }
        if (allFigure.get(choice) instanceof Rectangle) {
            System.out.println("Какое поле менять будем?: ");
            System.out.println("1-Название фигуры\n2-стороны");
            int n = scanner.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.println("Введите новое название: ");
                    String newName = scanner.next();
                    allFigure.get(choice).setName(newName);
                }
                case 2 -> {
                    System.out.println("Введите новое значение стороны А: ");
                    double newSidesA = scanner.nextDouble();
                    System.out.println("Введите новое значение стороны B: ");
                    double newSidesB = scanner.nextDouble();
                    ((Rectangle) allFigure.get(choice)).setSides(new Double[]{newSidesA, newSidesB});
                }
            }
        }
        if (allFigure.get(choice) instanceof Triangle) {
            System.out.println("Какое поле менять будем?: ");
            System.out.println("1-Название фигуры\n2-стороны");
            int n = scanner.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.println("Введите новое название: ");
                    String newName = scanner.next();
                    allFigure.get(choice).setName(newName);
                }
                case 2 -> {
                    System.out.println("Введите новое значение стороны А: ");
                    double newSidesA = scanner.nextDouble();
                    System.out.println("Введите новое значение стороны B: ");
                    double newSidesB = scanner.nextDouble();
                    System.out.println("Введите новое значение стороны C: ");
                    double newSidesC = scanner.nextDouble();
                    ((Triangle) allFigure.get(choice)).setSides(new Double[]{newSidesA, newSidesB, newSidesC});
                }
            }
        }
        System.out.println("Параметры изменены");
    }

    public void getAllParameters() {
        Double square = 0.0;
        Double perimeter = 0.0;
        Double circumference = 0.0;
        int index = 0;
        for (Figure item : allFigure) {
            index++;
            square += item.getArea();
        }
        System.out.println("Площадь всех возможных " + index + " фигур = " + square + ";");
        index = 0;
        for (Figure item : allFigure) {
            if (item instanceof Polygon) {
                index++;
                perimeter += ((Polygon) item).getPeremetr();
            }
        }
        System.out.println("Периметр всех возможных " + index + " фигур = " + perimeter + ";");
        index = 0;
        for (Figure item : allFigure) {
            if (item instanceof Circle) {
                index++;
                circumference += ((Circle) item).getLen();
            }
        }
        System.out.println("Длина окружности всех возможных " + index + " фигур = " + circumference + ";");
        index = 0;
    }

    public void countList() {
        int count = 0;
        for (Figure i : allFigure) {
            System.out.println(count + "-" + i.getName() + ";");
            count++;
        }
    }

    public void removeFigure() {
        System.out.println("Какую фигуру удалить?");
        int index = scanner.nextInt();
        allFigure.remove(index);
    }

    public void sortAll() {
        Collections.sort(allFigure);
        System.out.println("-----Фигуры отсортированы по размеру площади-----");
    }
}

