import java.io.FileNotFoundException;
import java.util.Scanner;

public class AccountManager {
    public static int currentUser;
    public boolean successRegister = false;
    public void registerNewAccount() throws FileNotFoundException {
        DataBase addNewUser = new DataBase();
        DataBase addPassword = new DataBase();
        DataBase save = new DataBase();
        Scanner scanString = new Scanner(System.in);
        while (!successRegister) {
            View.print("Enter nickname: ");
            String newNickname = scanString.nextLine();
            View.print("Enter password:");
            String firstPassword = scanString.nextLine();
            View.print("Repeat password: ");
            String secondPassword = scanString.nextLine();
            if (firstPassword.equals(secondPassword)) {
                addNewUser.accounts.add(newNickname);
                addPassword.passwords.add(firstPassword);
                successRegister = true;
                View.print("Your account has been successfully registered!");
            } else View.print("Your passwords are not the same.");
        }
        save.saveAccounts();
        save.savePasswords();
    }
    public void deleteAccount() throws FileNotFoundException {
        DataBase deleteUser = new DataBase();
        DataBase save = new DataBase();
        Scanner scanString = new Scanner(System.in);
        View.print("Password: ");
        String password = scanString.nextLine();
        if (deleteUser.passwords.get(currentUser).equals(password)){
            deleteUser.accounts.remove(currentUser);
            deleteUser.passwords.remove(currentUser);
        }else View.print("Wrong password, please enter the correct password.");
    save.saveAccounts();
    save.savePasswords();
    }
}
