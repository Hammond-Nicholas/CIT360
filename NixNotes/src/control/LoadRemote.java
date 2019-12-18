/*
 * Project Name: NixNotes
 * Package Name: control
 * Class Name: LoadRemote
 * 
 * Created on Dec 11, 2019, 10:16:02 AM
 * Created by Nick Hammond
 *
 * Purpose: <What is the purpose of the file?>
 */

package control;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LoadRemote extends Thread {
    //public LoadRemote {    }
    private HttpURLConnection huc;
    JSONParser jp = new JSONParser();
    String type, title, body; 
    
    @Override
    public void run() {
        try {
            // read JSON from notes.json file on server
            URL url = new URL("http://192.168.56.103/notes.json");
            huc = (HttpURLConnection) url.openConnection();  // open connection to json file
            
            try (BufferedReader br = new BufferedReader(new InputStreamReader(huc.getInputStream()))){
                br.toString();  // convert reader to string
                // map each note to object, save, then display
                JSONArray ja = new JSONArray();
                String stringObj;
                
                // parse each line of the buffered reader to a json object, then add to json array
                while((stringObj = br.readLine()) != null) {
                    try {
                        JSONObject jo = (JSONObject)jp.parse(stringObj);
                        ja.add(jo);
                        // print to screen
                        type = (String) jo.get("type");
                        title = (String) jo.get("title");
                        body = (String) jo.get("body");
                        System.out.print("\n>>" + title + "\n" + body);
                        System.out.println("\n==========================");
                    } catch (ParseException ex) {
                        System.out.println("<> Unable to parse remote stream.");
                    }
                }
                br.close();
            } catch (IOException ex) {
                System.out.println("<> Unable to read remote stream.");
            } 
        } catch (MalformedURLException ex) {
            System.out.println("<> Unable to get remote notes.");
        } catch (IOException ex) {
            System.out.println("<> Unable to get remote notes.");
        } finally {
            huc.disconnect();
        }
        
    }
}
