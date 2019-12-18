/*
 * Project Name: NickNotes
 * Package Name: model
 * Class Name: Note
 * 
 * Created on Dec 8, 2019, 4:50:04 PM
 * Created by Nick Hammond
 *
 * Purpose: <What is the purpose of the file?>
 */

package model;
import java.io.Serializable;


public class Note implements Serializable {
    // attributes
    private String type;
    private String name;
    private String body;
    
    // empty constructor
    public Note() {
    }
    
    // constructor with attributes
    public Note(String _type, String _name, String _body) {
        type = _type;
        name = _name;
        body = _body;
    }
    
    // getters and setters
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(String body) {
        this.body = body;
    }
    
}
