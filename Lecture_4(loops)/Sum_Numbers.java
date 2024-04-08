import java.util.Scanner;
public class Sum_Numbers {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();

            int sum = 0;


            // Прочитаме и сумираме въведените числа
            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                sum += num;
            }

            System.out.println(sum);

            scanner.close();
    }
}



