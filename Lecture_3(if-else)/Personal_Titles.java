import java.util.Scanner;

public class Personal_Titles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        scanner.nextLine(); // Изчиства буфера след nextInt()


        String gender = scanner.nextLine();

        String title;

        if (gender.equals("m")) {
            title = (age >= 16) ? "Mr." : "Master";
        } else if (gender.equals("f")) {
            title = (age >= 16) ? "Ms." : "Miss";
        } else {
            title = "Error: Невалиден пол";
        }

        System.out.println( title);
    }
}
