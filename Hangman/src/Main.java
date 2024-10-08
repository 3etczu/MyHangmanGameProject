import GetWord.WorkWithFile;

public class Main {
    public static void main(String[] args) {
        WorkWithFile file1 = new WorkWithFile("src/GetWord/words.txt");
        System.out.println(file1.getRandomWord());
    }
}