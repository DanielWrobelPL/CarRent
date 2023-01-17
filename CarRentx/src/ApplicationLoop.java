import java.util.Scanner;

public class ApplicationLoop {
    public static final Scanner dataFromUser = new Scanner(System.in);

    public static void applicationLoop(){
        boolean stopApplication = false;
        while (!stopApplication) {
            View.viewMainMenu();
            String select = dataFromUser.nextLine();
            switch (select){
                case "1" -> LogIn.LogInToAccount();
                case "2" -> View.viewAvailableCars();
                case "3" -> stopApplication = true;
                default -> System.out.println(View.DEFAULT_MESSAGE);
            }
        }
        DataBase.saveData();
        View.print("Shutting Down.");
    }
}
