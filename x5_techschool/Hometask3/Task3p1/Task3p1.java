package Task3p1;

public class Task3p1 {
    private static final int n = 3;
    public static void main(String[] args) {
        Phone[] phones = new Phone[n];
        for (int i = 0; i < n; i++) {
            phones[i] = new Phone("+7(903)000-00-0" + i, "Model" + i, 100 + 10*i);

            System.out.println(phones[i].toString());
            System.out.println("Номер телефона:" + phones[i].getNumber());
            phones[i].receiveCall("8(800)880-80-8" + i);
        }

        phones[1].receiveCall("+7(495)662-88-88", "X5");
        phones[1].sendMessage("8(800)800-80-01", "8(800)800-80-02",
                                        "8(800)800-80-03", "8(800)800-80-04");
    }
}
