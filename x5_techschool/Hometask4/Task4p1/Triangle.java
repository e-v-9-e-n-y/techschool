package Task4p1;

public class Triangle implements Shape {
    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double square() {
        return a * h / 2;
    }
}
