/*
 * Project Name: NickNotes
 * Package Name: view
 * Class Name: ViewInterface
 * 
 * Created on Dec 8, 2019, 6:03:29 PM
 * Created by Nick Hammond
 *
 * Purpose: Interface for ViewMenuAbstract
 */

package view;

public interface ViewInterface {
    // Methods: Display menu, Get menu option, Do option action
    
    // Handled by abstract
    public void displayMenu();
    public int getMenuOption();
    
    // Handled by individual menus
    public void doMenuAction(int userInput);
    
}
