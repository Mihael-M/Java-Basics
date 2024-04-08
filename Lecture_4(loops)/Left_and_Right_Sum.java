import java.util.Scanner;
public class Left_and_Right_Sum {



    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();

            int leftSum = 0;
            int rightSum = 0;


            // Прочитаме числата и ги разделяме на лява и дясна сума
            for (int i = 0; i < 2 * n; i++) {
                int num = scanner.nextInt();
                if (i < n) {
                    leftSum += num;
                } else {
                    rightSum += num;
                }
            }

            // Проверка за равенство на сумите и изчисляване на разликата
        if (leftSum == rightSum) {
            System.out.println("Yes, sum = " + leftSum);
        } else {
            int diff = Math.abs(leftSum - rightSum);
            System.out.println("No, diff = " + diff);
        }

            scanner.close();
    }
}


