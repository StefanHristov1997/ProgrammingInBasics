package Lab_06AdvancedLoops;

import java.util.Scanner;

public class SumTwoNumbers_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());

        int countCombination = 0;
        boolean isFound = false;

        for (int i = x1; i <= x2; i++) {
            for (int j = x1; j <= x2; j++) {
                countCombination++;
                if (i + j == x3) {
                    isFound = true;
                    x1 = i;
                    x2 = j;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        if (isFound) {
            System.out.printf("Combination N:%d (%d + %d = %d)", countCombination, x1, x2, x3);
        } else {
            System.out.printf("%d combinations - neither equals %d", countCombination, x3);
        }
    }
}
