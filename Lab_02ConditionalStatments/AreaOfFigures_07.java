package Lab_02ConditionalStatments;

import java.util.Scanner;

public class AreaOfFigures_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();

        if (figure.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            double area1 = a * a;
            System.out.printf("%.3f", area1);
        } else if (figure.equals("rectangle")) {
            double b = Double.parseDouble(scanner.nextLine());
            double c = Double.parseDouble(scanner.nextLine());
            double area2 = b * c;
            System.out.printf("%.3f", area2);
        } else if (figure.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            double area3 = Math.PI * r * r;
            System.out.printf("%.3f", area3);
        } else if (figure.equals("triangle")) {
            double a1 = Double.parseDouble(scanner.nextLine());
            double b1 = Double.parseDouble(scanner.nextLine());
            double area4 = (a1 * b1) / 2;
            System.out.printf("%.3f", area4);
        }
    }
}


