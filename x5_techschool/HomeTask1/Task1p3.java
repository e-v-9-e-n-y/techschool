import Common.ConsoleReader;
import Common.IntProps;

public class Task1p3 {
    public static void main(String[] args) {
        int value = ConsoleReader.ReadInt("Введите целое число:");

        if (IntProps.getSign(value) == 1) {
            value += 1;
        }
        System.out.println("Полученное число:" + value);
    }
}
