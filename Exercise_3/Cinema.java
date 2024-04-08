import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String projectionType = scanner.nextLine().toLowerCase();


        int rows = Integer.parseInt(scanner.nextLine());


        int columns = Integer.parseInt(scanner.nextLine());


        double totalRevenue = calculateTotalRevenue(projectionType, rows, columns);


        System.out.printf("%.2f leva", totalRevenue);
    }

    // Метод за изчисляване на общите приходи
    public static double calculateTotalRevenue(String projectionType, int rows, int columns) {
        double ticketPrice;
        switch (projectionType) {
            case "premiere":
                ticketPrice = 12.00;
                break;
            case "normal":
                ticketPrice = 7.50;
                break;
            case "discount":
                ticketPrice = 5.00;
                break;
            default:
                System.out.println("Невалиден тип на прожекция.");
                return 0.0;
        }

        int totalSeats = rows * columns;
        double totalRevenue = totalSeats * ticketPrice;
        return totalRevenue;
    }
}
