public class View {
    public static final String DEFAULT_MESSAGE = "You selected the wrong option. Select one of the available options.";
    public static void viewMainMenu(){
        print(DataBase.mainMenu.get(0));
        for (int i = 1; i < DataBase.mainMenu.size(); i++) {
            print(i + ". " + DataBase.mainMenu.get(i) + ".");
        }
    }
    public static void viewAvailableCars(){
        for (int i = 0; i < DataBase.carsForRent.size(); i++) {
            print(i + 1 + ". " + DataBase.carsForRent.get(i) + ".");
        }
        print("");
    }
    public static void viewAllAccounts(){
        for (int i = 0; i < DataBase.accounts.size(); i++) {
            print(i + ". " + DataBase.accounts.get(i) + ".");
        }
    }
    public static void print(String message){
        System.out.println(message);
    }
}
