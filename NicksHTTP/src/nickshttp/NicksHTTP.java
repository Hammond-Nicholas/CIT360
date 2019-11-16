/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nickshttp;
import java.net.*;
import java.io.*;

/**
 * Code sandboxed from 
 * https://developer.android.com/reference/java/net/HttpURLConnection.html
 * and
 * https://www.javatpoint.com/java-http-url-connection
 */
public class NicksHTTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Get URL header information
        try {
            // Target URL
            URL url = new URL("http://www.byui.edu");
            // Open URL connection
            HttpURLConnection huc1 = (HttpURLConnection) url.openConnection();
            // Read InputStream
            BufferedReader br = new BufferedReader(new InputStreamReader(huc1.getInputStream()));
            String inputLine;
            // Print out read input
            while ((inputLine = br.readLine()) != null) {
                System.out.println(inputLine);
            }
            // Close stream
            br.close();
            // Close URL connection
            huc1.disconnect();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
 
        // Write stream out
        try {
            // Target URL
            URL url = new URL("http://www.byui.edu");
            // Open URL connection
            HttpURLConnection huc2 = (HttpURLConnection) url.openConnection();
            // Enable writing to server
            huc2.setDoOutput(true);
            // Set chunked streaming because body size is unknown
            huc2.setChunkedStreamingMode(0);
            // Write out to server
            OutputStream out = new BufferedOutputStream(huc2.getOutputStream());
            byte b[] = {1, 2, 3, 4, 5};
            out.write(b);
            // Close URL connection
            huc2.disconnect();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
}

