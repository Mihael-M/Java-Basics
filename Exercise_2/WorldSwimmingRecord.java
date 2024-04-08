import java.util.Scanner;
public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record=Double.parseDouble(scanner.nextLine());
        double length=Double.parseDouble(scanner.nextLine());
        double seconds=Double.parseDouble(scanner.nextLine());
        double sec=length*seconds;

        double res=Math.floor(length/15)*12.5;

        double ivanTime=sec+res;
        if(sec>record)
        {
            double timeDifference = ivanTime - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.",timeDifference);
        }
        else{
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",sec);
        }

    }
}
