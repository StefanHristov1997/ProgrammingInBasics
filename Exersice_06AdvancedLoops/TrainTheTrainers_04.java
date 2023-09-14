package Exersice_06AdvancedLoops;

import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String presentation = scanner.nextLine();
        double gradeSum = 0;
        int gradeCount = 0;

        while (!presentation.equals("Finish")) {
            double currentGrades = 0;
            for (int i = 1; i <= n; i++) {
                double grades = Double.parseDouble(scanner.nextLine());
                currentGrades = currentGrades + grades;
                gradeCount++;
            }
            gradeSum = gradeSum + currentGrades;
            double avrgGrade = currentGrades / n;
            System.out.printf("%s - %.02f.\n", presentation, avrgGrade);
            presentation = scanner.nextLine();
        }
        double finalGrade = gradeSum / gradeCount;
        System.out.printf("Student's final assessment is %.02f.", finalGrade);
    }
}

