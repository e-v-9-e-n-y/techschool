import Common.ConsoleReader;
import Common.IntProps;

public class Task1p4 {
    public static void main(String[] args) {
        int value = ConsoleReader.ReadInt("Введите целое число:");

        switch (IntProps.getSign(value)) {
            case  (-1):
                value-=2;
                break;
            case (0):
                value= 10;
                break;
            default:
                value+=1;
                break;
        }
        System.out.println("Полученное число:" + value);
    }

}
