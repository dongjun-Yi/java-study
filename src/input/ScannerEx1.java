package input;

import java.util.*;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            String input = s.nextLine();

            input.trim();
            String[] argArr = input.split(" ");

            String command = argArr[0].trim();

            if (command.equals("")) {
                continue;
            }
            command = command.toLowerCase();

            if (command.equals("q"))
                System.exit(0);

            for (int i = 0; i < argArr.length; i++) {
                System.out.println(argArr[i]);
            }
        }
    }
}
