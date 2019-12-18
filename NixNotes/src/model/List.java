/*
 * Project Name: NickNotes
 * Package Name: model
 * Class Name: List
 * 
 * Created on Dec 8, 2019, 4:50:17 PM
 * Created by Nick Hammond
 *
 * Purpose: <What is the purpose of the file?>
 */

package model;
import java.util.ArrayList;
import java.io.Serializable;


public class List implements Serializable {
    // attributes
    private String type;
    private String name;
    private ArrayList<String> list;
    
    // empty construction
    public List() {
    }
    
    // constructor with attributes
    public List(String _type, String _name, ArrayList<String> _list) {
        type = _type;
        name = _name;
        list = _list;
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
     * @return the list
     */
    public ArrayList<String> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(ArrayList<String> list) {
        this.list = list;
    }
    
}
