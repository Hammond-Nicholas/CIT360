/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicksappcontroller;
import java.util.HashMap;

/**
 * Code based off of Brad Lawrences repo:
 * https://github.com/Lawrence-Brad/ApplicationControllerExample/blob/master/src/main/ApplicationController.java
 */
public class AppController {
    // Declare HashMap controlOptions
    HashMap<String, Handler> controlOptions;
    
    // Initialize controlOptions
    public AppController() {
        controlOptions = new HashMap<>();
        controlOptions.put("Pies", new PieHandler());
        controlOptions.put("Beverages", new BevHandler());
    }
    
    // Invoke a handler from controlOptions but using user input "uOption"
    public Object invokeHandler(String uOption){
        Handler invoker = controlOptions.get(uOption);
        return invoker.handleIt();
    }
    
}
