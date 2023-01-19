public class View {
    public static final String DEFAULT_MESSAGE = "You selected the wrong option. Select one of the available options.";
    public static void printMainMenu(){
        print("Select one of the available option:");
        print("1. View available cars.");
        print("2. Delete account.");
        print("3. Close the program.");
    }
    public static void selectLogInOrRegister(){
        print("Select one of the available option:");
        print("1. Login.");
        print("2. Register.");
    }
    public static void printAvailableCars(){
        DataBase cars = new DataBase();
        for (int i = 0; i < cars.carsForRent.size(); i++) {
            print(i + 1 + ". " + cars.carsForRent.get(i) + ".");
        }
        print("");
    }
    public static void print(String message){
        System.out.println(message);
    }
}
