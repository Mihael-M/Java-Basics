import java.util.Scanner;

public class GreenArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double size;
        do {
             size=Double.parseDouble(scanner.nextLine());

        }while(size>0 && size<100000);

        double price=size*7.61;
        double discountPrice=price*0.18;
        double finalPrice= price-discountPrice;
        System.out.printf("The final price is: %f lv.",finalPrice);
        System.out.printf("The discount is: %f lv.",discountPrice);



    }
}
