
import java.util.Scanner;
 class SchoolSuplies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens=Integer.parseInt(scanner.nextLine());
        int markers=Integer.parseInt(scanner.nextLine());
        int liters=Integer.parseInt(scanner.nextLine());
        int discount=Integer.parseInt(scanner.nextLine());
        double pay=(pens*5.80)+(markers*7.20)+(liters*1.20);
        double withdisc=pay-(pay*0.25);
        System.out.println(withdisc);
    }
}
