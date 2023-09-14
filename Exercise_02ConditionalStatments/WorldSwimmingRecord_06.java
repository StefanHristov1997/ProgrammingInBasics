package Exercise_02ConditionalStatments;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double record = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double time = Double.parseDouble(scan.nextLine());

        double newRecord = distance * time;
        double resistance = Math.floor(distance / 15) * 12.5;
        double ivanRecord = newRecord + resistance;

        if (ivanRecord < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",ivanRecord);
        } else  {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(record- ivanRecord));
        }
    }
}
