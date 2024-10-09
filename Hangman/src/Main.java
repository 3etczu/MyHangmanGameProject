import GetWord.Game;
import GetWord.WorkWithFile;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        WorkWithFile file1 = new WorkWithFile();
        System.out.println ("Новая игра?('Y')\nВыйти.('N')");
        while (true){
            Scanner in = new Scanner(System.in);
            String line = in.nextLine();
            if (line.equals("Y")){
                Game.runGame();
                System.exit ( 0 );
            }
            else if (line.equals("N")){
                System.exit ( 0 );
            }
            else {
                System.out.println("Введена неверная команда. Введите Y или N для продолжения");
            }
        }
    }
}