package Lab_05WhileLoops;

import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double sum = 0;

        while (!input.equals("NoMoreMoney")) {
            double current = Double.parseDouble(input);
            if (current < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            sum += current;
            System.out.printf("Increase: %.2f\n", current);
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}