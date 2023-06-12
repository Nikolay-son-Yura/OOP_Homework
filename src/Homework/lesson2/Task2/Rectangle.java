package Homework.lesson2.Task2;

import Homework.lesson2.Task2.Interface.ICalculate;

public class Rectangle extends Shape implements ICalculate {
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

    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
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
