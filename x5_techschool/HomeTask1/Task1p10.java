import java.util.ArrayList;
import java.util.Arrays;

public class Task1p10 {
    public static void main(String[] args) {
        int[] sourceValues = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int[] targetValues = new int[sourceValues.length];
        int targetCnt = 0;

        for (int value : sourceValues
        ) {
            if (value != 0) {
                targetValues[targetCnt] = value;
                targetCnt += 1;
            }
        }

        for (int i = targetCnt; i < targetValues.length; i++) {
            targetValues[i] = 0;
        }

        System.out.println("Нули в конце массива:" + Arrays.toString(targetValues));
    }
}
