import java.util.Scanner;
public class Aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenght=Integer.parseInt(scanner.nextLine());
        int wide=Integer.parseInt(scanner.nextLine());
        int height=Integer.parseInt(scanner.nextLine());
        double procent=Double.parseDouble(scanner.nextLine());
        double capacity=lenght*wide*height;
        double capacityInLiters=capacity/1000;
        double needed=capacityInLiters*(1-(procent/100));
        System.out.println(needed);

    }


}
