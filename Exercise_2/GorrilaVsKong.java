import java.util.Scanner;
public class GorrilaVsKong {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        int numSt=Integer.parseInt(scanner.nextLine());
        double priceClothes=Double.parseDouble(scanner.nextLine());
        double dec=budget*0.10;
        if(numSt>150)
        {
            priceClothes-=priceClothes*0.10;
        }
        double sumClothes=numSt*priceClothes;
        double left=budget-(sumClothes+dec);

        if(budget<dec+sumClothes)
        {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",-1*left);
        }
        else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",left);
        }
    }
}
