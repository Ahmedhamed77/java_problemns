package basics;
import java.util.Scanner;

public class Basics_1 {


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        String[] months = {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
        };

        System.out.print("Enter a number of the month (1-12): ");

        int monthNumber = scanner.nextInt();

        if(monthNumber < 1 || monthNumber > 12) {
            System.out.println("Invalid month number");
        } else {
            System.out.println("The month is " + months[monthNumber - 1]);
        }


        scanner.close();

    }

}
