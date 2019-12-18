/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nixnotes;

import control.*;
import view.*;

/**
 *
 * @author Nick Hammond
 */
public class NixNotes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here

        // load local saved via thread
        MainControl mc = new MainControl();
        mc.loadLocal();
        // load remote saved via thread    
        mc.loadRemote();
        // initiate instance of menu view
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenu();
    }
}
