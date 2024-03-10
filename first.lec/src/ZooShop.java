import java.util.Scanner;

public class ZooShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double DogFood=Double.parseDouble(scanner.nextLine());
        double CatFood=Double.parseDouble(scanner.nextLine());
        double price=DogFood*2.50+CatFood*4;
        System.out.printf("%.2f lv.", price);

    }
}
