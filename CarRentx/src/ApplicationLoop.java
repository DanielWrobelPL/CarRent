import java.util.Scanner;

public class ApplicationLoop {
    public static final Scanner dataFromUser = new Scanner(System.in);
    public static void applicationLoop(){
        boolean stopApplication = false;
        while (!stopApplication) {
            Menu.mainMenu();
            String select = dataFromUser.nextLine();
            switch (select){
                case "2" -> viewAvailableCars();
                case "3" -> stopApplication = true;
            }
        }
    }
    public static void viewAvailableCars(){
        for (int i = 0; i < DataBase.carsForRent.size(); i++) {
            System.out.println(i + 1 + ". " + DataBase.carsForRent.get(i) + ".");
        }
        System.out.println();

    }
}
