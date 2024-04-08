import java.util.Scanner;

public class Number_in_Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = scanner.nextDouble();

        if (number != 0 && number >= -100 && number <= 100) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
