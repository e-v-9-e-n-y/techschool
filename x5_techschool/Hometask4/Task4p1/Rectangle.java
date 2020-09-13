package Task4p1;

public class Rectangle implements Shape {
    private double a;
    private double h;

    public Rectangle() {
        this.a = 10;
        this.h = 4.5;
    }

    @Override
    public double square() {
        return a * h ;
    }
}
