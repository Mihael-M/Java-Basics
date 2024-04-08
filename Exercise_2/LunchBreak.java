import java.util.Scanner;
public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name= scanner.nextLine();
        int time=Integer.parseInt(scanner.nextLine());
        int breakTime=Integer.parseInt(scanner.nextLine());
        double lunch=  breakTime / 8.0;

        double breath= breakTime / 4.0;

        double timeLeft =  breakTime - lunch - breath;



        if(timeLeft>=time)
        {
            int left = (int) Math.ceil (timeLeft - time);
            System.out.printf("You have enough time to watch %s and left with %d minutes free time.",name,-1*left);

        }
        else {
            int left = (int) Math.ceil (time - timeLeft);
            System.out.printf("You don't have enough time to watch %s, you need %d more minutes.",name,left);
        }

    }
}
