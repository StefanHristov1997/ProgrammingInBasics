package Lab_03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class WorkingHours_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        String shop = "";

        if (day.equals("Monday")) {

            if (hour >= 10 && hour <= 18) {
                shop = "open";
            } else {
                shop = "closed";
            }

        } else if (day.equals("Tuesday")) {

            if (hour >= 10 && hour <= 18) {
                shop = "open";
            } else {
                shop = "closed";
            }

        } else if (day.equals("Wednesday")) {

            if (hour >= 10 && hour <= 18) {
                shop = "open";
            } else {
                shop = "closed";
            }

        } else if (day.equals("Thursday")) {
            if (hour >= 10 && hour <= 18) {
                shop = "open";
            } else {
                shop = "closed";
            }
        } else if (day.equals("Friday")) {

            if (hour >= 10 && hour <= 18) {
                shop = "open";
            } else {
                shop = "closed";
            }

        } else if (day.equals("Saturday")) {

            if (hour >= 10 && hour <= 18) {
                shop = "open";
            } else {
                shop = "closed";
            }

        } else {
            shop = "closed";
        }

        System.out.println(shop);
    }
}