package Homework.lesson2.Task1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Давай создадим кота");
        System.out.println("Как его назовем?");
        String name = scanner.next();
        System.out.println("Сколько ему лет?");
        Integer age = scanner.nextInt();
        System.out.println("Имя его хозяина");
        String nameOwner = scanner.next();
        Owner owner = new Owner(nameOwner);
        Cat cat = new Cat(name, age,owner);
        System.out.println(cat.greetOwner());

    }

}
