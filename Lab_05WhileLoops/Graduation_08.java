package Lab_05WhileLoops;

import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int classCount = 0;
        int poorGrade = 0;
        double totalGrades = 0;
        int finishClass = 1;

        while (classCount < 12) {

            if (poorGrade == 2) {
                break;
            }

            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4) {
                poorGrade++;
                continue;
            }

            totalGrades = totalGrades + grade;
            finishClass++;
            classCount++;
        }

        double average = totalGrades / 12;

        if (classCount == 12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, finishClass);
        }
    }
}