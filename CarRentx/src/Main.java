import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        startApplication();
    }
    private static void startApplication(){
        try {
            DataBase.loadingFromFiles();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Menu.mainMenu();
    }
}