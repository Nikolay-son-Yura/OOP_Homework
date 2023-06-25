package Homework.lesson6.Task1.Presenter;

import Homework.lesson6.Task1.Model.MenuMethods;
import Homework.lesson6.Task1.Model.AddFigure;

import java.util.Scanner;

public class Menu {
    static AddFigure addFigure;
    static Scanner scanner = new Scanner(System.in);
    static MenuMethods listFigure = new MenuMethods();
    public static void programMenu() {

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
               addFigure.addFigures();

//                listFigure.

                programMenu();
            }
            case 2 -> {
                listFigure.getAllParameter();
                programMenu();
            }
            case 3 -> {
                listFigure.getAreaAll();
                programMenu();
            }
            case 4 -> {
                listFigure.getAllParameters();
                programMenu();
            }
            case 5 -> {
                listFigure.countList();
                listFigure.removeFigure();
                listFigure.infoAll();
                programMenu();
            }
            case 6 -> {
                listFigure.figureChange();
                programMenu();
            }
            case 7 -> {
                listFigure.infoAll();
                listFigure.sortAll();
                listFigure.infoAll();
                programMenu();
            }
//            case 8 -> {
//                listFigure.addData();
//                programMenu();
//            }
            case 9 -> {

                listFigure.infoAll();
                programMenu();
            }
            case 10 -> System.out.println("Всего доброго!");
        }
    }
}
