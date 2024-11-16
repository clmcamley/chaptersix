//Exercise 6.2

import java.util.Scanner;

public class SumDigitsMethod {
    public static void main(String[] args) {
        testSumDigits();
    }

    public static int sumDigits (long n) {
        long sumOfDigits = 0;
        do {
            sumOfDigits = sumOfDigits + (n % 10);
            n = n / 10;
        } while (n > 0);

        return (int)(sumOfDigits);
    }

    public static void testSumDigits() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        long testInteger = input.nextLong();

        System.out.println("The sum of the digits of " + testInteger + " is " + sumDigits(testInteger));
    }
}
