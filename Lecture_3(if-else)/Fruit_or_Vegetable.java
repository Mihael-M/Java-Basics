import java.util.Scanner;

public class Fruit_or_Vegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String productName = scanner.nextLine().toLowerCase();


        String category;
        switch (productName) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                category = "fruit";
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                category = "vegetable";
                break;
            default:
                category = "unknown";
                break;
        }

        // Отпечатване на категорията на продукта
        System.out.println( category);
    }
}
