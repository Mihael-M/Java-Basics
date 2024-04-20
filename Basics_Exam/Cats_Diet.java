import java.util.Scanner;
public class Cats_Diet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatPercentage = Integer.parseInt(scanner.nextLine());
        int proteinPercentage = Integer.parseInt(scanner.nextLine());
        int carbPercentage = Integer.parseInt(scanner.nextLine());
        int totalCalories = Integer.parseInt(scanner.nextLine());
        int waterPercentage = Integer.parseInt(scanner.nextLine());


        double fatGrams = ((fatPercentage / 100.0) * totalCalories) / 9;
        double proteinGrams = ((proteinPercentage / 100.0) * totalCalories) / 4;
        double carbGrams = ((carbPercentage / 100.0) * totalCalories) / 4;

        double totalWeight = fatGrams + proteinGrams + carbGrams;
        double caloriesPerGram = totalCalories / totalWeight;
        double perWeight = 100 - waterPercentage;
        double result = (perWeight / 100.0) * caloriesPerGram;



        System.out.printf("%.4f", result);
    }
}

