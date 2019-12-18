/*
 * Project Name: NickLists
 * Package Name: view
 * Class Name: ListMenuView
 * 
 * Created on Dec 8, 2019, 6:04:25 PM
 * Created by Nick Hammond
 *
 * Purpose: <What is the purpose of the file?>
 */

package view;

public class ListMenuView extends ViewMenuAbstract {
    public ListMenuView() {
        super("\n==========================="
        + "\nList Options:"
        + "\n 1. Edit List"
        + "\n 2. Return to Main Menu\n", 2);
    }
    
    // doMenuAction, unique to this menu
    // Either run editList or return to Main Menu
    @Override
    public void doMenuAction(int userInput) {
        switch (userInput) {
            case 1: // edit list
                editList();
                break;
            case 2: // go back to menu
                return;
        }
    }

    // editList
    // Allow title and list to be editted
    public void editList() {
        System.out.println("editList was selected.  No action available.");
    }
}
