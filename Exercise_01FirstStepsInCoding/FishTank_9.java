package Exercise_01FirstStepsInCoding;

import java.util.Scanner;

public class FishTank_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int duljina = Integer.parseInt(scanner.nextLine());
        int shirochina = Integer.parseInt(scanner.nextLine());
        int visochina = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int obem = duljina * visochina * shirochina;
        double litri = obem * 0.001;
        double fullTank = litri * (1 - percent/100);

        System.out.println(fullTank);

    }
}
