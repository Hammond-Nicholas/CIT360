/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicksmvc;
import control.*;

/**
 *
 * @author nrham
 */
public class NicksMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start app by loading MainControl
        MainControl mControl = new MainControl();
        mControl.menuControl();
    }
}
