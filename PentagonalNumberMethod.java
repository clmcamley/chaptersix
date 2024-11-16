//Exercise 6.1

public class PentagonalNumberMethod {
    public static void main(String[] args) {
        testGetPentagonalNumber();
    }

    public static int getPentagonalNumber (int n) {
        int pentagonal = n * (3*n - 1) / 2;
        return pentagonal;
    }

    public static void testGetPentagonalNumber () {
        final int NUMBER_OF_PENTAGONALS_PER_LINE = 10;
        System.out.println("The first 100 pentagonal numbers are: ");
        for (int i = 1; i <= 100; i++) {
            if (i % NUMBER_OF_PENTAGONALS_PER_LINE == 0) {
                System.out.printf("%7d\n", getPentagonalNumber(i));
            } else {
                System.out.printf("%7d", getPentagonalNumber(i));
            }
        }
    }
}
