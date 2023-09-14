package Exersice_06AdvancedLoops;

import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int primeSum = 0;
        int nonPrime = 0;

        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);

            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            int counter = 0;

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                primeSum = primeSum + number;
            }else{
                nonPrime = nonPrime + number;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n",primeSum);
        System.out.printf("Sum of all non prime numbers is: %d",nonPrime);
    }
}
