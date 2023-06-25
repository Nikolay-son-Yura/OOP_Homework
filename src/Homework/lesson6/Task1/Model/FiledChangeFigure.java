package Homework.lesson6.Task1.Model;

import Homework.lesson6.Task1.Figure.Heir.Circle;
import Homework.lesson6.Task1.Figure.Heir.Rectangle;
import Homework.lesson6.Task1.Figure.Heir.Square;
import Homework.lesson6.Task1.Figure.Heir.Triangle;
import Homework.lesson6.Task1.Figure.Parent.Figure;

import java.util.ArrayList;
import java.util.Scanner;

public class FiledChangeFigure {
    static Scanner scanner = new Scanner(System.in);

    public void filedChangeName(int index, ArrayList<Figure> arg) {
        System.out.println("Введите новое название: ");
        String newName = scanner.next();
        arg.get(index).setName(newName);
    }

    public void filedChangeSides(int index, ArrayList<Figure> arg) {
        if (arg.get(index) instanceof Square) {
            double newSides = scanner.nextDouble();
            ((Square) arg.get(index)).setSides(new Double[]{newSides, newSides});
        }
        if (arg.get(index) instanceof Circle) {
            System.out.println("Введите новое значение радиуса: ");
            double newRadius = scanner.nextDouble();
            ((Circle) arg.get(index)).setRadius(newRadius);
        }
        if (arg.get(index) instanceof Rectangle) {
            System.out.println("Введите новое значение стороны 1: ");
            double newSidesA = scanner.nextDouble();
            System.out.println("Введите новое значение стороны 2: ");
            double newSidesB = scanner.nextDouble();
            ((Rectangle) arg.get(index)).setSides(new Double[]{newSidesA, newSidesB});
        }
        if (arg.get(index) instanceof Triangle) {
            System.out.println("Введите новое значение стороны 1: ");
            double newSidesA = scanner.nextDouble();
            System.out.println("Введите новое значение стороны 2: ");
            double newSidesB = scanner.nextDouble();
            System.out.println("Введите новое значение стороны 3: ");
            double newSidesC = scanner.nextDouble();
            ((Triangle) arg.get(index)).setSides(new Double[]{newSidesA, newSidesB, newSidesC});
        }

    }
}

