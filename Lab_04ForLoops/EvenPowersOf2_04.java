package Lab_04ForLoops;

import java.util.Scanner;

public class EvenPowersOf2_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= number; i += 2) {
            double n = Math.pow(2, i);
            System.out.printf("%.0f\n",n);
        }
    }
}
