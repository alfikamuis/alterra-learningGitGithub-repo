package CRUD;

import java.util.Scanner;

public class Utility {
    static Scanner scan = new Scanner(System.in);
    public static boolean yesNo(){
        //yes or no
        String choice = "n";
        while(!choice.equalsIgnoreCase("y")){
            System.out.print("apakah lanjut gan?");
            choice = scan.nextLine();
            if (choice.equalsIgnoreCase("n")){return false;}
        }
        return true;
    }
}
