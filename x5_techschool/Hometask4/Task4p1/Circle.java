package Task4p1;

public class Circle implements Shape {
    private double r;

    public Circle() {
        this.r = 12;
    }

    @Override
    public double square() {
        return 3.14 * r * r;
    }
}
