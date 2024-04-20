import java.util.Scanner;
public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bestPlayer = "";
        int maxGoals = 0;
        boolean isHatTrick = false;

        while (true) {
            String playerName = scanner.nextLine();
            if (playerName.equals("END")) {
                break;
            }
            int goals = Integer.parseInt(scanner.nextLine());

            if (goals > maxGoals) {
                bestPlayer = playerName;
                maxGoals = goals;
                isHatTrick = goals >= 3;
            }

            if (goals >= 10) {
                break;
            }
        }

        System.out.printf("%s is the best player!%n", bestPlayer);
        if (isHatTrick) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.%n", maxGoals);
        }
    }
}
