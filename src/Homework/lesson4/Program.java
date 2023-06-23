package Homework.lesson4;

import Homework.lesson4.Task1.Element;
import Homework.lesson4.Task2.Array;
import Homework.lesson4.Task3.MinMax;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        Random rd = new Random();

        Element<Integer> num = new Element<>();
        num.printElement(18);
        Element<Double> dub = new Element<>();
        dub.printElement(36.6);
        Element<String> str = new Element<>();
        str.printElement("\"Фамилия\"");
        System.out.println("Массивы");

        Integer[] arrayInt = new Integer[5];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = rd.nextInt(1, 10);
        }
        String[] arrayStr = new String[5];
        for (int i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = "Символ " + rd.nextInt(1, 10);
        }
        new Array<Integer>().printArray(arrayInt);
        new Array<String>().printArray(arrayStr);
        System.out.println("Больше меньше");

        System.out.println(new MinMax<>().getMax(21, 18));
        System.out.println(new MinMax<Double>().getMax(36.6, 37.7));
        System.out.println(new MinMax<String>().getMax("Фамилия", "Имя"));




    }
}
