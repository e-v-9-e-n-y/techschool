import Common.ConsoleReader;

public class Task1p1 {
    public static void main(String[] args) {
        int value = ConsoleReader.ReadInt("Введите целое число:");
        int lastDigit = Math.abs(value % 10);

        System.out.println("Последняя цифра введенного числа:" + lastDigit);
    }

}
