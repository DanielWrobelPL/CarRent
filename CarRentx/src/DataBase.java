import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class DataBase {
    public static final LinkedList <String> carsForRent = new LinkedList<>();
    public static final String CARS_FOR_RENT = "src/resources/carsForRent.txt";
    public static void loadingFromFiles() throws FileNotFoundException {
        Scanner carsForRentScan = new Scanner(new File(CARS_FOR_RENT));
        while (carsForRentScan.hasNext()){
            carsForRent.add(carsForRentScan.nextLine());
        }
    }
}
