package Exersice_03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (flowers) {
            case "Roses":
                price = number * 5;
                if (number > 80) {
                    price = price - (price * 0.10);
                }
                break;
            case "Dahlias":
                price = number * 3.80;
                if (number > 90) {
                    price = price - (price * 0.15);
                }
                break;
            case "Tulips":
                price = number * 2.80;
                if (number > 80) {
                    price = price - (price * 0.15);
                }
                break;
            case "Narcissus":
                price = number * 3;
                if (number < 120) {
                    price = price + price * 0.15;
                }
                break;
            case "Gladiolus":
                price = number * 2.50;
                if (number < 80) {
                    price = price + price * 0.20;
                }
                break;
        }

        double diff = Math.abs(budget - price);

        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flowers, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}

