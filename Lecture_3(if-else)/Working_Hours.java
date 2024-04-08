import java.util.Scanner;

public class Working_Hours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int hour = scanner.nextInt();
        scanner.nextLine(); // Изчистване на новия ред


        String dayOfWeek = scanner.nextLine().toLowerCase();


        boolean isOpen = (hour >= 10 && hour <= 18) &&
                (!dayOfWeek.equals("sunday") && !dayOfWeek.equals("неделя"));

        if (isOpen) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
