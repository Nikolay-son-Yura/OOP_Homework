package Homework.lesson6.Task1.Figure.Parent;

public abstract class Figure implements Comparable<Figure> {
    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Double getArea();

    @Override
    public String toString() {
        return getName();
    }
}
