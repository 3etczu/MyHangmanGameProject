package Game;

import Drawing.Drawing;
import java.util.Scanner;

public class Game {

//    public static void startGame() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Новая игра (Введите 'Y') /n Выйти (N)");
//    }

    public static void printText(int lenWord, StringBuilder buildStr, StringBuilder buildErrorStr){
        System.out.printf("Ваше слово из %d букв: \n", lenWord);
        System.out.printf("Слово: %-20s" + "Ошибки: %s \n", buildStr, buildErrorStr);
        System.out.print("Введите букву: ");
    }

    public static void runGame() {
        WorkWithFile word = new WorkWithFile();
        String unknownWord = word.getRandomWord();
        int lenWord = unknownWord.length();
        StringBuilder buildStr = new StringBuilder("_".repeat(lenWord));
        StringBuilder buildErrorStr = new StringBuilder();
        System.out.println(unknownWord);
        Scanner inputUser = new Scanner(System.in);
        Drawing.readFile(buildErrorStr.toString());
        printText(lenWord, buildStr, buildErrorStr);
        boolean ker = true;
        while (ker){
            String letter = inputUser.nextLine();
            int k = 0;
            while (letter.length() != 1){
                System.out.println("Вы ввели больше одной буквы или не ввели её вовсе");
                System.out.print("Введите букву: ");
                letter = inputUser.nextLine();
            }
            for (int i = 0; i < lenWord; i++){
                if (letter.charAt(0) == unknownWord.charAt(i)) {
                    buildStr.setCharAt(i, letter.charAt(0));
                    k++;
                }
            }

            if (k == 0) {
                buildErrorStr.append(letter.charAt(0));
            }

            if (buildStr.toString().equals(unknownWord)){
                ker = false;
                System.out.printf("Поздравляем! Вы выиграли!\nЗагаданное слово: %s \n",buildStr.toString());
            } else if (buildErrorStr.toString().length() > 4) {
                ker = false;
                System.out.printf("Вы проиграли!\nЗагаданное слово: %s \n", unknownWord);
            }
            else {
                Drawing.readFile(buildErrorStr.toString());
                printText(lenWord, buildStr, buildErrorStr);
            }
        }
    }
}
