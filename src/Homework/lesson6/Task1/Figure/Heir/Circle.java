package Homework.lesson6.Task1.Figure.Heir;



import Homework.lesson6.Task1.Figure.Interface.Сircumference;
import Homework.lesson6.Task1.Figure.Parent.Figure;

public class Circle extends Figure implements Сircumference {//тут тоже надо бы сделать отдельный класс по ошибкам
    private Double radius;

    public Circle(String name, Double radius)  {
        super(name);
        if (radius > 0)
            this.radius = radius;
        else
            throw new IllegalArgumentException("Неверное значение радиуса!");
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getLen() {
        return Math.PI * (2 * radius);
    }

    @Override
    public Double getArea() {
        return Math.PI * (radius * radius);
    }

//    @Override
//    public String toString() {
//        return super.toString() +
//                "\n имеет площадь: " + getArea() +
//                "\n радиус: " + radius +
//                "\n длина окружности : " + getLen();
//    }

    @Override
    public int compareTo(Figure o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }
}

