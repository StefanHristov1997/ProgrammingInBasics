package Exercise_01FirstStepsInCoding;

import java.util.Scanner;

public class FoodDelivery_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chickenMenu * 10.35;
        double fishPrice = fishMenu * 12.40;
        double veganPrice = veganMenu * 8.15;

        double sumPrice = chickenPrice + fishPrice + veganPrice;
        double desert = sumPrice * 0.20;
        double finalPrice = sumPrice + desert + 2.50;
        System.out.println(finalPrice);}
    }
