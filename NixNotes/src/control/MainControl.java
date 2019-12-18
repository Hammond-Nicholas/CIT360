/*
 * Project Name: NixNotes
 * Package Name: control
 * Class Name: MainControl
 * 
 * Created on Dec 2, 2019, 5:50:01 PM
 * Created by Nick Hammond
 *
 * Purpose: Load and Save notes and lists locally to JSON files and Remotely to HTTPurl
 */

package control;
import java.io.*;
import java.util.HashSet;
import org.json.simple.JSONObject;

public class MainControl {
    
    // loadLocal JSON files note and list
    public void loadLocal(){
        LoadLocal ll = new LoadLocal();
        ll.start();
    }
    // loadRemote HTTPurl note and list
    public void loadRemote(){
        LoadRemote lr = new LoadRemote();
        lr.start();
    }
    // saveNoteLocal JSON file
    public void saveNoteLocal(String type, String title, String body){
        SaveLocal sl = new SaveLocal(type, title, body);
        sl.start();
    }
    // saveNoteRemote HTTPurl
    public void saveNoteRemote(String type, String title, String body) {
        SaveRemote sr = new SaveRemote(type, title, body);
        sr.start();
    }
    // saveListLocal JSON file
    public void saveListLocal(String title, HashSet<String> items){
        
        JSONObject jo = new JSONObject();  // put title and items into JSON object
        jo.put("type", "list");
        jo.put("title", title);
        jo.put("items", items);

        try ( FileWriter fw = new FileWriter("JSON/lists/" + title + ".json")) {  // write to file
            fw.write(jo.toJSONString());
        } catch (IOException e) {
            System.out.println("<> Unable to save local list.");
        }
        System.out.println("\nList saved locally.");
    }
    // saveListRemote HTTPurl
    public void saveListRemote(String title, HashSet<String> items){
        System.out.println("\nList saved remotely.  ** No action taken **");
    }
}
