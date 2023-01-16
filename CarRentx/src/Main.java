import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        startApplication();
    }
    private static void startApplication(){
        try {
            DataBase.loadingFromFiles();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ApplicationLoop.applicationLoop();
    }
}