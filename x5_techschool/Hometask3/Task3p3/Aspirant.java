package Task3p3;

public class Aspirant extends Student {
    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWorkTopic) {
        super(firstName, lastName, group, averageMark);
        this.scientificWorkTopic = scientificWorkTopic;
    }

    // тема научной работы аспиранта
    private String scientificWorkTopic;

    public double getScholarship() {
        double scholarship;
        if (averageMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }

    public String getScientificWorkTopic() {
        return scientificWorkTopic;
    }

    public void setScientificWorkTopic(String scientificWorkTopic) {
        this.scientificWorkTopic = scientificWorkTopic;
    }
}
