package Lab_03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class PersonalTitles_04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double age = Double.parseDouble(scan.nextLine());
        String gender = scan.nextLine();
        String result = "";

        if (age < 16) {

            if (gender.equals("m")){
                result = "Master";
            }else
                result = "Miss";

        }else  {

            if (gender.equals("m")){
                result = "Mr.";
            }else {
                result = "Ms.";
            }

        }
        System.out.println(result);
    }
}
