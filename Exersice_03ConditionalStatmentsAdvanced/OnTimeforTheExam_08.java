package Exersice_03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class OnTimeforTheExam_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testTime = Integer.parseInt(scanner.nextLine());
        int minuteTime = Integer.parseInt(scanner.nextLine());
        int arriveTime = Integer.parseInt(scanner.nextLine());
        int arriveMinute = Integer.parseInt(scanner.nextLine());

        int arriveTimeInMinutes = arriveTime * 60 + arriveMinute;
        int examTimeInMinutes = testTime * 60 + minuteTime;

        int diff = Math.abs(examTimeInMinutes - arriveTimeInMinutes);

        if (examTimeInMinutes < arriveTimeInMinutes) {
            System.out.println("Late");
            if (diff >= 60) {
                int hours = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            } else {
                System.out.printf("%d minutes after the start", diff);
            }
        } else if (arriveTimeInMinutes == examTimeInMinutes || diff <= 30) {
            System.out.println("On time");
            if (diff >= 1 && diff <= 30) {
                System.out.printf("%d minutes before the start", diff);
            }
        } else {
            System.out.println("Early");
            if (diff >= 60) {
                int hours = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours before the start",hours , minutes);
            }else {
                System.out.printf("%d minutes before the start", diff);
            }
        }
    }
}

