import java.util.Scanner;
public class TimePlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours=Integer.parseInt(scanner.nextLine());
        int minutes=Integer.parseInt(scanner.nextLine());
        int min=minutes+15;
        if(min>59)
        {
            hours++;
            min-=60;
            if(hours>23)
            {
                hours-=24;
            }
            if(min<10)
            {
                System.out.printf("%d:0%d",hours,min);
            }
            else{
                System.out.printf("%d:%d",hours,min);
            }


        }
        else if(min<10)
        {
            System.out.printf("%d:0%d",hours,min);
        }
        else{
            System.out.printf("%d:%d",hours,min);
        }

    }
}
