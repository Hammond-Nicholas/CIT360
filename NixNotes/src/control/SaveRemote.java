/*
 * Project Name: NixNotes
 * Package Name: control
 * Class Name: SaveRemote
 * 
 * Created on Dec 16, 2019, 12:16:53 AM
 * Created by Nick Hammond
 *
 * Purpose: <What is the purpose of the file?>
 */

package control;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class SaveRemote extends Thread {
    // attributes
    private String type;
    private String title;
    private String body;
    private static HttpURLConnection huc;

    public SaveRemote(String _type, String _title, String _body) {
        type = _type;
        title = _title;
        body = _body;
    }
    @Override
    public void run(){
        // create post message and convert it to byte data
        String post = ("type=" + type + "&title=" + title + "&body=" + body);
        byte[] postData = post.getBytes(StandardCharsets.UTF_8);

        try {
            URL url = new URL("http://192.168.56.103/index.jsp");  // open connection with servlet
            huc = (HttpURLConnection) url.openConnection();

            huc.setDoOutput(true);  // configure connection for post
            huc.setRequestMethod("POST");
            huc.setRequestProperty("User-Agent", "Java client");
            huc.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            try (DataOutputStream dos = new DataOutputStream(huc.getOutputStream())) {
                dos.write(postData);  // write data to servlet
            }
        } catch (MalformedURLException ex) {
            System.out.println("<> Unable to save remote notes.");
        } catch (IOException ex) {
            System.out.println("<> Unable to save remote notes.");
        } finally {
            huc.disconnect();
        }
    }
}
