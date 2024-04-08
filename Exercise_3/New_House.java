import java.util.Scanner;

public class New_House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на вид цветя, брой цветя и бюджет
        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        // Цена на брой цветя за съответния вид
        double pricePerFlower = 0;

        switch (flowerType) {
            case "Roses":
                pricePerFlower = 5;
                break;
            case "Dahlias":
                pricePerFlower = 3.80;
                break;
            case "Tulips":
                pricePerFlower = 2.80;
                break;
            case "Narcissus":
                pricePerFlower = 3;
                break;
            case "Gladiolus":
                pricePerFlower = 2.50;
                break;
        }

        // Изчисляване на общата цена без отстъпки
        double totalPrice = pricePerFlower * flowerCount;

        // Проверка за наличие на отстъпки
        if (flowerType.equals("Roses") && flowerCount > 80) {
            totalPrice *= 0.90; // 10% отстъпка
        } else if (flowerType.equals("Dahlias") && flowerCount > 90) {
            totalPrice *= 0.85; // 15% отстъпка
        } else if (flowerType.equals("Tulips") && flowerCount > 80) {
            totalPrice *= 0.85; // 15% отстъпка
        } else if (flowerType.equals("Narcissus") && flowerCount < 120) {
            totalPrice *= 1.15; // 15% оскъпяване
        } else if (flowerType.equals("Gladiolus") && flowerCount < 80) {
            totalPrice *= 1.20; // 20% оскъпяване
        }

        // Проверка на бюджета
        double moneyLeft = budget - totalPrice;
        if (moneyLeft >= 0) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.%n", flowerCount, flowerType, moneyLeft);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.%n", Math.abs(moneyLeft));
        }
    }
}
