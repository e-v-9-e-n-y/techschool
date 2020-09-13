package Task4p1;

public class Triangle implements Shape {
    private double a;
    private double h;

    public Triangle() {
        this.a = 10;
        this.h = 4.5;
    }

    @Override
    public double square() {
        return a * h / 2;
    }
}
