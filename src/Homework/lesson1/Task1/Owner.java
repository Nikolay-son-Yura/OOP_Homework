package Homework.lesson1.Task1;

public class Owner{
    private String names;

    public Owner(String names) {
        this.names = names;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String name) {
        this.names = name;
    }

    public String greet(){
        return " Мой владелец -" + getNames();
    }
}
