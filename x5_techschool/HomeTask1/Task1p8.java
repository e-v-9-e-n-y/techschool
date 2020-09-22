public class Task1p8 {
    public static void main(String[] args) {
        int[] values = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};

        int maxValue = Integer.MIN_VALUE; // максимальное значение
        int sumPositive = 0; // сумма положительных элементов
        int sumNegativeEven = 0;// сумма четных отрицательных элементов
        int cntPositive = 0; // количество положительных элементов
        // среднее арифметическое отрицательных элементов
        int sumNegative = 0;
        int cntNegative = 0;

        for (int value : values
        ) {

            // посик максимума
            if (maxValue < value) {
                maxValue = value;
            }

            if (value > 0) {
                // положительное число

                // сумма положительных элементов
                sumPositive = sumPositive + value;

                // количество положительных элементов
                cntPositive++;
            } else {
                if (value < 0) {
                    // отрицательное число

                    // среднее арифметическое отрицательных элементов
                    sumNegative = sumNegative + value;
                    cntNegative++;

                    // проверка чётности/нечётности числа
                    if (value % 2 == 0) {
                        // сумма четных отрицательных элементов
                        sumNegativeEven = sumNegativeEven + value;
                    }
                }
            }
        }
        Double avgNegative = Double.valueOf(sumNegative) / cntNegative;

        System.out.println("Максимальное значение:" + maxValue);
        System.out.println("Сумма положительных элементов:" + sumPositive);
        System.out.println("Сумма четных отрицательных элементов" + sumNegativeEven);
        System.out.println("Количество положительных элементов:" + cntPositive);
        System.out.println("Среднее арифметическое отрицательных элементов:" + avgNegative);
    }
}
