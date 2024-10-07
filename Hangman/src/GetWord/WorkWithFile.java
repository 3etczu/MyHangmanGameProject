package GetWord;

import java.io.*;

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
            while((word = file.readLine())!=null) {
                countWords++;
            }
            result = countWords;
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    public void createArrayOfWords(){
        int countWords = countWordsInFile();
        try (BufferedReader file = new BufferedReader(new FileReader(this.path))){
            if (countWords <= 0) throw new Exception("Ошибка чтения файла или файл пуст");
            String[] words = new String[countWords];
            for (int i = 0; i < countWords; i++) {
                words[i] = file.readLine();
            }
            for (int i = 0; i < countWords; i++) {
                System.out.println(words[i]);
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
