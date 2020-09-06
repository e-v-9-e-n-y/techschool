package Task1p7;

import Common.ConsoleReader;

import java.util.Arrays;
import java.util.HashMap;
import static Common.ConsoleReader.ReadInt;

public class Task1p7 {
    public static void main(String[] args) {
        TelZoneList telZoneList = new TelZoneList();
        int vTelCode = ConsoleReader.ReadInt("Введите код региона:");
        telZoneList.processCode(vTelCode);
    }
}
