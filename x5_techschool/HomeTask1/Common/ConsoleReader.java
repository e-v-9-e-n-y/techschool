package Common;

import java.util.Scanner;

public class ConsoleReader {
    public static int ReadInt(String pGreeting) {
        System.out.println(pGreeting);
        Scanner in = new Scanner(System.in);
        String vUserInput = in.nextLine();
        return Integer.parseInt(vUserInput);
    }
}
