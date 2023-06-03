//*Задача 3 - по желанию, для тех кто уже проходил ООП, чтобы было не скучно.:
//Реализуйте систему управления библиотекой. Создайте классы "Книга" (Book) и "Библиотека" (Library) со следующими свойствами и методами:
//
//Класс "Книга" (Book):
//
//Приватные поля "название" (title) и "автор" (author) типа String для хранения названия и автора книги соответственно.
//Приватное поле "доступность" (available) типа boolean для указания доступности книги.
//Публичные методы доступа (геттеры и сеттеры) для полей "название" и "автор".
//Публичные методы доступа (геттеры и сеттеры) для поля "доступность".
//Публичный метод "показать информацию" (displayInfo), который выводит на консоль информацию о книге (название, автор, доступность).
//Класс "Библиотека" (Library):
//
//Приватное поле "каталог" (catalog) типа ArrayList<Book> для хранения списка книг в библиотеке.
//Публичный метод "добавить книгу" (addBook), который принимает объект типа Book и добавляет его в каталог библиотеки.
//Публичный метод "удалить книгу" (removeBook), который принимает объект типа Book и удаляет его из каталога библиотеки.
//Публичный метод "показать доступные книги" (displayAvailableBooks), который выводит на консоль информацию о доступных книгах в библиотеке.
//Публичный метод "поиск книги по автору" (searchByAuthor),
// который принимает имя автора в качестве параметра и выводит на консоль информацию о книгах данного автора,
// находящихся в каталоге библиотеки.
package Homework.lesson2.Task3.Library;

import Homework.lesson2.Task3.Book.Book;

import java.util.ArrayList;

public class Library {

    private final ArrayList<Book> catalog = new ArrayList<>();

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void removeBook(Book book) {
        catalog.remove(book);
    }

    public void displayAvailableBooks() {
        for (Book i : catalog) {
            if (i.getAvailable())
                System.out.println(i.displayInfo());
        }
    }

    public void searchByAuthor(String author) {
        author = author.toUpperCase();
        for (Book i : catalog) {
            if (i.getAuthor().toUpperCase().equals(author)) {
                System.out.println(i.displayInfo());
            }
        }
    }
}