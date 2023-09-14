package Lab_06AdvancedLoops;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());
            double currentMoney = 0;
            while (currentMoney < budget){
                double savedMoney = Double.parseDouble(scanner.nextLine());
                currentMoney = currentMoney + savedMoney;
            }
            System.out.printf("Going to %s!\n",destination);
            destination = scanner.nextLine();
        }
    }
}
