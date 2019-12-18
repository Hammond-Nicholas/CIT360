/*
 * Project Name: NixNotes
 * Package Name: control
 * Class Name: SaveLocal
 * 
 * Created on Dec 16, 2019, 12:16:43 AM
 * Created by Nick Hammond
 *
 * Purpose: <What is the purpose of the file?>
 */

package control;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;


public class SaveLocal extends Thread {
    // attributes
    private final String type;
    private final String title;
    private final String body;
    
    // Constructor for note
    public SaveLocal(String _type, String _title, String _body) {
        type = _type;
        title = _title;
        body = _body;
    }
    // Constructor for list  ** in progress. type, title, items **
    
    @Override
    public void run(){
        JSONObject jo = new JSONObject();  // put title and body in JSON object
        jo.put("type", "note");
        jo.put("title", title);
        jo.put("body", body);

        try ( FileWriter fw = new FileWriter("JSON/notes/" + title + ".json")) { // write to file
            fw.write(jo.toJSONString());
        } catch (IOException e) {
            System.out.println("<> Unable to save local notes.");
        }
        System.out.println("\nNote saved locally.");
    }
}
