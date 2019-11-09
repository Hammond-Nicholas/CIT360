/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicksjson;
import java.io.FileReader; 
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator; 
import java.util.Map; 
import java.util.Scanner;

import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*;
/**
 *
 * @author Nick Hammond
 */
public class NicksJSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Code sandboxed from https://www.geeksforgeeks.org/parse-json-java/
        // Code in JSON1.json file from same site
        /*Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();
        
        System.out.println("Enter your");
*/
        // Create parser
        JSONParser parser = new JSONParser();
        
        // Read json file
        try(Reader file = new FileReader("src/nicksjson/JSON1.json")){
            
            // Parse json file into json object
            JSONObject jo = (JSONObject) parser.parse(file);

            // Map data from json to Java
            String firstName = (String) jo.get("firstName");
            String lastName = (String) jo.get("lastName");
            /*long age = (long) jo.get("age");
            Map address = ((Map) jo.get("address"));
            JSONArray ja = (JSONArray) jo.get("phoneNumbers");
*/
            
            // Print names and age
            System.out.println(firstName + " " + lastName);            
/*            System.out.println("Age: "+ age);

            // iterate address map
            Iterator<Map.Entry> itr1 = address.entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }

            // iterate phone number array
            Iterator itr2 = ja.iterator();
            while (itr2.hasNext()) {
                itr1 = ((Map) itr2.next()).entrySet().iterator();
                while (itr1.hasNext()) {
                    Map.Entry pair = itr1.next();
                    System.out.println(pair.getKey() + " : " + pair.getValue());
                }
            }
*/        
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
}
