package Task4p2;

public class Lorry extends Car {
    public Lorry(String model, String carClass, int weigth, String manufacturer, int power) {
        super(model, carClass, weigth, manufacturer, power);
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println(super.toString());
    }
}
