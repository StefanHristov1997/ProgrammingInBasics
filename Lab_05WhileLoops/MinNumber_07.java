package Lab_05WhileLoops;

import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int minNumber = Integer.MAX_VALUE;

        while (!text.equals("Stop")) {
            int number = Integer.parseInt(text);

            if (minNumber > number) {
                minNumber = number;
            }

            text = scanner.nextLine();
        }
        System.out.println(minNumber);
    }
}
