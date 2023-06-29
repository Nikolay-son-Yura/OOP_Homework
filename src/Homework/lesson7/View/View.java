package Homework.lesson7.View;

import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    public double getInput(String title) {
        System.out.printf("%s", title);
        return scanner.nextDouble();
    }
    public String getInputOperator(String title){
        System.out.printf("%s",title);
        return scanner.nextLine();
    }
    public void print(double result, String title) {
        System.out.printf("%s %s", title,result);
    }
}
