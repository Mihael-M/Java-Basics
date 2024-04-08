import java.util.Scanner;

public class Small_Shop {
    public static void main(String[] args) {
        // Дефиниране на цените на продуктите в различните градове
        double[][] prices = {
                {0.50, 0.80, 1.20, 1.45, 1.60}, // Цени в София
                {0.40, 0.70, 1.15, 1.30, 1.50}, // Цени в Пловдив
                {0.45, 0.70, 1.10, 1.35, 1.55}  // Цени във Варна
        };

        // Инициализация на скенер за вход от потребителя
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на продукт, град и количество от потребителя

        String product = scanner.nextLine().toLowerCase();

        String city = scanner.nextLine().toLowerCase();

        double quantity = scanner.nextDouble();

        // Извличане на цената на продукта в съответния град
        double price = 0.0;
        int cityIndex = -1;

        switch (city) {
            case "sofia":
                cityIndex = 0;
                break;
            case "plovdiv":
                cityIndex = 1;
                break;
            case "varna":
                cityIndex = 2;
                break;
            default:
                System.out.println("Грешен град.");
                return;
        }

        // Извличане на цената на продукта от матрицата на цените
        switch (product) {
            case "coffee":
                price = prices[cityIndex][0];
                break;
            case "water":
                price = prices[cityIndex][1];
                break;
            case "beer":
                price = prices[cityIndex][2];
                break;
            case "sweets":
                price = prices[cityIndex][3];
                break;
            case "peanuts":
                price = prices[cityIndex][4];
                break;
            default:
                System.out.println("Грешен продукт.");
                return;
        }

        // Пресмятане на общата цена и отпечатване на резултата
        double totalPrice = quantity * price;
        System.out.printf("%.2f", totalPrice);
    }
}
