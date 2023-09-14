package Exersice_03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeProject = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double budget = 0;

        if (typeProject.equals("Premiere")) {
            budget = (rows * columns) * 12;
        } else if (typeProject.equals("Normal")) {
            budget = (rows * columns) * 7.50;
        } else if (typeProject.equals("Discount")) {
            budget = (rows * columns) * 5;
        }
        System.out.printf("%.2f leva", budget);
    }
}
