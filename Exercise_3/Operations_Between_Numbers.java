import java.util.Scanner;

public class Operations_Between_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);

        switch (operator) {
            case '+':
                int sum = N1 + N2;
                System.out.printf("%d + %d = %d - %s%n", N1, N2, sum, isEven(sum));
                break;
            case '-':
                int difference = N1 - N2;
                System.out.printf("%d - %d = %d - %s%n", N1, N2, difference, isEven(difference));
                break;
            case '*':
                int product = N1 * N2;
                System.out.printf("%d * %d = %d - %s%n", N1, N2, product, isEven(product));
                break;
            case '/':
                if (N2 == 0) {
                    System.out.println("Cannot divide " + N1 + " by zero");
                } else {
                    double division = (double) N1 / N2;
                    System.out.printf("%d / %d = %.2f%n", N1, N2, division);
                }
                break;
            case '%':
                if (N2 == 0) {
                    System.out.println("Cannot divide " + N1 + " by zero");
                } else {
                    int remainder = N1 % N2;
                    System.out.printf("%d %% %d = %d%n", N1, N2, remainder);
                }
                break;
        }
    }

    private static String isEven(int number) {
        return number % 2 == 0 ? "even" : "odd";
    }
}
