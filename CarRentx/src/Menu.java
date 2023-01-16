public class Menu {
    public static void mainMenu(){
        System.out.println(DataBase.mainMenu.get(0));
        for (int i = 1; i < DataBase.mainMenu.size(); i++) {
            System.out.println(i + ". " + DataBase.mainMenu.get(i) + ".");
        }
    }
}
