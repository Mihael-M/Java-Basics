import java.util.Scanner;
public class Vowels_Sum {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String text = scanner.nextLine();

            // Променлива, в която ще натрупваме сумата от стойностите на гласните букви
            int sum = 0;

            // Прохождаме през всеки символ от текста
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                // Проверка дали текущия символ е гласна буква и добавяме нейната стойност към сумата
                switch (ch) {
                    case 'a':
                        sum += 1;
                        break;
                    case 'e':
                        sum += 2;
                        break;
                    case 'i':
                        sum += 3;
                        break;
                    case 'o':
                        sum += 4;
                        break;
                    case 'u':
                        sum += 5;
                        break;
                    // Ако символът не е гласна буква, преминаваме към следващия
                    default:
                        break;
                }
            }

            // Отпечатваме сумата
            System.out.println(sum);

            scanner.close();
        }
    }


