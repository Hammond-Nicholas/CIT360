/*
 * Project Name: NickNotes
 * Package Name: view
 * Class Name: ViewMenuAbstract
 * 
 * Created on Dec 8, 2019, 6:03:41 PM
 * Created by Nick Hammond
 *
 * Purpose: <What is the purpose of the file?>
 */

package view;
import java.util.Scanner;


public abstract class ViewMenuAbstract implements ViewInterface {
    // Variables for all Menus: keyboard, menu, max
    protected final static Scanner keyboard = new Scanner(System.in);
    protected String menu;
    protected int max;
    
    // Constructor with attributes
    public ViewMenuAbstract(String _menu, int _max) {
        menu = _menu;
        max = _max;
    }
    
    // Display menu, inherited by all menus
    // Prints menu, gets input from getMenuOption, sends input to doMenuAction in child class
    @Override
    public void displayMenu(){
        int userInput;
        do {
            System.out.print(menu);
            userInput = getMenuOption();
            doMenuAction(userInput);
        }
        while (userInput != max);
    }
    // Get menu option from user, inheritied by all menus
    // Gets nextInt from user, returns input if between 1 and max
    @Override
    public int getMenuOption(){
        int userInput = 0;
        do {
            if(keyboard.hasNextInt()){
                userInput = keyboard.nextInt();
           
                if ((userInput < 1) || (userInput > max)){
                    System.out.println("\nInvalid option. Please enter between 1 and " + max);
                }
            }
        }
        while ((userInput < 1) || (userInput > max));
        return userInput;
    }
}
