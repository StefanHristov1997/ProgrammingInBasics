package Lab_03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class NumberiIRange_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());

        if (number >= -100 && number <= 100 && number != 0) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }
}
