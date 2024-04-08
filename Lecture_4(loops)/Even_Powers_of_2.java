import java.util.Scanner;
public class Even_Powers_of_2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();

            // Пресмятаме четните степени на 2
            for (int i = 0; i <= n; i+=2) {
                int result = (int) Math.pow(2, i);
                System.out.println(result);
            }

            scanner.close();
        }
    }


