package Exercise_01FirstStepsInCoding;

import java.util.Scanner;

public class BasketballEquipment_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int basketball = Integer.parseInt(scanner.nextLine());

        double shoes = basketball - (basketball * 0.40);
        double ekip = shoes - (shoes * 0.20);
        double boll = ekip / 4;
        double aksesoari = boll / 5;

        double finalPrice = basketball + shoes + ekip + boll + aksesoari;

        System.out.println(finalPrice);}
}
