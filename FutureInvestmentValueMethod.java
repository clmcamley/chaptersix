//Exercise 6.7

import java.util.Scanner;

public class FutureInvestmentValueMethod {
    public static void main(String[] args) {
        testFutureInvestmentValue();
    }

    public static double futureInvestmentValue (double investmentAmount, double monthlyInterestRate, int years) {
        double investmentValue = investmentAmount * Math.pow(1 + (monthlyInterestRate / 100), years * 12);

        return investmentValue;
    }

    public static void testFutureInvestmentValue() {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.println("Years     Future Value");
        for (int i = 1; i <= 30; i++) {
            System.out.printf("%-2d%20.2f\n", i, futureInvestmentValue(investmentAmount, annualInterestRate / 12, i));
        }
    }
}
