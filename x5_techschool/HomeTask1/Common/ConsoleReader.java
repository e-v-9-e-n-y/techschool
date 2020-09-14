package Common;

import java.util.Scanner;

public class ConsoleReader {
    public static int ReadInt(String greetingStr) {
        System.out.println(greetingStr);
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();
        return Integer.parseInt(userInput);
    }
}
