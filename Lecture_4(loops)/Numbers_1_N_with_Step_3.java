import java.util.Scanner;

public class Numbers_1_N_with_Step_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        // Проверка дали числото е по-голямо от 1
        if (n >= 1) {
            // Използваме цикъл, който отпечатва числата от 1 до n със стъпка 3
            for (int i = 1; i <= n; i += 3) {
                System.out.println(i);
            }
        } else {
            System.out.println(1);
        }

        scanner.close();
    }
}
