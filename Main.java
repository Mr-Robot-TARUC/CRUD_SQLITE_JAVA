import java.util.Scanner;

import CHATROOM.host;
import ClearScreen.ClearScreen;
import CHATROOM.client;

// Name: Ho Weng Yin 
// ID:D210044A
// Course: Diploma In IT
// Subject: 
// Individual Project
// Description: 
// Submission Date: 

public class Main {
    // Check The User Input to check user whether want to exit or continue program
    public static boolean isRepeat(int INPUT) {
        if (INPUT != 0) {
            return true;
        }

        else {
            return false;
        }

    }

    public static void main(String[] args) throws Exception {
        // Declare Variables
        int INPUT;
        Scanner scanner = new Scanner(System.in);

        do {
            // Display Menu
            Menu systemMenu = new Menu();

            // Prompt User Input
            systemMenu.displayMenu();

            INPUT = scanner.nextInt();

            // Switch Case
            switch (INPUT) {

                case 0:
                    System.out.println("Goodbye");
                    return;

                case 1:
                    case1 function1 = new case1();
                    function1.read();
                    break;

                case 2:
                    case2 function2 = new case2();
                    function2.insert();
                    break;

                case 3:
                    case3 function3 = new case3();
                    function3.search();
                    break;

                case 4:
                    case4 function4 = new case4();
                    function4.delete();
                    break;

                case 5:
                    case5 function5 = new case5();
                    function5.update();
                    break;

                case 8:
                    host function10 = new host();
                    function10.chat();
                    break;
                case 9:
                    client function11 = new client();
                    function11.joinCHAT();
                    break;

                default:
                    System.out.println("Invalid Input!!");
                    break;

            }
        } while (isRepeat(INPUT) == true);

    }

}
