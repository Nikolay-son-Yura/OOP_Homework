package Homework.lesson6;
/** Есть пару моментов
 * 1)мне уже очень тяжело отслеживать принципы SOLID слишком сложный проект для меня если есть советы и замечания
 * исправлю
 * 2)FigureChange решил создать новый класс по изменению полей фигуры(FigureChangeFigure), но как передать
 * его в FigureChange или надо передавать в Menu?
 * Зачем решил это сделать в FigureChange очень часто повторяется запрос на изменение имени или стороны, подумал если часто
 * повторяется значит что-то делаю неправильно, создал отдельные метод в FigureChange
 * и если мы дописываем новый if() в уже созданном коде это нарушает принципы(является ли это изменением начального кода)
 */

import Homework.lesson6.Task1.Data.Data;
import Homework.lesson6.Task1.Model.AddFigure;
import Homework.lesson6.Task1.Model.FigureChange;
import Homework.lesson6.Task1.Model.MenuMethods;
import Homework.lesson6.Task1.Presenter.Menu;
import Homework.lesson6.Task1.View.PrintFigure;

public class Program {
    public static void main(String[] args) {
        var figure= new Menu(new AddFigure(),new FigureChange(),new MenuMethods(),new PrintFigure(),new Data());
        figure.start();


    }
}
