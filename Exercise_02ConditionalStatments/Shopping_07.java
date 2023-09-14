package Exercise_02ConditionalStatments;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budgetPetur = Double.parseDouble(scan.nextLine());

        int videoCards = Integer.parseInt(scan.nextLine());
        int processors = Integer.parseInt(scan.nextLine());
        int rams = Integer.parseInt(scan.nextLine());

        double priceVideoCards = videoCards * 250;
        double priceProcessors = (priceVideoCards * 0.35) * processors;
        double priceRams = (priceVideoCards * 0.10) * rams;

        double result = priceProcessors + priceVideoCards + priceRams;

        if (videoCards > processors) {
            result = result - (result * 0.15);
        }

        double diff = Math.abs(result - budgetPetur);
        System.out.println();

        if (result <= budgetPetur) {
            System.out.printf("You have %.2f leva left!", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }
    }
}