package Homework.lesson1.Task3.Book;

public class Book {
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
