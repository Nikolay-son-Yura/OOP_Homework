package Homework.lesson6.Task1.Figure.Parent;


import Homework.lesson6.Task1.Figure.Interface.Perimetr;

public abstract class Polygon extends Figure implements Perimetr {
    protected Double[] sides;
    private Integer numberOfSides;

    protected Polygon(String name, Integer numberOfSides, Double[] sides){
        super(name);
        if (numberOfSides == null || numberOfSides <= 0)
            throw new IllegalArgumentException("Неверное количество сторон!");
        this.numberOfSides = numberOfSides;
        for (Double len : sides) {
            if (len == null || len <= 0.0)
                throw new IllegalArgumentException("Неверное значение длин сторон!");
        }
        this.sides = sides;
    }

    public void setSides(Double[] sides) {
        this.sides = sides;
    }

    @Override
    public Double getPeremetr() {
        Double res = 0.0;
        for (Double side : this.sides) {
            res += side;
        }
        return res;
    }

    @Override
    public abstract Double getArea();

    public int getNumberOfSides() {
        return numberOfSides;
    }
}
