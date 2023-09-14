package Exersice_04ForLoops;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lilyYears = Integer.parseInt(scanner.nextLine());
        double washMashinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double burthMoney = 0;
        double totalMoney = 0;
        int toys = 0;
        int brother = 0;

        for (int i = 1; i <= lilyYears; i++) {

            if (i % 2 == 0) {
                burthMoney = burthMoney + 10;
                totalMoney = totalMoney + burthMoney;
                brother++;
            } else {
                toys++;
            }
        }

        double toysMoney = toys * toyPrice;
        double total = totalMoney + toysMoney - brother;
        double diff = Math.abs(total - washMashinePrice);

        if (total >= washMashinePrice){
            System.out.printf("Yes! %.2f", diff);
        }else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
