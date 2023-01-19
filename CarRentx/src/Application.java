import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Application {
    public final Scanner dataFromUser = new Scanner(System.in);
    private static boolean stopApplication = false;
    private void runApplication() throws FileNotFoundException {
        AccountManager accManager = new AccountManager();
        View.selectLogInOrRegister();
        String selectLogOrReg = dataFromUser.nextLine();
        if (Objects.equals(selectLogOrReg, "1")) {
            boolean LogInOrRegisterAccount = AuthorizationService.logInToAccount() || accManager.successRegister;
            while (LogInOrRegisterAccount && !stopApplication) {
                View.printMainMenu();
                String selectMenu = dataFromUser.nextLine();
                switch (selectMenu) {
                    case "1" -> View.printAvailableCars();
                    case "2"-> accManager.deleteAccount();
                    case "3" -> closeApplication();
                    default -> System.out.println(View.DEFAULT_MESSAGE);
                }
            }
        } else accManager.registerNewAccount();
    }
    public void startApplication() throws FileNotFoundException {
        DataBase loadingFile = new DataBase();
        try {
            loadingFile.loadingFromFileCarsForRent();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        runApplication();
    }
    private static void closeApplication(){
        stopApplication = true;
        DataBase save = new DataBase();
        save.saveAllData();
        View.print("Shutting Down.");
    }

}
