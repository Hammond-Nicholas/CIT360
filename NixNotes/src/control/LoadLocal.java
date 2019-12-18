/*
 * Project Name: NixNotes
 * Package Name: control
 * Class Name: LoadLocal
 * 
 * Created on Dec 15, 2019, 10:15:51 AM
 * Created by Nick Hammond
 *
 * Purpose: <What is the purpose of the file?>
 */

package control;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LoadLocal extends Thread {
    
    @Override
    public void run() {
        JSONParser jp = new JSONParser();
        String type, title, body;  // note and list attributes
        //ArrayList<String> listItems;  // used to get list of items
        
        File notesDir = new File("JSON/notes");  // get all notes from JSON directory
        File[] noteFiles = notesDir.listFiles();
        
        ArrayList<String> notesFileList = new ArrayList<>(); // read note filenames into array
        for (File f : noteFiles) {  
            notesFileList.add(f.getName());
        }
        
        for (String s : notesFileList) {  // parse files from array into strings
            try {
                JSONObject jo = (JSONObject) jp.parse(new FileReader("JSON/notes/" + s));
                type = (String) jo.get("type");
                title = (String) jo.get("title");
                body = (String) jo.get("body");
                System.out.print("\n>>" + title + "\n" + body);
                System.out.println("\n==========================");
                //throw new ParseException("Parse Exception");
            } catch (IOException | ParseException e) {
            System.out.println("<> Unable to get local notes.");
            }
        }
        
        /* list under developement
        File listDir = new File("JSON/lists");  // get all lists from JSON directory
        File[] listFiles = listDir.listFiles();
        
        ArrayList<String> listsFileList = new ArrayList<>(); // read list filenames into array
        for (File f : listFiles) {
            listsFileList.add(f.getName());
        }
        
        for (String s : listsFileList) {  // parse files from array into strings
            try {
                JSONObject jo = (JSONObject) jp.parse(new FileReader("JSON/lists/" + s));
                type = (String) jo.get("type");
                title = (String) jo.get("title");
                listItems = (ArrayList<String>) jo.get("list");
                System.out.print("\n>>" + title);
                for (String a : listItems) {
                    System.out.printf("\n%s", a);
                }
                System.out.println("\n==========================");
                //throw new ParseException("Parse Exception");
            } catch (IOException | ParseException e) {
                e.printStackTrace();
            }
        }*/
    }
}
