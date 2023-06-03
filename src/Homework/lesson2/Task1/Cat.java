package Homework.lesson2.Task1;
//*Создайте класс "Кот" (Cat) со следующими свойствами:
//
//Приватное поле "имя" (name) типа String для хранения имени кота.
//Приватное поле "возраст" (age) типа int для хранения возраста кота.
//Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
//Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".
//Дополнительное задание:
//Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String.
// Добавьте соответствующее поле в классе "Кот" и методы доступа для него.
// Измените метод "приветствие" класса "Кот",
// чтобы он выводил приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя владельца>.".

import Homework.lesson2.Task1.Interface.IGames;
import Homework.lesson2.Task1.Interface.IGreet;

public class Cat implements IGreet, IGames {
    private String name;
    private Integer age;
    private final Owner owner;

    public Cat(String name, Integer age, Owner owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner.greet();
    }
//    public String getName

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String greet() {
        return "Мяу! Меня зовут " + getName()+". Мне "+getAge() +" года(лет).";
}

    public String greetOwner() {
        return "Мяу! Меня зовут " + getName() + ". Мне " + getAge() + " года(лет)." + getOwner();
    }

    @Override
    public String game() {
        return "Я хочу поиграть со моим Хозяином";
    }
}