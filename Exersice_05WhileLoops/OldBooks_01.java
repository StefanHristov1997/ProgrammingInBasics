package Exersice_05WhileLoops;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String wantedBook = scanner.nextLine();
        String text = scanner.nextLine();
        int bookCounted = 0;
        boolean isFounded = false;

        while (!text.equals("No More Books")) {

            if (text.equals(wantedBook)) {
                isFounded = true;
                break;
            }

            bookCounted++;
            text = scanner.nextLine();
        }

        if(isFounded){
            System.out.printf("You checked %d books and found it.",bookCounted);
        }else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",bookCounted);
        }
    }
}
