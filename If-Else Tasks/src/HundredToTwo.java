
import java.util.Scanner;
public class HundredToTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if(num<100)
        {
            System.out.println("Less than 100");
        }
        else if(num>200)
        {
            System.out.println("Greater than 200");
        }
        else {
            System.out.println("Between 100 and 200");
        }

    }
}
