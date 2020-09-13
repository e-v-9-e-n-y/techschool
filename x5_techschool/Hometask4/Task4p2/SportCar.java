package Task4p2;

public class SportCar extends Car {
    public SportCar(String model, String carClass, int weigth, String manufacturer, int power) {
        super(model, carClass, weigth, manufacturer, power);
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        System.out.println(super.toString());
    }
}
