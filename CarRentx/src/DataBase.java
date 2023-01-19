import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DataBase {
    public final ArrayList<String> carsForRent = new ArrayList<>();
    public final ArrayList<String> accounts = new ArrayList<>();
    public final ArrayList<String> passwords = new ArrayList<>();
    public final String CARS_FOR_RENT_PATH = "src/resources/carsForRent.txt";
    public final String ACCOUNTS_PATH = "src/resources/users.txt";
    public final String PASSWORDS_PATH = "src/resources/passwords.txt";
    public void loadingFromFileCarsForRent() throws FileNotFoundException {
        Scanner carsForRentScan = new Scanner(new File(CARS_FOR_RENT_PATH));
        while (carsForRentScan.hasNext()) {
            carsForRent.add(carsForRentScan.nextLine());
        }
    }
    public void loadingFromFileAccountsAndPasswords() throws FileNotFoundException {
        Scanner accountsScan = new Scanner(new File(ACCOUNTS_PATH));
        Scanner passwordsScan = new Scanner(new File(PASSWORDS_PATH));
        while (accountsScan.hasNext()) {
            accounts.add(accountsScan.nextLine());
            passwords.add(passwordsScan.nextLine());
        }
    }
    public void saveCarsForRent() throws FileNotFoundException {
        PrintWriter saveCarsForRent = new PrintWriter(CARS_FOR_RENT_PATH);
        for (String s : carsForRent) {
            saveCarsForRent.println(s);
        }
        saveCarsForRent.close();
    }
    public void saveAccounts() throws FileNotFoundException {
        PrintWriter saveAccounts = new PrintWriter(ACCOUNTS_PATH);
        for (String account : accounts) {
            saveAccounts.println(account);
        }
        saveAccounts.close();
    }
    public void savePasswords() throws FileNotFoundException {
        PrintWriter savePasswords = new PrintWriter(PASSWORDS_PATH);
        for (String password : passwords) {
            savePasswords.println(password);
        }
        savePasswords.close();
    }
    public void saveAllData() {
        try {
            saveCarsForRent();
            saveAccounts();
            savePasswords();
        } catch (FileNotFoundException ex) {
            View.print("Error during saving initiated data\n" + ex.getMessage());
        }
    }
}
