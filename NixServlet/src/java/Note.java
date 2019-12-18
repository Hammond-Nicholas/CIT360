
/*
 * Project Name: NixServlet
 * Package Name: 
 * Class Name: Note
 * 
 * Created on Dec 11, 2019, 11:27:07 PM
 * Created by Nick Hammond
 *
 * Purpose: <What is the purpose of the file?>
 */


public class Note {

    // attributes
    private String type;
    private String title;
    private String body;

    // empty constructor
    public Note() {
    }

    // constructor with attributes
    public Note(String _type, String _title, String _body) {
        type = _type;
        title = _title;
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
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
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
