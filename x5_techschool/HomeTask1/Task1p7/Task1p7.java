package Task1p7;

import Common.ConsoleReader;

public class Task1p7 {
    public static void main(String[] args) {
        TelZoneList telZoneList = new TelZoneList();
        int telCode = ConsoleReader.ReadInt("Введите код региона:");
        telZoneList.processCode(telCode);
    }
}
