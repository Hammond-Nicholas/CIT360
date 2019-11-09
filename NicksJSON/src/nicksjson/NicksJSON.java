/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicksjson;
import java.io.FileReader; 
import java.io.IOException;
import java.io.Reader;
import java.io.FileWriter;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        
        // Get first and last names from user
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();
        
        JSONObject obj = new JSONObject();
        obj.put("firstName", firstName);
        obj.put("lastName", lastName);


        try (FileWriter file = new FileWriter("src/nicksjson/JSON1.json")) {
            file.write(obj.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Create parser
        JSONParser parser = new JSONParser();
        
        // Read json file
        try(Reader file = new FileReader("src/nicksjson/JSON1.json")){
            
            // Parse json file into json object
            JSONObject jo = (JSONObject) parser.parse(file);

            // Map data from json to Java
            String firstName2 = (String) jo.get("firstName");
            String lastName2 = (String) jo.get("lastName");
                        
            // Print names and age
            System.out.println(firstName2 + " " + lastName2);            
      
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
}
