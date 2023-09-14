package Exersice_04ForLoops;

import java.util.Scanner;

public class Salary_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            String sait = scanner.nextLine();
            switch (sait) {
                case "Facebook":
                    salary = salary - 150;
                    break;
                case "Instagram":
                    salary = salary - 100;
                    break;
                case "Reddit":
                    salary = salary - 50;
                    break;
            }
            if (salary <= 0) {
                break;
            }
        }
        if (salary > 0){
            System.out.printf("%.0f",salary);
        }else{
            System.out.println("You have lost your salary.");
        }

    }
}