package Exercise_02ConditionalStatments;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double cloths = Double.parseDouble(scanner.nextLine());

        double cloths1 = statists * cloths;
        double priceDecor = budget * 0.10;

        if (statists > 150) {
            cloths1 = cloths1 - (cloths1 * 0.10);
        }

        double priceForAll = priceDecor + cloths1;

        if (priceForAll > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", priceForAll - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - priceForAll);
        }
    }
}
