import java.util.Scanner;
import java.lang.Math;
public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure= scanner.nextLine();
        if(figure.equals("square"))
        {
            double side = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f",side*side);
        }
        else if(figure.equals("rectangle"))
        {
            double sideOne = Double.parseDouble(scanner.nextLine());
            double sideTwo = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f",sideOne*sideTwo);
        }
        else if(figure.equals("circle"))
        {
            double r = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", Math.PI*r*r);
        }
        else {
            double side = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f",(side*height)/2);
        }

    }
}
