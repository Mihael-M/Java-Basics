import java.util.Scanner;
public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nailon=Integer.parseInt(scanner.nextLine());
        int paint=Integer.parseInt(scanner.nextLine());
        int paintdes=Integer.parseInt(scanner.nextLine());
        int hours=Integer.parseInt(scanner.nextLine());
        double sum=((nailon+2)*1.50)+((paint+(paint*0.1))*14.50)+(paintdes*5)+0.40;
        double finalsum=((sum*0.30)*hours)+sum;
        System.out.println(finalsum);




    }
}
