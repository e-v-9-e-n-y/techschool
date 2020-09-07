import Common.ConsoleReader;
import Common.IntProps;

public class Task1p3 {
    public static void main(String[] args) {
        int value = ConsoleReader.ReadInt("Введите целое число:");

        switch (IntProps.getSign(value)) {
            case (1):
                value+=1;
                break;
             default:
                break;
        }
        System.out.println("Полученное число:" + value);
    }
}
