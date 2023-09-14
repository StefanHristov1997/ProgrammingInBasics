package Lab_04ForLoops;

import java.util.Scanner;

public class OddEvenSum_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int odd = 0;
        int even = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                even = even + number;
            } else {
                odd = odd + number;
            }
        }

        int diff = Math.abs(odd - even);

        if (even == odd) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", even);
        }else {
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}