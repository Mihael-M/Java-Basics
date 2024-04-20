import java.util.Scanner;
public class ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupSize = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();

        double pricePerPerson = 0;

        switch (season) {
            case "spring":
                if (groupSize <= 5) {
                    pricePerPerson = 50.00;
                } else {
                    pricePerPerson = 48.00;
                }
                break;
            case "summer":
                if (groupSize <= 5) {
                    pricePerPerson = 48.50 * 0.85;
                } else {
                    pricePerPerson = 45.00 * 0.85;
                }
                break;
            case "autumn":
                if (groupSize <= 5) {
                    pricePerPerson = 60.00;
                } else {
                    pricePerPerson = 49.50;
                }
                break;
            case "winter":
                if (groupSize <= 5) {
                    pricePerPerson = 86.00 * 1.08;
                } else {
                    pricePerPerson = 85.00 * 1.08;
                }
                break;
        }

        double totalPrice = groupSize * pricePerPerson;
        System.out.printf("%.2f leva.", totalPrice);
    }
}
