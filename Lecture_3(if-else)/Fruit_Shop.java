import java.util.Scanner;

public class Fruit_Shop {
    public static void main(String[] args) {
        // Цени на плодовете през работните дни
        double[] weekdayPrices = {2.50, 1.20, 0.85, 1.45, 2.70, 5.50, 3.85};

        // Цени на плодовете през събота и неделя
        double[] weekendPrices = {2.70, 1.25, 0.90, 1.60, 3.00, 5.60, 4.20};

        Scanner scanner = new Scanner(System.in);

        // Въвеждане на плод, ден от седмицата и количество

        String fruit = scanner.nextLine().toLowerCase();


        String dayOfWeek = scanner.nextLine().toLowerCase();


        double quantity = scanner.nextDouble();

        // Инициализиране на цената на плода
        double price = 0;

        // Проверка за валидност на деня от седмицата и името на плода
        boolean isValidDay = dayOfWeek.equals("monday") || dayOfWeek.equals("tuesday") ||
                dayOfWeek.equals("wednesday") || dayOfWeek.equals("thursday") ||
                dayOfWeek.equals("friday") || dayOfWeek.equals("saturday") ||
                dayOfWeek.equals("sunday");

        boolean isValidFruit = fruit.equals("banana") || fruit.equals("apple") ||
                fruit.equals("orange") || fruit.equals("grapefruit") ||
                fruit.equals("kiwi") || fruit.equals("pineapple") ||
                fruit.equals("grapes");

        // Проверка за валидност и изчисляване на цената
        if (isValidDay && isValidFruit) {
            int dayIndex = getDayIndex(dayOfWeek);
            int fruitIndex = getFruitIndex(fruit);

            // Избор на цена в зависимост от деня от седмицата
            if (dayOfWeek.equals("saturday") || dayOfWeek.equals("sunday")) {
                price = weekendPrices[fruitIndex];
            } else {
                price = weekdayPrices[fruitIndex];
            }

            // Изчисляване на общата цена
            double totalPrice = price * quantity;
            System.out.printf("%.2f",totalPrice);
        } else {
            System.out.println("error");
        }
    }

    // Метод за намиране на индекса на деня от седмицата
    public static int getDayIndex(String day) {
        switch (day) {
            case "monday":
                return 0;
            case "tuesday":
                return 1;
            case "wednesday":
                return 2;
            case "thursday":
                return 3;
            case "friday":
                return 4;
            case "saturday":
                return 5;
            case "sunday":
                return 6;
            default:
                return -1;
        }
    }

    // Метод за намиране на индекса на плода
    public static int getFruitIndex(String fruit) {
        switch (fruit) {
            case "banana":
                return 0;
            case "apple":
                return 1;
            case "orange":
                return 2;
            case "grapefruit":
                return 3;
            case "kiwi":
                return 4;
            case "pineapple":
                return 5;
            case "grapes":
                return 6;
            default:
                return -1;
        }
    }
}
