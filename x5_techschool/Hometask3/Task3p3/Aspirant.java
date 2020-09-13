package Task3p3;

public class Aspirant extends Student{
    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    public double getScholarship() {
        double scholarship;
        if (averageMark == 5) {
            return 200;
        }
        else {
            return 180;
        }
    }
}
