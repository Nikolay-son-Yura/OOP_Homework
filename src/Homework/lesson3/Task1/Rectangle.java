package Homework.lesson3.Task1;

import Homework.lesson2.Task2.Shape;
import Homework.lesson3.Task1.Interface.IParameter;
import Homework.lesson3.Task1.Interface.IRectangle;

public class Rectangle extends Shape implements IRectangle {
    private double width;
    private double height;
    IParameter rezult;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double calculateArea() {
        rezult = (x, y) -> (x * y);
        return rezult.getParameter(getWidth(), getHeight());
    }

    @Override
    public double calculatePerimeter() {
        rezult = (x, y) -> (x * y) * 2;
        return rezult.getParameter(getWidth(), getHeight());
    }

    public String dataRectangle() {
        return "Прямоугольник: " + getName() +
                "\n Ширина= " + getWidth() +
                "\n Высота= " + getHeight() +
                "\n Площадь прямоугольника= " + calculateArea() +
                "\n Периметр прямоугольника= " + calculatePerimeter();
    }
}
