package Exersice_03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String holiday = "";
        double spent = 0;


        if (budget <= 100) {
            destination = "Bulgaria";
            switch (season) {
                case "summer":
                    spent = budget * 0.30;
                    holiday = "Camp";
                    break;
                case "winter":
                    spent = budget * 0.70;
                    holiday = "Hotel";
                    break;
            }
            System.out.printf("Somewhere in %s" ,destination);
            System.out.printf("\n%s - %.2f",holiday,spent);
        } else if (budget <= 1000) {
            destination = "Balkans";
            switch (season) {
                case "summer":
                    holiday = "Camp";
                    spent = budget * 0.40;
                    break;
                case "winter":
                    holiday = "Hotel";
                    spent = budget * 0.80;
                    break;
            }
            System.out.printf("Somewhere in %s" ,destination);
            System.out.printf("\n%s - %.2f",holiday,spent);
        } else {
            destination = "Europe";
            holiday = "Hotel";
            spent = budget * 0.90;
            System.out.printf("Somewhere in %s" ,destination);
            System.out.printf("\n%s - %.2f",holiday,spent);
        }
    }
}

