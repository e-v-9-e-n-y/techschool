import Common.ConsoleReader;

public class Task1p5 {
    public static void main(String[] args) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 1; i <= 3; i++) {
            int value = ConsoleReader.ReadInt("Введите " + i + "-е целое число:");
            if (value < minValue) {
                minValue = value;
            }
        }
        System.out.println("Наименьшее из чисел:" + minValue);
    }
}
