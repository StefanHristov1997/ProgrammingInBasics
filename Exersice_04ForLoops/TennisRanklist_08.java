package Exersice_04ForLoops;

import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int firstPoints = Integer.parseInt(scanner.nextLine());

        int allPoints = firstPoints;
        double averagePoints = 0;
        double winner = 0;

        for (int i = 0; i < tournaments; i++) {
            String rank = scanner.nextLine();
            switch (rank) {
                case "W":
                    allPoints = allPoints + 2000;
                    averagePoints = averagePoints + 2000;
                    winner++;
                    break;
                case "F":
                    allPoints = allPoints + 1200;
                    averagePoints = averagePoints + 1200;
                    break;
                case "SF":
                    allPoints = allPoints + 720;
                    averagePoints = averagePoints + 720;
                    break;
            }
        }
        winner = winner / tournaments * 100;
        averagePoints = Math.floor(averagePoints / tournaments);

        System.out.printf("Final points: %d\n", allPoints);
        System.out.printf("Average points: %.0f\n", averagePoints);
        System.out.printf("%.02f%%", winner);
    }
}
