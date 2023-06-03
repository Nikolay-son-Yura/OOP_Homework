package Homework.lesson2.Task3.Book;

import Homework.lesson2.Task3.Interface.IBook;

public class Book implements IBook {
    private String title;
    private String author;
    private Boolean available;

    public Book(String title, String author, Boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String displayInfo() {
        return "\n Название: " + getTitle() +
                "\n Автор: " + getAuthor() +
                "\n Доступность" + (available ? "Да" : "Нет");
    }
}
