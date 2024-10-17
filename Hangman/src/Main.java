import Game.Game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println ("Новая игра?('Y')\nВыйти.('N')");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        boolean flag = true;
        while (flag) {
            if (line.equals("Y")) {
                Game.runGame();
                System.out.println("Начать новую игру?(Y/N)");
                flag = newGame(in);
            } else if (line.equals("N")){
                System.exit ( 0 );
            } else {
                System.out.println("Введена неверная команда. Введите Y или N для продолжения");
                line = in.nextLine();
            }
        }
    }

    public static boolean newGame(Scanner in) {
        String lineExit;
        while (true) {
            lineExit = in.nextLine();
            if (lineExit.equals("Y")) {
                return true;
            } else if (lineExit.equals("N")) {
                return false;
            } else {
                System.out.println("Введена неверная команда. Введите Y или N для продолжения");
            }
        }
    }
}