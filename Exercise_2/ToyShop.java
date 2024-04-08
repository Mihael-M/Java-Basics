import java.util.Scanner;
public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceEx=Double.parseDouble(scanner.nextLine());
        int puzzles=Integer.parseInt(scanner.nextLine());
        int dolls=Integer.parseInt(scanner.nextLine());
        int bears=Integer.parseInt(scanner.nextLine());
        int minions=Integer.parseInt(scanner.nextLine());
        int trucks=Integer.parseInt(scanner.nextLine());
        int ordered=puzzles+dolls+bears+minions+trucks;
        double sum=puzzles*2.60+dolls*3+bears*4.10+minions*8.20+trucks*2;
        if(ordered>=50)
        {
            sum-=sum*0.25;
        }
        sum-=sum*0.1;
        double left=sum-priceEx;
        if(sum>=priceEx)
        {
            System.out.printf("Yes! %.2f lv left.",left);
        }
        else {
            System.out.printf("Not enough money! %.2f lv needed.",-1*left);
        }

    }
}
