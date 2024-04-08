import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        double Inches=Double.parseDouble(scanner.nextLine());
        double cm=Inches * 2.54;
        System.out.println(cm);


    }
}