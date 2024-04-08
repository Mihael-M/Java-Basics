import java.util.Scanner;
public class Character_Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // Принтиране на всеки символ на нов ред
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }

        scanner.close();
    }
}


