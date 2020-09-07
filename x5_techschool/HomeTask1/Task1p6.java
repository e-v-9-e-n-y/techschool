import Common.ConsoleReader;
import Common.IntProps;

public class Task1p6 {
    public static void main(String[] args) {
        int value = ConsoleReader.ReadInt("Введите целое число:");
        String digdesc = IntProps.getDescription(value);
        System.out.println("Описание числа:" + digdesc);
    }
}
