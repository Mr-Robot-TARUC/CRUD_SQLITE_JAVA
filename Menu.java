import ClearScreen.ClearScreen;

public class Menu {

    public void displayMenu() {
        ClearScreen ClsScreen = new ClearScreen();
        ClsScreen.clearscreen();
        System.out.println("____________________________________________");
        System.out.println("Management System ");
        System.out.println("\t1. Read Data From Database");
        System.out.println("\t2. Insert Data To Database");
        System.out.println("\t3. Search Data From Database");
        System.out.println("\t4. Delete Data From Database");
        System.out.println("\t5. Update Data From Database");

        System.out.println("Chat Services");
        System.out.println("\t8. Server Services");
        System.out.println("\t9. Client Services");
        System.out.println("____________________________________________");

        System.out.println("Please Insert 1-9 (0 for exit)");

    }

}
