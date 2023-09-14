package Exersice_05WhileLoops;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGrades = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        double totalGrades = 0;
        int poorGradeCount = 0;
        int gradeCount = 0;
        int commandCount = 0;
        String lastExercise = "";

        while (!command.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4) {
                poorGradeCount++;
            }

            if (poorGradeCount == poorGrades) {
                System.out.printf("You need a break, %d poor grades.", poorGradeCount);
                break;
            }

            totalGrades = totalGrades + grade;
            gradeCount++;
            commandCount++;
            lastExercise = command;
            command = scanner.nextLine();
        }
        double average = totalGrades / gradeCount;

        if (command.equals("Enough")) {
            System.out.printf("Average score: %.2f\n", average);
            System.out.printf("Number of problems: %d\n", commandCount);
            System.out.printf("Last problem: %s", lastExercise);
        }
    }
}