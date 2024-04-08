import java.util.Scanner;
public class BasketballEQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearTax=Integer.parseInt(scanner.nextLine());
        double sneakers=yearTax-(yearTax*0.4);
        double ekip=sneakers-(sneakers*0.2);
        double ball=ekip/4;
        double acesories=ball/5;
        System.out.println(sneakers+ekip+ball+acesories+yearTax);

    }
}
