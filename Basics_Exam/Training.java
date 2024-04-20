import java.util.Scanner;

public class Training {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double firstDayDistance = Double.parseDouble(scanner.nextLine());

        double totalDistance = firstDayDistance;
        for (int i = 0; i < days; i++) {
            int increasePercentage = Integer.parseInt(scanner.nextLine());
            firstDayDistance = firstDayDistance +  (increasePercentage / 100.0) * firstDayDistance;;
            totalDistance += firstDayDistance;
        }

        if (totalDistance >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(totalDistance - 1000));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers",  Math.ceil(1000 - totalDistance));
        }
    }
}
