import java.util.Scanner;

public class Trade_Commissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на име на град и обем на продажби

        String city = scanner.nextLine();


        double sales = Double.parseDouble(scanner.nextLine());

        // Проверка за валидност на града и обема на продажбите
        if (isValidCity(city) && sales >= 0) {
            double commission = calculateCommission(city, sales);
            System.out.printf("%.2f%n", commission);
        } else {
            System.out.println("error");
        }
    }

    // Метод за изчисляване на комисионната
    public static double calculateCommission(String city, double sales) {
        double commission = 0;

        if (city.equalsIgnoreCase("Sofia")) {
            if (sales <= 500) {
                commission = sales * 0.05;
            } else if (sales <= 1000) {
                commission = sales * 0.07;
            } else if (sales <= 10000) {
                commission = sales * 0.08;
            } else {
                commission = sales * 0.12;
            }
        } else if (city.equalsIgnoreCase("Varna")) {
            if (sales <= 500) {
                commission = sales * 0.045;
            } else if (sales <= 1000) {
                commission = sales * 0.075;
            } else if (sales <= 10000) {
                commission = sales * 0.10;
            } else {
                commission = sales * 0.13;
            }
        } else if (city.equalsIgnoreCase("Plovdiv")) {
            if (sales <= 500) {
                commission = sales * 0.055;
            } else if (sales <= 1000) {
                commission = sales * 0.08;
            } else if (sales <= 10000) {
                commission = sales * 0.12;
            } else {
                commission = sales * 0.145;
            }
        }

        return commission;
    }

    // Метод за валидиране на името на града
    public static boolean isValidCity(String city) {
        return city.equalsIgnoreCase("Sofia") ||
                city.equalsIgnoreCase("Varna") ||
                city.equalsIgnoreCase("Plovdiv");
    }
}