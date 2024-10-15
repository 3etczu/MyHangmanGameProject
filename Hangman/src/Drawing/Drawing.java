package Drawing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Drawing {
    private final String path = "src/Game/words.txt";
    public String getPath() { return path; }

    public static void readFile() {
        try(BufferedReader br = new BufferedReader(new FileReader("src/Drawing/Hangman.txt"))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null)
            {
                if (i < 7)
                {
                    System.out.println(line);
                    i++;
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
