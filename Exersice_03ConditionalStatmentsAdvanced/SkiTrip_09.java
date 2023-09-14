package Exersice_03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String mark = scanner.nextLine();

        double price = 0;

        switch (room) {
            case "room for one person":
                price = (days - 1) * 18;
                if (mark.equals("positive")) {
                    price = price + (price * 0.25);
                    System.out.printf("%.2f", price);
                } else if (mark.equals("negative")) {
                    price = price - (price * 0.10);
                    System.out.printf("%.2f", price);
                }
                break;
            case "apartment":
                price = (days - 1) * 25;
                if (days < 10) {
                    price = price * 0.70;
                } else if (days > 10 && days <= 15) {
                    price = price * 0.65;
                } else {
                    price = price * 0.50;
                }
                if (mark.equals("positive")) {
                    price = price + (price * 0.25);
                    System.out.printf("%.2f", price);
                } else if (mark.equals("negative")){
                    price = price - (price * 0.10);
                    System.out.printf("%.2f", price);
                }
                break;
            case "president apartment":
                price = (days - 1) * 35;
                if (days < 10) {
                    price = price * 0.90;
                } else if (days > 10 && days <= 15) {
                    price = price * 0.85;
                } else {
                    price = price * 0.80;

                }
                if (mark.equals("positive")) {
                    price = price + (price * 0.25);
                    System.out.printf("%.2f", price);
                } else if (mark.equals("negative")){
                    price = price - (price * 0.10);
                    System.out.printf("%.2f", price);
                }
                break;
        }
    }
}


