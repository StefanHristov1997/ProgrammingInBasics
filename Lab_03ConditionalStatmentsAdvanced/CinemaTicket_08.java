package Lab_03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class CinemaTicket_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        double ticketPrice = 0;

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Friday")) {
            ticketPrice = 12;
        } else if (day.equals("Wednesday") || day.equals("Thursday")) {
            ticketPrice = 14;
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            ticketPrice = 16;
        }
        System.out.printf("%.0f", ticketPrice);
    }
}
