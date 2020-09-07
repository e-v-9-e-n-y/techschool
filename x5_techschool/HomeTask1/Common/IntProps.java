package Common;

public class IntProps {

    // определение знака числа
    public static int getSign(int pValue) {
        if (pValue == 0) {
            return 0;
        }
        else if (pValue > 0) {
            return 1;
        }
        else return -1;
    }

    // определение чётности/нечётности числа
    public static boolean isEven(int pValue) {
        if ((pValue % 2) == 0) {
            return true;
        }
        else return false;
    }

    // описание числа
    public static String getDescription(int pValue) {
        //Ввести целое число в консоли. Вывести его строку-
        //описание вида «отрицательное четное число»,
        //«нулевое число», «положительное нечетное число» и
        //т. д.
        final String DigitCaption = " число";
        StringBuilder stringBuilder = new StringBuilder();
        switch (IntProps.getSign(pValue)) {
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

        if (IntProps.isEven(pValue) == true) {
            stringBuilder.append(" четное");
        } else {
            stringBuilder.append(" нечетное");
        }
        stringBuilder.append(DigitCaption);
        return  stringBuilder.toString();
    }
}
