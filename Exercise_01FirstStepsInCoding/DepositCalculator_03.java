package Exercise_01FirstStepsInCoding;

import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int mounth = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double finalDeposit = deposit + mounth * ((deposit * percent/100/12));
        System.out.println(finalDeposit);
    }
}
