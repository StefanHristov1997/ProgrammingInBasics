package Exersice_06AdvancedLoops;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String film = scanner.nextLine();
        int studentCount = 0;
        int standardCount = 0;
        int kidCount = 0;
        int totalTickets = 0;


        while (!film.equals("Finish")) {
            int seats = Integer.parseInt(scanner.nextLine());
            String type = scanner.nextLine();
            int currentTickets = 0;
            while (!type.equals("End")) {
                currentTickets++;
                totalTickets++;
                switch (type) {
                    case "student":
                        studentCount++;
                        break;
                    case "standard":
                        standardCount++;
                        break;
                    case "kid":
                        kidCount++;
                        break;
                }
                if (currentTickets >= seats) {
                    break;
                }
                type = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.\n", film, currentTickets * 1.0 / seats * 100);
            film = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d\n",totalTickets);
        System.out.printf("%.2f%% student tickets.\n", studentCount * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.\n", standardCount * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kidCount * 1.0 / totalTickets * 100);
    }
}
