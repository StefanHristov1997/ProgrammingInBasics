package Exercise_01FirstStepsInCoding;

import java.util.Scanner;

public class Repainting_6 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int raz = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double sumNylon = (nylon + 2) * 1.50;
        double sumPaint = (paint + paint * 0.10) * 14.50;
        double sumRaz = raz * 5;
        double sumPrice = sumNylon + sumPaint + sumRaz + 0.40;
        double workersPrice = (sumPrice * 0.30) * workers;
        double finalPrice = sumPrice + workersPrice;

        System.out.println(finalPrice);

    }
}
