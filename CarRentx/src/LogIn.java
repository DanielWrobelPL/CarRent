import java.util.Scanner;

public class LogIn {
    public static boolean LogInToAccount(){
        View.print("Select your account number: ");
        View.viewAllAccounts();
        Scanner scanString = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);
        int selectedAccount = scanInt.nextInt() - 1;
        View.print("Hello" + DataBase.accounts.get(selectedAccount) + "." + "\n Enter your password: ");
        String userPassword = scanString.nextLine();
        return DataBase.passwords.get(selectedAccount).equals(userPassword);
    }
}
