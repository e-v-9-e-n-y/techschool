package Task4p2;

public abstract class Car {
    protected String model;
    protected String carClass;
    protected int weigth;
    protected Engine motor;

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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public Engine getMotor() {
        return motor;
    }

    public void setMotor(Engine motor) {
        this.motor = motor;
    }
}
