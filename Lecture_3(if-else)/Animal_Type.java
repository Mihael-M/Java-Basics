import java.util.Scanner;

public class Animal_Type {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animalName = scanner.nextLine().toLowerCase();

        String animalClass;

        switch (animalName) {
            case "dog":
                animalClass = "mammal";
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                animalClass = "reptile";
                break;
            default:
                animalClass = "unknown";
                break;
        }

        System.out.println(animalClass);
    }
}
