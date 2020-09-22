package Task4p1;

public class Rectangle implements Shape {
    private double a;
    private double h;

    public Rectangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double square() {
        return a * h;
    }
}
