package loops;

public class loops_8 {
    public static void main(String[] args) {
        int product = 1;

        for (int i = 1; i <= 15; i++) {

            if (i % 2 != 0) {
                product *= i;
            }
        }


        System.out.println("The product of the odd numbers from 1 to 15 is: " + product);
    }
}
