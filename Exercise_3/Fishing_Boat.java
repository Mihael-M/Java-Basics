import java.util.Scanner;

public class Fishing_Boat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на бюджет, сезон и брой рибари
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermenCount = Integer.parseInt(scanner.nextLine());

        // Цена за наем на кораба според сезона
        double boatRentPrice = 0;

        switch (season) {
            case "Spring":
                boatRentPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                boatRentPrice = 4200;
                break;
            case "Winter":
                boatRentPrice = 2600;
                break;
        }

        // Прилагане на отстъпки в зависимост от броя на рибарите
        if (fishermenCount <= 6) {
            boatRentPrice *= 0.90; // 10% отстъпка
        } else if (fishermenCount <= 11) {
            boatRentPrice *= 0.85; // 15% отстъпка
        } else {
            boatRentPrice *= 0.75; // 25% отстъпка
        }

        // Допълнителна отстъпка за четен брой рибари през лятото и есента
        if ((season.equals("Summer") || season.equals("Autumn")) && fishermenCount % 2 == 0) {
            boatRentPrice *= 0.95; // 5% допълнителна отстъпка
        }

        // Проверка дали бюджетът е достатъчен
        double moneyLeft = budget - boatRentPrice;
        if (moneyLeft >= 0) {
            System.out.printf("Yes! You have %.2f leva left.%n", moneyLeft);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.%n", Math.abs(moneyLeft));
        }
    }
}
