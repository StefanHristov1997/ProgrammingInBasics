package Lab_01FirstStepsInCoding;

import java.util.Scanner;

public class InchestoCentimeters_04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double inches = Double.parseDouble(scanner.nextLine());
        double centimeters = inches * 2.54;

        System.out.println(centimeters);

    }
}
