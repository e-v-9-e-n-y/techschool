package Task3p3;

public class Task3p3 {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("Иванов", "Иван", "1", 4.234);
        students[1] = new Student("Петров", "Петр", "1", 5);
        students[2] = new Aspirant("Сидоров", "Сидор", "1", 3, "Научная работа аспиранта Сидорова С.");
        students[3] = new Aspirant("Николаев", "Николай", "1", 5, "Научная работа аспиранта Николаева Н.");

        for (int i = 0; i < 4; i++) {
            System.out.println(students[i].getFirstName() + " " + students[i].getLastName() + ": " + students[i].getScholarship());
        }
    }
}
