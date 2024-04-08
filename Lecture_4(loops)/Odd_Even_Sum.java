import java.util.Scanner;
public class Odd_Even_Sum {



    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();

            int evenSum = 0;
            int oddSum = 0;


            // Прочитаме числата и ги разделяме на четни и нечетни позиции
            for (int i = 1; i <= n; i++) {
                int num = scanner.nextInt();
                if (i % 2 == 0) {
                    evenSum += num;
                } else {
                    oddSum += num;
                }
            }

            // Проверка за равенство на сумите и изчисляване на разликата
            if (evenSum == oddSum) {
                System.out.println("Yes");
                System.out.println("Sum = " + evenSum);
            } else {
                int diff = Math.abs(evenSum - oddSum);
                System.out.println("No");
                System.out.println("Diff = " + diff);
            }

            scanner.close();
    }
}


