/*
 * Project Name: NixServlet
 * Package Name: 
 * Class Name: NixServlet
 * 
 * Created on Dec 11, 2019, 5:16:50 PM
 * Created by Nick Hammond
 *
 * Purpose: <What is the purpose of the file?>
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class NixServlet extends HttpServlet {
    private static SessionFactory factory;
    JSONParser parser = new JSONParser();
    
    // initialize servlet
    @Override
    public void init() throws ServletException {    }
    
    // Save new files
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // set response as text/html
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = response.getWriter();
        try {
            // set variables using data from form
            String type = request.getParameter("type");
            String title = request.getParameter("title");
            String body = request.getParameter("body");

            // save to hibernate
            notesToHibernate(type, title, body);
            // update Notes JSON file
            notesToJSON();
            
        } finally {
            pw.close();
        }
    }
    
    // Save Notes to Hibernate
    protected void notesToHibernate(String type, String title, String body) {
        // open session, define hibernate vars
        Session session = factory.openSession();
        Transaction trans = null;
        Integer noteID;

        // send note to hibernate
        try {
            trans = session.beginTransaction();
            Note note = new Note(type, title, body);
            noteID = (Integer) session.save(note);
            trans.commit();
            session.close();
        } catch (HibernateException e) {
            if (trans != null) {
                trans.rollback();
            }
            e.printStackTrace();
        }
    }
    
    // Print Notes to JSON file from Hibernate
    protected void notesToJSON(){
        // open session, define hibernate vars
        Session session = factory.openSession();
        // get note object from hibernate and put them in list
        List<Note> list = session.createCriteria(Note.class).list();
        JSONArray ja = new JSONArray();
        JSONObject jo = new JSONObject();  
        // parse list into json objects and put in json array
        try {
            for(Note note: list) {
                jo.put("type", parser.parse(note.getType()));
                jo.put("title", parser.parse(note.getTitle()));
                jo.put("body", parser.parse(note.getBody()));
                ja.add(jo);         // Add objects to array
            }
        } catch (ParseException ex) {
            Logger.getLogger(NixServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        try { // json array write to file
            FileWriter fw = new FileWriter("Web Pages/notes.json");
            fw.write(ja.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        session.close();
        
        System.out.println("\nNote saved locally.");
    }
    // close servlet
    @Override
    public void destroy() {   }
}
