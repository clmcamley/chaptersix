//Exercise 6.16

public class NumberOfDaysInYearMethod {
    public static void main(String[] args) {
        testNumberOfDaysInAYear();
    }

    public static int numberOfDaysInAYear (int year) {
        int numberOfDays;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            numberOfDays = 366;
        } else {
            numberOfDays = 365;
        }

        return numberOfDays;
    }

    public static void testNumberOfDaysInAYear() {
        System.out.println("Year      Number Of Days");
        for (int i = 2000; i <= 2020; i++) {
            System.out.printf("%4d%16d\n", i, numberOfDaysInAYear(i));
        }
    }
}