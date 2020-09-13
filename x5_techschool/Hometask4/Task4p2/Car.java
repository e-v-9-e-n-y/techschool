package Task4p2;

public abstract class Car {
    String model;
    String carClass;
    int weigth;
    Engine motor;

    public Car(String model, String carClass, int weigth, String manufacturer, int power) {
        this.model = model;
        this.carClass = carClass;
        this.weigth = weigth;
        this.motor = new Engine(manufacturer, power);
    }

    public abstract void start();

    public abstract void stop();

    public abstract void printInfo();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weigth=" + weigth +
                ", motor=" + motor +
                '}';
    }
}
