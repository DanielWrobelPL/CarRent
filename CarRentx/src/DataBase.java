import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class DataBase {
    public static final LinkedList<String> mainMenu = new LinkedList<>();
    public static final LinkedList <String> carsForRent = new LinkedList<>();
    public static final String MAIN_MENU_PATH = "src/resources/mainMenu.txt";
    public static final String CARS_FOR_RENT_PATH = "src/resources/carsForRent.txt";
    public static void loadingFromFiles() throws FileNotFoundException {
        Scanner mainMenuScan = new Scanner(new File(MAIN_MENU_PATH));
        Scanner carsForRentScan = new Scanner(new File(CARS_FOR_RENT_PATH));
        while (carsForRentScan.hasNext()){
            carsForRent.add(carsForRentScan.nextLine());
        }
        while (mainMenuScan.hasNext()){
            mainMenu.add(mainMenuScan.nextLine());
        }
    }
}
