package GetWord;

import java.util.Scanner;

public class Game {
    public static void startGame() {
        Scanner in = new Scanner(System.in);
        System.out.println("Новая игра (Введите 'Y') /n Выйти (N)");
    }

    public static String runGame() {
        WorkWithFile word = new WorkWithFile();
        int lenWord = word.getRandomWord().length();
        Scanner inputUser = new Scanner(System.in);
        while (true){
            System.out.printf("Ваше слово из %d букв: \n", lenWord);
            System.out.printf("Слово: %-20s" + "Ошибки: %s \n", "_".repeat(lenWord), "_".repeat(5));
            System.out.print("Введите букву: ");
            String ch = inputUser.nextLine();
            while (ch.length() != 1){
                System.out.println("Вы ввели больше одной буквы или не ввели её вовсе");
                System.out.print("Введите букву: ");
                ch = inputUser.nextLine();
            }
            break;
        }
        return word.getRandomWord();
    }
}
