package Homework.lesson2.Task1;

import Homework.lesson2.Task1.Interface.IGames;
import Homework.lesson2.Task1.Interface.IGreet;
import Homework.lesson2.Task1.Interface.IOwmer;

public class Owner implements IGreet, IGames, IOwmer {
    private String names;

    public Owner(String names) {
        this.names = names;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String name) {
        this.names = name;
    }

    @Override
    public String greet() {
        return " Мой владелец -" + getNames();
    }

    @Override
    public String game() {
        return "Я хочу поиграть с моим питомцем ";
    }
}
