package Homework.lesson6.Task1.Model;


import Homework.lesson6.Task1.Figure.Heir.Circle;
import Homework.lesson6.Task1.Figure.Heir.Rectangle;
import Homework.lesson6.Task1.Figure.Heir.Square;
import Homework.lesson6.Task1.Figure.Heir.Triangle;
import Homework.lesson6.Task1.Figure.Parent.Figure;

import java.util.ArrayList;
import java.util.Scanner;

public class AddFigure {
    public void addFigures() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Figure> allFigure = new ArrayList<>();
            System.out.println("Какую фигуру добавим?:");
            System.out.println("""
                    1-Треугольник
                    2-Квадрат
                    3-Прямоугольник
                    4-Круг""");
            int n = scanner.nextInt();
            System.out.println("Как назовем фигуру? : ");
            String name = scanner.next();
            switch (n) {
                case 1 -> {
                    System.out.print("Введите сторону А: ");
                    Double a = scanner.nextDouble();
                    System.out.print("Введите сторону В: ");
                    Double b = scanner.nextDouble();
                    System.out.print("Введите сторону С: ");
                    Double c = scanner.nextDouble();
                    allFigure.add(new Triangle(name, a, b, c));
                }
                case 2 -> {
                    System.out.println("Введите сторону ");
                    Double width = scanner.nextDouble();
                    allFigure.add(new Square(name, width));
                }
                case 3 -> {
                    System.out.print("Введите сторону А: ");
                    Double width1 = scanner.nextDouble();
                    System.out.print("Введите сторону В: ");
                    Double height = scanner.nextDouble();
                    allFigure.add(new Rectangle(name, width1, height));
                }
                case 4 -> {
                    System.out.print("Введите радиус: ");
                    Double radius = scanner.nextDouble();
                    allFigure.add(new Circle(name, radius));
                }
            }

//        return allFigure;
    }

}
