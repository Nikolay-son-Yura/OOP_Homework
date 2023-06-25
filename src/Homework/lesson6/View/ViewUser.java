package Homework.lesson6.View;

import java.util.Scanner;

public class ViewUser {
    Scanner scanner = new Scanner(System.in);

    public double getInput(String title) {
        System.out.printf("%s", title);
        return scanner.nextDouble();
    }
}
