package Homework.lesson1.Task2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Создадим прямоугольник");
        System.out.println("Название?");
        String name= scanner.next();
        System.out.println("Задать параметры прямоугольника по умолчанию? 1-Да,2-Нет");
        int num = scanner.nextInt();
        if(num==1) {
            Rectangle rectangle= new Rectangle(name);
        }
        System.out.println("Какая ширина?");
        Double width = scanner.nextDouble();
        System.out.println("Какая высота?");
        Double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(name, width, height);
        System.out.println(rectangle.dataRectangle());
    }
}
