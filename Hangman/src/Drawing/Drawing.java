package Drawing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ListIterator;

public class Drawing {
    private final String path = "src/Game/words.txt";
    public String getPath() { return path; }

    public static void readFile(String buildError) {
        try(BufferedReader br = new BufferedReader(new FileReader("src/Drawing/Hangman.txt"))) {
            String line;
            int[] endPoint = new int[]{7, 15, 23, 31, 39};
            int countError = buildError.length();
            int k = (countError != 0)? endPoint[countError - 1] + 1 : 0;
                for (int i = 0; i < endPoint[countError]; i++){
                    line = br.readLine();
                    if (countError > 0 && k == i){
                        System.out.println(line);
                    } else {
                        System.out.println(line);
                    }
                }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

//        while ((line = br.readLine()) != null)
//        {
//            if (k < 7) {
//                System.out.println(line);
//                k++;
//            } else if (k < endPoint[length]) {
//                System.out.println(line);
//                k++;
//            } else {
//                k++;
//            }
    }
}
