/*
 * Project Name: NickNotes
 * Package Name: view
 * Class Name: NewNoteView
 * 
 * Created on Dec 8, 2019, 6:04:46 PM
 * Created by Nick Hammond
 *
 * Purpose: <What is the purpose of the file?>
 */

package view;
import control.MainControl;
import java.util.Scanner;

public class NewNoteView {
    private static final Scanner keyboard = new Scanner(System.in);
    //public NewNoteView {  }
    
    // newNote
    // Create a new note, get title and body
    public void newNote(){
        System.out.println("\nnewNote");
        System.out.println("\nEnter note title: ");
        String title = keyboard.nextLine();  // get title
        System.out.println("\nEnter note body: \n");
        String body = keyboard.nextLine();  // get body
        
        MainControl mc = new MainControl(); // send user input to be saved
        mc.saveNoteLocal("note", title, body);
        mc.saveNoteRemote("note", title, body);
    }
}
