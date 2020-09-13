package Task3p1;

public class Phone {
    private String number;
    private String model;
    private int weigth;

    public Phone(String number, String model, int weigth) {
        this(number, model);
        this.setWeigth(weigth);
    }

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public void receiveCall(String callingSubscriber) {
        System.out.println("На телефон " + number + " звонит " + callingSubscriber);
    }

    public void receiveCall(String callingSubscriber, String callingName) {
        System.out.println("На телефон " + number + " звонит " + callingName + "(" + callingSubscriber + ")");
    }

    public void sendMessage(String... numbers) {
        for (String num: numbers
             ) {
            System.out.println("Отправка сообщения на номер " + num);
        }
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weigth=" + weigth +
                '}';
    }
}
