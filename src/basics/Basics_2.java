package basics;

import java.util.Scanner;

// Write a java program that read a number of the month and print the month is in Summer, spring,
//winter or autumn.


public class Basics_2 {
    
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number of the month (1-12):");

        int monthNumber = scanner.nextInt();
        
        String seasonOfMonth = "";

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                seasonOfMonth = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                seasonOfMonth = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                seasonOfMonth = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                seasonOfMonth = "Autumn";
                break;
        
            default:
                System.out.println("Invalid month number");
                break;
        }


        if(!seasonOfMonth.isEmpty()){
            System.out.println("The month is in " + seasonOfMonth);
        }

        scanner.close();
    }
}
