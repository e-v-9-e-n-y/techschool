public class Task1p8 {
    public static void main(String[] args) {
        int[] values = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};

        int vMaxValue = Integer.MIN_VALUE; // максимальное значение
        int vSumPositive = 0; // сумма положительных элементов
        int vSumNegativeEven = 0;// сумма четных отрицательных элементов
        int vCntPositive = 0; // количество положительных элементов
        // среднее арифметическое отрицательных элементов
        int vSumNegative = 0;
        int vCntNegative = 0;

        for (int value: values
             ) {

            // посик максимума
            if (vMaxValue < value) { vMaxValue = value; }

            if (value > 0) {
                // положительное число

                // сумма положительных элементов
                vSumPositive = vSumPositive + value;

                // количество положительных элементов
                vCntPositive++;
            }
            else {
                if (value < 0) {
                    // отрицательное число

                    // среднее арифметическое отрицательных элементов
                    vSumNegative = vSumNegative + value;
                    vCntNegative++;

                    // проверка чётности/нечётности числа
                    if ((value % 2) == 0) {
                        // сумма четных отрицательных элементов
                        vSumNegativeEven = vSumNegativeEven + value;
                    }
                }
            }
        }
        Double vAvgNegative = Double.valueOf(vSumNegative)/vCntNegative;

        System.out.println("Максимальное значение:" + vMaxValue);
        System.out.println("Сумма положительных элементов:" + vSumPositive);
        System.out.println("Сумма четных отрицательных элементов" + vSumNegativeEven);
        System.out.println("Количество положительных элементов:" + vCntPositive);
        System.out.println("Среднее арифметическое отрицательных элементов:"  + vAvgNegative);
    }
}
