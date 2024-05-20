package basics;

import java.util.Scanner;


// write a program to calculate the sum of positive integers and sum of negative integers for 6 integers.

public class Basic_10 {


    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);
        int[] arr_numbs = new int[6];


        System.out.println("Enter 6 integers:");


        for (int i = 0; i < arr_numbs.length; i++) {
            
            arr_numbs[i] = scanner.nextInt();
        }

        int sum_positive = 0;
        int sum_negative = 0;

        for (int number : arr_numbs) {
            if (number > 0) {
                sum_positive += number;
            } else if (number < 0) {
                sum_negative += number;
            }
        }

        System.out.println("Sum of positive integers: " + sum_positive);
        System.out.println("Sum of negative integers: " + sum_negative);


        scanner.close();
    }
    
}
