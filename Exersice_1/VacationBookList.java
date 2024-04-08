
import java.util.Scanner;
public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages=Integer.parseInt(scanner.nextLine());
        int pagesRead=Integer.parseInt(scanner.nextLine());
        int days=Integer.parseInt(scanner.nextLine());
        int read=(pages/pagesRead)/days;
        System.out.println(read);
    }
}
