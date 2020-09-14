import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task1p9 {
    public static void main(String[] args) {
        int[] values = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        int[] valuesReversed = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            valuesReversed[values.length - i - 1] = values[i];
        }

        System.out.println("Элементы массива в обратном порядке:" + Arrays.toString(valuesReversed));
    }
}
