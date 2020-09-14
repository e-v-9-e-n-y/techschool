package Common;

public class IntProps {

    // определение знака числа
    public static int getSign(int value) {
        if (value == 0) {
            return 0;
        } else if (value > 0) {
            return 1;
        } else return -1;
    }

    // определение чётности/нечётности числа
    public static boolean isEven(int value) {
        if ((value % 2) == 0) {
            return true;
        } else return false;
    }

    // описание числа
    public static String getDescription(int value) {
        //Ввести целое число в консоли. Вывести его строку-
        //описание вида «отрицательное четное число»,
        //«нулевое число», «положительное нечетное число» и
        //т. д.
        final String DigitCaption = " число";
        StringBuilder stringBuilder = new StringBuilder();
        switch (IntProps.getSign(value)) {
            case (0):
                return "нулевое" + DigitCaption;
//                break;
            case (-1):
                stringBuilder.append("отрицательное");
                break;
            default:
                stringBuilder.append("положительное");
                break;
        }

        if (IntProps.isEven(value)) {
            stringBuilder.append(" четное");
        } else {
            stringBuilder.append(" нечетное");
        }
        stringBuilder.append(DigitCaption);
        return stringBuilder.toString();
    }
}
