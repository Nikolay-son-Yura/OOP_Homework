package Homework.lesson1.Task2;

public class Rectangle extends Shape {
    private Double width;
    private Double height;

    public Rectangle(String name) {
        super(name);
        width = 10.0;
        height = 15.0;

    }

    public Rectangle(String name, Double width, Double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }

    public Double calculateArea() {
        return width * height;
    }

    public Double calculatePerimeter() {
        return 2 * (width * height);
    }

    public String dataRectangle() {
        return "Прямоугольник: " + getName() +
                "\n Ширина= " + getWidth() +
                "\n Высота= " + getHeight() +
                "\n Площадь прямоугольника= " + calculateArea() +
                "\n Периметр прямоугольника= " + calculatePerimeter();
    }
}
