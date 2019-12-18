/*
 * Project Name: NickNotes
 * Package Name: view
 * Class Name: MainMenuView
 * 
 * Created on Dec 8, 2019, 6:04:02 PM
 * Created by Nick Hammond
 *
 * Purpose: <What is the purpose of the file?>
 */

package view;
import java.util.Scanner;

public class MainMenuView extends ViewMenuAbstract {
    public MainMenuView() {
        super("\n==========================="
        + "\nMain Menu Options:"
        + "\n 1. View Notes"
        + "\n 2. View Lists"
        + "\n 3. New Note"
        + "\n 4. New List"
        + "\n 5. Quit\n", 5);
    }
    
    // doMenuAction, unique to this menu
    @Override
    public void doMenuAction(int userInput){
        switch(userInput){
            case 1: // View Notes
                viewNotes();
                break;
            case 2: // View Lists
                viewLists();
                break;
            case 3: // New Note
                newNote();
                break;
            case 4: // New List
                newList();
                break;
            case 5: // Quit
                System.out.println("\nGoodbye.");
        }
    }
    
    // viewNotes
    // Display all notes, then launch NoteMenuView
    public void viewNotes(){
        System.out.println("Display all notes: viewNotes");
        NoteMenuView nmv = new NoteMenuView();
        nmv.displayMenu();
    }
    // viewLists
    // Display all lists, then launch ListMenuView
    public void viewLists(){
        System.out.println("Display all lists: viewLists");
        ListMenuView lmv = new ListMenuView();
        lmv.displayMenu();
    }
    
    // newNote
    // Launch NewNoteView
    public void newNote(){
        NewNoteView nnv = new NewNoteView();
        nnv.newNote();
    }
    
    // newList
    // Launch NewListView
    public void newList(){
        NewListView nlv = new NewListView();
        nlv.newList();
    }
}
