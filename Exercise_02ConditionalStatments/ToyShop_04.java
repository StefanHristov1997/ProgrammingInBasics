package Exercise_02ConditionalStatments;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());


        int puzzels = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double pricePuzzels = puzzels * 2.60;
        double priceDolls = dolls * 3;
        double priceTeddyBears = teddyBears * 4.10;
        double priceMinions = minions * 8.20;
        double priceTrucks = trucks * 2;

        double profit = pricePuzzels + priceDolls + priceTeddyBears + priceMinions + priceTrucks;
        int numberToys = puzzels + dolls + teddyBears + minions + trucks;

        if (numberToys >= 50) {
            profit = profit - (profit * 0.25);
        }

        double finalProfit = profit - (profit * 0.10);
        double diff = Math.abs(finalProfit - vacationPrice);

        if (finalProfit >= vacationPrice){
            System.out.printf("Yes! %.2f lv left.",diff);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}
