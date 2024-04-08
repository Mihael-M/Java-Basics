import java.util.Scanner;
public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double points;
        if(num<=100)
        {
           points=5;
        }
        else if(num>1000)
        {
            points=num*0.1;
        }
        else {
            points=num*0.2;
        }
        if(num%2==0)
        {
            points++;
        }
        else if(num%10==5)
        {
            points+=2;
        }
        System.out.println(points);
        System.out.println(points+num);

    }
}
