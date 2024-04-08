import java.util.Scanner;

public class Numbers_Nto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        // Проверка дали числото е по-голямо от 1
        if (n > 1) {
            // Използваме цикъл, който ще отпечата числата от n до 1 в обратен ред
            for (int i = n; i >= 1; i--) {
                System.out.println(i);
            }
        } else {
            System.out.println(1);
        }

        scanner.close();
    }
}
