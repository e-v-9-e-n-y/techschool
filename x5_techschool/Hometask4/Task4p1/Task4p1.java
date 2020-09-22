package Task4p1;

public class Task4p1 {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(10, 4.5);
        shape[1] = new Circle(12);
        shape[2] = new Rectangle(10, 4.5);
        for (Shape sh : shape) {
            System.out.println("Площадь фигуры: " + sh.square());
        }
    }
}
