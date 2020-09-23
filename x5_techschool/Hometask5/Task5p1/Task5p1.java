package Task5p1;

public class Task5p1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(LoggerType.loggerConsole);

        // пример операций
        calculator.addition(3.14, 3.14);
        calculator.subtraction(3.14, 3.14);
        calculator.multiplication(3.14, 3.14);
        calculator.division(3.14, 3.14);
    }
}
