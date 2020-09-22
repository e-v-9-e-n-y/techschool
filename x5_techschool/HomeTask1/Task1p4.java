import Common.ConsoleReader;
import Common.IntProps;

public class Task1p4 {
    public static void main(String[] args) {
        int value = ConsoleReader.ReadInt("Введите целое число:");

        int sign = IntProps.getSign(value);
        if (sign == -1) {
            value -= 2;
        } else if (sign == 0) {
            value = 10;
        } else {
            value += 1;
        }

        System.out.println("Полученное число:" + value);
    }

}
