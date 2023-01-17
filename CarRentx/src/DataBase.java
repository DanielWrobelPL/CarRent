import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class DataBase {
    public static final LinkedList<String> mainMenu = new LinkedList<>();
    public static final LinkedList <String> carsForRent = new LinkedList<>();
    public static final LinkedList<String> accounts = new LinkedList<>();
    public static final LinkedList<String> passwords = new LinkedList<>();
    public static final String MAIN_MENU_PATH = "src/resources/mainMenu.txt";
    public static final String CARS_FOR_RENT_PATH = "src/resources/carsForRent.txt";
    public static final String ACCOUNTS_PATH = "src/resources/accounts.txt";
    public static final String PASSWORDS_PATH = "src/resources/passwords.txt";
    public static void loadingFromFiles() throws FileNotFoundException {
        Scanner mainMenuScan = new Scanner(new File(MAIN_MENU_PATH));
        Scanner carsForRentScan = new Scanner(new File(CARS_FOR_RENT_PATH));
        Scanner accountsScan = new Scanner(new File(ACCOUNTS_PATH));
        Scanner passwordsScan = new Scanner(new File(PASSWORDS_PATH));
        while (carsForRentScan.hasNext()){
            carsForRent.add(carsForRentScan.nextLine());
        }
        while (mainMenuScan.hasNext()){
            mainMenu.add(mainMenuScan.nextLine());
        }
        while (accountsScan.hasNext()){
            accounts.add(accountsScan.nextLine());
        }
        while (passwordsScan.hasNext()){
            passwords.add(accountsScan.nextLine());
        }
    }
    private static void save() throws FileNotFoundException {
        PrintWriter saveMainMenu = new PrintWriter(MAIN_MENU_PATH);
        PrintWriter saveCarsForRent = new PrintWriter(CARS_FOR_RENT_PATH);
        PrintWriter saveAccounts = new PrintWriter(ACCOUNTS_PATH);
        PrintWriter savePasswords = new PrintWriter(PASSWORDS_PATH);
        for (String menu : mainMenu) {
            saveMainMenu.println(menu);
        }
        for (String s : carsForRent) {
            saveCarsForRent.println(s);
        }
        for (String account : accounts) {
            saveAccounts.println(account);
        }
        for (String password : passwords) {
            saveAccounts.println(password);
        }
        saveMainMenu.close();
        saveCarsForRent.close();
        saveAccounts.close();
        savePasswords.close();
    }
    public static void saveData() {
        try {
            save();
        } catch (FileNotFoundException ex) {
            View.print("Error during saving initiated data\n" + ex.getMessage());
        }
    }
}
