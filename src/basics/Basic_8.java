package basics;

import java.util.Scanner;

// Write a program that reads in three Floating-point numbers and sort them.

public class Basic_8 {
    

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");

        float[] sort_numbers = new float[3];


        float first_num = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        
        float second_num = scanner.nextFloat();

        System.out.print("Enter the third number: ");

        float third_num = scanner.nextFloat();

        sort_numbers[0] = first_num;
        sort_numbers[1] = second_num;
        sort_numbers[2] = third_num;

        if(sort_numbers[0] > sort_numbers[1]) {
            float temp = sort_numbers[0];
            sort_numbers[0] = sort_numbers[1];
            sort_numbers[1] = temp;
        }
        if(sort_numbers[1] > sort_numbers[2]) {
            float temp = sort_numbers[1];
            sort_numbers[1] = sort_numbers[2];
            sort_numbers[2] = temp;
        }
        if(sort_numbers[0] > sort_numbers[1]) {
            float temp = sort_numbers[0];
            sort_numbers[0] = sort_numbers[1];
            sort_numbers[1] = temp;
        }


        System.out.println("The sorted numbers are: ");
        for (float number : sort_numbers) {
            System.out.println(number);
        }


        scanner.close();
    }
 
}
