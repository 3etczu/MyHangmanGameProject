package GetWord;

import java.io.*;
import java.util.Random;

public class WorkWithFile {
    private String path;

    public WorkWithFile(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int countWordsInFile() {
        int result = -1;
        try (BufferedReader file = new BufferedReader(new FileReader(this.path))){
            String word;
            int countWords = 0;
            while ((word = file.readLine()) != null) {
                if (word.length() >= 4){countWords++;}
            }
            result = countWords;
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    public String[] createArrayOfWords(){
        int countWords = countWordsInFile();
        try (BufferedReader file = new BufferedReader(new FileReader(this.path))){
            if (countWords <= 0) throw new Exception("Ошибка чтения файла или файл пуст");
            String word;
            String[] words = new String[countWords];
            int k = 0;
            while ((word = file.readLine()) != null){
                if (word.length() >= 4){
                    words[k] = word;
                    k++;
                }
            }
            return words;
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            return new String[]{""};
        }
    }

    public String getRandomWord() {
        return createArrayOfWords()[new Random().nextInt(countWordsInFile())];
    }
}
