package Exercise_01FirstStepsInCoding;

import java.util.Scanner;

public class SuppliesforSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Брой пакети химикали - цяло число в интервала [0...100]
        int pens = Integer.parseInt(scanner.nextLine());
        //•	Брой пакети маркери - цяло число в интервала [0...100]
        int markers = Integer.parseInt(scanner.nextLine());
        //•	Литри препарат за почистване на дъска - цяло число в интервала [0…50]
        int preparats = Integer.parseInt(scanner.nextLine());
        //•	Процент намаление - цяло число в интервала [0...100]
        int discount = Integer.parseInt(scanner.nextLine());

        double pricePens = pens * 5.80;
        double priceMarkes = markers * 7.20;
        double pricePreparats = preparats * 1.20;
        double sumPrice = pricePens + priceMarkes + pricePreparats;
        double discountPrice = sumPrice - (sumPrice * discount/100);

        System.out.println(discountPrice);
    }
}
