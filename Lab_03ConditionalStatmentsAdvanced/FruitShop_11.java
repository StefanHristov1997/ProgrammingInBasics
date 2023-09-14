package Lab_03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class FruitShop_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (product) {
                    case "banana":
                        price = 2.50;
                        double totalPrice1 = quantity * price;
                        System.out.printf("%.2f", totalPrice1);
                        break;
                    case "apple":
                        price = 1.20;
                        double totalPrice2 = quantity * price;
                        System.out.printf("%.2f", totalPrice2);
                        break;
                    case "orange":
                        price = 0.85;
                        double totalPrice3 = quantity * price;
                        System.out.printf("%.2f", totalPrice3);
                        break;
                    case "grapefruit":
                        price = 1.45;
                        double totalPrice4 = quantity * price;
                        System.out.printf("%.2f", totalPrice4);
                        break;
                    case "kiwi":
                        price = 2.70;
                        double totalPrice5 = quantity * price;
                        System.out.printf("%.2f", totalPrice5);
                        break;
                    case "pineapple":
                        price = 5.50;
                        double totalPrice6 = quantity * price;
                        System.out.printf("%.2f", totalPrice6);
                        break;
                    case "grapes":
                        price = 3.85;
                        double totalPrice7 = quantity * price;
                        System.out.printf("%.2f", totalPrice7);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "Saturday":
            case "Sunday":
                switch (product) {
                    case "banana":
                        price = 2.70;
                        double totalPrice8 = quantity * price;
                        System.out.printf("%.2f", totalPrice8);
                        break;
                    case "apple":
                        price = 1.25;
                        double totalPrice9 = quantity * price;
                        System.out.printf("%.2f", totalPrice9);
                        break;
                    case "orange":
                        price = 0.90;
                        double totalPrice10 = quantity * price;
                        System.out.printf("%.2f", totalPrice10);
                        break;
                    case "grapefruit":
                        price = 1.60;
                        double totalPrice11 = quantity * price;
                        System.out.printf("%.2f", totalPrice11);
                        break;
                    case "kiwi":
                        price = 3;
                        double totalPrice12 = quantity * price;
                        System.out.printf("%.2f", totalPrice12);
                        break;
                    case "pineapple":
                        price = 5.60;
                        double totalPrice13 = quantity * price;
                        System.out.printf("%.2f", totalPrice13);
                        break;
                    case "grapes":
                        price = 4.20;
                        double totalPrice14 = quantity * price;
                        System.out.printf("%.2f", totalPrice14);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            default:
                System.out.println("error");
        }
    }
}

