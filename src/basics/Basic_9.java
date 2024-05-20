package basics;

import java.util.Scanner;

// minandmax


public class Basic_9 {
 
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");


        int first_num = scanner.nextInt();

        System.out.print("Enter the second number: ");

        int second_num = scanner.nextInt();

        System.out.print("Enter the third number: ");

        int third_num = scanner.nextInt();

        int max = (first_num > second_num) ? (first_num > third_num ? first_num : third_num) : (second_num > third_num ? second_num : third_num);

        int min = (first_num < second_num) ? (first_num < third_num ? first_num : third_num) : (second_num < third_num ? second_num : third_num);

        

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);


        scanner.close();
    }
}
