package Task4p2;

public class Task4p2 {
    public static void main(String[] args) {
        Car car = new SportCar("modelY","ElectroCar", 1550, "Tesla", 150);
        car.printInfo();
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();
    }
}
