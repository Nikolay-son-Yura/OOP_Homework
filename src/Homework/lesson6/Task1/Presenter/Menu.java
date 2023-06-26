package Homework.lesson6.Task1.Presenter;

import Homework.lesson6.Task1.Data.Data;
import Homework.lesson6.Task1.Figure.Parent.Figure;
import Homework.lesson6.Task1.Model.FigureChange;
import Homework.lesson6.Task1.Model.AddFigure;
import Homework.lesson6.Task1.Model.MenuMethods;
import Homework.lesson6.Task1.View.PrintFigure;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    MenuMethods menuMethods;
    FigureChange figureChange;
    AddFigure addFigure;
    PrintFigure print;
    Data data;
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Figure> listFigure = new ArrayList<>();

    public Menu(AddFigure aF, FigureChange fC, MenuMethods mM, PrintFigure p, Data d) {
        addFigure = aF;
        figureChange = fC;
        menuMethods = mM;
        print = p;
        data = d;
    }

    public void start() {

        System.out.println("""
                 1. Добавить новую фигуру;
                 2. Посчитать периметр у всех фигур;
                 3. Посчитать площадь у всех фигур;
                 4. Вывод информации о периметрах, площадях и длин окружности фигур;
                 5. Удаление фигуры;
                 6. изменения фигуры по индексу;
                 7. сортировки по площади, вывод информации о всех фигурах;
                 8. Загрузить базу с фигурами;
                 9. Посмотреть фигуры;
                 10. Выход;\
                """);
        System.out.print("Введите число: ");
        int choice = scanner.nextInt();
        System.out.println();
        switch (choice) {
            case 1 -> {
                addFigure.addFigures(listFigure);
                start();
            }
            case 2 -> {
                menuMethods.getAllParameter(listFigure);
                start();
            }
            case 3 -> {
                menuMethods.getAreaAll(listFigure);
                start();
            }
            case 4 -> {
                menuMethods.getAllParameters(listFigure);
                start();
            }
            case 5 -> {
                menuMethods.countList(listFigure);
                menuMethods.removeFigure(listFigure);
                print.print(listFigure);
                start();
            }
            case 6 -> {
                figureChange.figureChange(listFigure);
                start();
            }
            case 7 -> {

                print.print(listFigure);
                menuMethods.sortAll(listFigure);
                print.print(listFigure);
                start();
            }
            case 8 -> {
                data.addBase(listFigure);
                start();
            }
            case 9 -> {

                print.print(listFigure);
                start();
            }
            case 10 -> System.out.println("Всего доброго!");
        }
    }
}
