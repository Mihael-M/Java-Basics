import java.util.Scanner;
public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int cards=Integer.parseInt(scanner.nextLine());
        int processors=Integer.parseInt(scanner.nextLine());
        int ram=Integer.parseInt(scanner.nextLine());
        double sumCards=cards*250;
        double processorPrice=sumCards*0.35;
        double sumProcessors=processorPrice*processors;
        double ramPrice=sumCards*0.10;
        double sumRam=ram*ramPrice;
        double sum=sumRam+sumProcessors+sumCards;

        if(cards>processors)
        {
            sum-=sum*0.15;
        }
        double left=budget-sum;
        if(sum>budget)
        {
            System.out.printf("Not enough money! You need %.2f leva more!",-1*left);
        }
        else
        {
            System.out.printf("You have %.2f leva left!",left);
        }


    }
}
