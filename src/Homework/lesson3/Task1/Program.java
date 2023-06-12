package Homework.lesson3.Task1;
/**
 * 1)В предыдущем ДЗ добавить реализацию собственного функционального интерфейса.
 * <p>
 * 2)Реализовать любой выбранный интерфейс из списка (Iterator<E>, Iterable<E>, Comparator<E>, Comparable<E>) в предыдущем ДЗ, предоставив собственную реализацию.
 * <p>
 * 3)(Опционально, по желанию) Задача: Написать функцию, которая принимает список объектов и компаратор для сортировки объектов по заданному критерию.
 * Функция должна возвращать отсортированный список объектов.
 * <p>
 * В первом варианте вам нужно добавить реализацию собственного функционального интерфейса к предыдущему ДЗ.
 * Вы можете выбрать любой класс или часть кода из предыдущего ДЗ и добавить свой собственный функциональный интерфейс, описывающий необходимое поведение.
 * <p>
 * Во втором варианте вам нужно реализовать один из выбранных интерфейсов (Iterator<E>, Iterable<E>, Comparator<E>, Comparable<E>) в предыдущем ДЗ.
 * Вы можете выбрать любой интерфейс и предоставить свою собственную реализацию методов, соответствующих этому интерфейсу.
 * <p>
 * В третьем варианте вам нужно написать функцию, которая принимает список объектов и компаратор для сортировки объектов по заданному критерию.
 * Вы должны возвращать отсортированный список объектов. Это может быть реализовано, например, с использованием метода Collections.sort() и переданного компаратора.
 **/

import Homework.lesson2.Task2.Rectangle;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Comparator<Rectangle> comRec = (r1, r2) -> {
            if (r1.calculateArea() < r2.calculateArea()) { //(r1.calculatePerimeter() < r2.calculatePerimeter())
                return -1;
            } else if (r1.calculateArea() > r2.calculateArea()) { //(r1.calculatePerimeter() > r2.calculatePerimeter())
                return 1;
            } else {
                return 0;
            }
        };
        List<Rectangle> list = new ArrayList<>();
        Random rd = new Random();

        for (int i = 1; i < 10; i++) {
            double w = rd.nextInt(1, 10);

            double h = rd.nextInt(1, 10);
            list.add(new Rectangle(String.valueOf(i), w, h));
        }
        list.sort(comRec);
        for (Rectangle figure : list) {
            System.out.println(figure.dataRectangle());
        }
    }
}
