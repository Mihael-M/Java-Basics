import java.util.Scanner;

public class Invalid_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на цяло число

        int number = scanner.nextInt();

        // Проверка дали числото е валидно
        if ((number >= 100 && number <= 200) || number == 0) {
            System.out.println("");
        } else {
            System.out.println("invalid");
        }
    }
}