package basics;

import java.util.Scanner;

public class Basic_3 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character: ");

        String vowels = "AEIOUaeiou";

        String user_input = scanner.next();

        if (user_input.length() > 1) {
            System.out.println("Invalid input,  please enter only one character");
        } else {
            char nextChar = user_input.charAt(0);

            if (Character.isDigit(nextChar)) {
                System.out.println("Invalid option, please enter only one character.");
            } else {
                System.out.println(vowels.indexOf(nextChar) != -1);

                if (vowels.indexOf(nextChar) != -1) {
                    System.out.println( nextChar + " The character is a vowel");
                } else {
                    System.out.println(nextChar + " The character is a consonant");
                }
            }

        }

        scanner.close();
    }
}
