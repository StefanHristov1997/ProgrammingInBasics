package Exersice_04ForLoops;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int juri = Integer.parseInt(scanner.nextLine());

        double allPoint = 0;
        double fullPoints = points;

        for (int i = 0; i < juri; i++) {
            String juriName = scanner.nextLine();
            double juriPoints = Double.parseDouble(scanner.nextLine());

            allPoint = (juriName.length() * juriPoints) / 2;
            fullPoints = fullPoints + allPoint;

            if (fullPoints > 1250.5) {
                break;
            }
        }

        if (fullPoints > 1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.01f!", actorName , fullPoints);
        }else {
            System.out.printf("Sorry, %s you need %.01f more!",actorName, 1250.5 - fullPoints);
        }
    }
}
