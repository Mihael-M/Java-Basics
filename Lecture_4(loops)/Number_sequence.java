import java.util.Scanner;
public class Number_sequence {



    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            // Прочитаме въведените числа и намираме максималното и минималното

            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }

            // Отпечатваме най-голямото и най-малкото число
            System.out.println(max);
            System.out.println(min);

            scanner.close();
    }
}


