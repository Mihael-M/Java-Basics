
import java.util.Scanner;

public class CalculatorDeposits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum=Double.parseDouble(scanner.nextLine());
        int limitTime=Integer.parseInt(scanner.nextLine());
        double yearPro=Double.parseDouble(scanner.nextLine());
        double res=sum+limitTime*((sum*(yearPro)/100)/12);
        System.out.println(res);


    }
}
