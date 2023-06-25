package Homework.lesson6.Task1.Model;

import Homework.lesson6.Task1.Figure.Heir.Circle;
import Homework.lesson6.Task1.Figure.Heir.Rectangle;
import Homework.lesson6.Task1.Figure.Heir.Square;
import Homework.lesson6.Task1.Figure.Heir.Triangle;
import Homework.lesson6.Task1.Figure.Parent.Figure;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Тут при добавлении новых фигур (овал, пятиугольник и тд.) можно пойти 2мя путями
 * 1) добавление кейсов, но это будет идти в разрез с принципами SOLID так как правка основного кода, а не создание наследника
 * 2) переписать все и сделать отдельным классом если наследник полигона то запрашивать количество сторон через count
 * и вводить название Сторона 1=scanner Сторона 2= scanner и тд.
 * Так как у нас ТЗ с текущими фигурами я думаю оставить все как есть
 */
public class AddFigure {
    public void addFigures(ArrayList<Figure> arg) {
        Scanner scanner = new Scanner(System.in);
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
                arg.add(new Triangle(name, a, b, c));
            }
            case 2 -> {
                System.out.println("Введите сторону ");
                Double width = scanner.nextDouble();
                arg.add(new Square(name, width));
            }
            case 3 -> {
                System.out.print("Введите сторону А: ");
                Double width1 = scanner.nextDouble();
                System.out.print("Введите сторону В: ");
                Double height = scanner.nextDouble();
                arg.add(new Rectangle(name, width1, height));
            }
            case 4 -> {
                System.out.print("Введите радиус: ");
                Double radius = scanner.nextDouble();
                arg.add(new Circle(name, radius));
            }
        }

    }

}
