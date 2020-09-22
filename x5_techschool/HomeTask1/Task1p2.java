import Common.ConsoleReader;

public class Task1p2 {
    public static void main(String[] args) {
        int value = Math.abs(ConsoleReader.ReadInt("Введите целое трехзначное число:"));

        if ((value > 999) | (value < 100)) {
            System.out.println("Введённое число не является трёхзначным!");
        } else {
            int currDivisor = 1;
            int sumTotal = 0;
            while (true) {
                if (currDivisor > value) {
                    break;
                }
                int currDig = (value / currDivisor) % 10;

                sumTotal += currDig;
                currDivisor *= 10;
            }

            System.out.println("Сумма цифр этого трехзначного числа:" + sumTotal);
        }
    }
}

