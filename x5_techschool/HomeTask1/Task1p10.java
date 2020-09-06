import java.util.ArrayList;
import java.util.Arrays;

public class Task1p10 {
    public static void main(String[] args) {
        int[] values = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        ArrayList<Integer> valuesZeroLast = new ArrayList<>();
        int vZeroCount = 0;

        for (int value: values
             ) {
            if (value != 0) {
                valuesZeroLast.add(value);
            }
            else {
                vZeroCount++;
            }
        }

        for (int i = 0; i < vZeroCount; i++) {
            valuesZeroLast.add(0);
        }

        System.out.println("Нули в конце массива:" + valuesZeroLast.toString());
    }
}
