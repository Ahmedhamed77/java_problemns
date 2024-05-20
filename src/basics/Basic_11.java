package basics;

import java.util.Arrays;
import java.util.Scanner;

public class Basic_11 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];

        System.out.println("Enter the first number: ");

        numbers[0] = scanner.nextInt();

        System.out.println("Enter the second number: ");

        numbers[1] = scanner.nextInt();

        System.out.println("Enter the third number: ");

        numbers[2] = scanner.nextInt();



        // int greatest_number = numbers[0];
        
        // for(int i = 1; i < numbers.length; i++) {
        //     if(numbers[i] > greatest_number) {
        //         greatest_number = numbers[i];
        //     }
        // }

        
        int greatest_number = Arrays.stream(numbers).max().getAsInt();

        System.out.println("The greatest number is: " + greatest_number);


        scanner.close();    
    }
}
