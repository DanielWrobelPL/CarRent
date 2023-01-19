import java.io.FileNotFoundException;
import java.util.Scanner;

public class AuthorizationService {
    public static boolean logInToAccount() throws FileNotFoundException {
        DataBase loadingFile = new DataBase();
        DataBase users = new DataBase();
        loadingFile.loadingFromFileAccountsAndPasswords();
        Scanner scanString = new Scanner(System.in);
        View.print("Nick: ");
        String nick = scanString.nextLine();
        View.print("Password: ");
        String userPassword = scanString.nextLine();
        int userID = users.accounts.indexOf(nick);
        AccountManager.currentUser = userID;
        if (userID >= 0){
            return users.passwords.get(userID).equals(userPassword);
        }else return false;
    }
}
