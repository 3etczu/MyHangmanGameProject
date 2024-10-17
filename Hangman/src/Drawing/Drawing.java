package Drawing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Drawing {

    public static void readFile(String buildError) {
        try(BufferedReader br = new BufferedReader(new FileReader("src/Drawing/Hangman.txt"))) {
            ArrayList<String> lineInFile= new ArrayList<>();
            int[] endPoint = new int[]{7, 15, 23, 31, 39};
            int countError = buildError.length();
            int k = (countError != 0)? endPoint[countError - 1] + 1 : 0;
            for (int i = 0; i < 39; i++) {
                lineInFile.add(br.readLine());
            }
            if (countError == 0) {
                for (String l: lineInFile.subList(0, endPoint[countError])){
                    System.out.println(l);
                }
            }
            else {
                for (String l: lineInFile.subList(k, endPoint[countError])){
                    System.out.println(l);
                }
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
