package Lab_04ForLoops;

import java.util.Scanner;

public class LeftRightSum_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int rightSide = 0;
        int sumRightSide = 0;
        int leftSide = 0;
        int sumLeftSide = 0;

        for (int i = 0; i < n; i++) {
            rightSide = Integer.parseInt(scanner.nextLine());
            sumRightSide = sumRightSide + rightSide;
        }

        for (int i = 0; i < n; i++) {
            leftSide = Integer.parseInt(scanner.nextLine());
            sumLeftSide = sumLeftSide + leftSide;
        }

        int diff = Math.abs(sumLeftSide - sumRightSide);

        if (sumRightSide == sumLeftSide) {
            System.out.printf("Yes, sum = %d", sumLeftSide);
        } else {
            System.out.printf("No, diff = %d", diff);
        }
    }
}
