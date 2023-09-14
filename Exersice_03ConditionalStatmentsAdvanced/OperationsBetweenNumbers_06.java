package Exersice_03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();


        switch (operator) {
            case "+":
                int sum = N1 + N2;
                if (sum % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", N1, operator, N2, sum);
                } else {
                    System.out.printf("%d %s %d = %d - odd", N1, operator, N2, sum);
                }
                break;
            case "-":
                int sum2 = N1 - N2;
                if (sum2 % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", N1, operator, N2, sum2);
                } else {
                    System.out.printf("%d %s %d = %d - odd", N1, operator, N2, sum2);
                }
                break;
            case "*":
                int sum3 = N1 * N2;
                if (sum3 % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", N1, operator, N2, sum3);
                } else {
                    System.out.printf("%d %s %d = %d - odd", N1, operator, N2, sum3);
                }
                break;
            case "/":
                double sum4 = N1 * 1.0 / N2;
                if (N2 > 0) {
                    System.out.printf("%d %s %d = %.2f", N1, operator, N2, sum4);
                } else {
                    System.out.printf("Cannot divide %d by zero", N1);
                }
                break;
            case "%":
                double sum5 = N1 * 1.0 % N2;
                if (N2 > 0) {
                    System.out.printf("%d %s %d = %.0f", N1, operator, N2, sum5);
                } else {
                    System.out.printf("Cannot divide %d by zero", N1);
                }
        }
    }
}
