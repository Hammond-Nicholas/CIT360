/*
 * Project Name: NickNotes
 * Package Name: view
 * Class Name: NoteMenuView
 * 
 * Created on Dec 8, 2019, 6:04:13 PM
 * Created by Nick Hammond
 *
 * Purpose: <What is the purpose of the file?>
 */

package view;

import control.MainControl;

public class NoteMenuView extends ViewMenuAbstract {
    public NoteMenuView() {
        super("\n==========================="
        + "\nNote Options:"
        + "\n 1. Edit Note"
        + "\n 2. Return to Main Menu\n", 2);
        
        MainControl mc = new MainControl();
        mc.loadLocal();
    }
    
    // doMenuAction, unique to this menu
    // Either run editNote or return to Main Menu
    @Override
    public void doMenuAction(int userInput){
        switch(userInput){
            case 1: // edit note
                editNote();
                break;
            case 2: // go back to menu
                return;
        }
    }
    
    // editNote
    // Allow title and body to be editted
    public void editNote(){
        System.out.println("editNote was selected.  No action available.");
    }
}
