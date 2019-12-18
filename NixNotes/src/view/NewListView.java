/*
 * Project Name: NickNotes
 * Package Name: view
 * Class Name: NewListView
 * 
 * Created on Dec 8, 2019, 6:05:01 PM
 * Created by Nick Hammond
 *
 * Purpose: <What is the purpose of the file?>
 */

package view;
import control.MainControl;
import java.util.HashSet;
import java.util.Scanner;

public class NewListView {
    private static final Scanner keyboard = new Scanner(System.in);
    //public NewListView {  }
    
    // newList
    // Create a new list, get title and list items
    public void newList(){
        System.out.println("\nnewList.");
        System.out.println("\nEnter list title: ");
        String title = keyboard.nextLine();
        System.out.println("\nEnter list items: \n");
        HashSet<String> items = new HashSet<>();
        do {
            items.add(keyboard.nextLine()); // add item to list while there is a next line
        } 
        while (!"".equals(keyboard.nextLine()));
        
        MainControl mc = new MainControl();  // send user input to be saved
        mc.saveListLocal(title, items);
        mc.saveListRemote(title, items);
    }
}
