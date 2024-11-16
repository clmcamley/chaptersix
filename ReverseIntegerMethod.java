//Exercise 6.4

import java.util.Scanner;

public class ReverseIntegerMethod {
    public static void main(String[] args) {
        testReverse();
    }

    public static void reverse (int number) {
        String reverse = "";

        do {
            reverse = reverse + (number % 10);
            number = number / 10;
        } while (number > 0);

        System.out.println(reverse);
    }

    public static void testReverse() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.print("The reverse of " + number + " is ");
        reverse(number);
    }
}
