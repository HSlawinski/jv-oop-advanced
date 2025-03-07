package core.basesyntax;

public abstract class Figure implements Draw {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
