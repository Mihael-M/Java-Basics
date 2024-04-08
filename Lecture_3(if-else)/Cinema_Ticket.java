import java.util.Scanner;

public class Cinema_Ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String dayOfWeek = scanner.nextLine().toLowerCase();


        int ticketPrice;
        switch (dayOfWeek) {
            case "monday":
            case "tuesday":
            case "friday":
                ticketPrice = 12;
                break;
            case "wednesday":
            case "thursday":
                ticketPrice = 14;
                break;
            case "saturday":
            case "sunday":
                ticketPrice = 16;
                break;
            default:
                System.out.println("Невалиден ден от седмицата.");
                return;
        }

        // Отпечатване на цената на билета
        System.out.println(ticketPrice);
    }
}
