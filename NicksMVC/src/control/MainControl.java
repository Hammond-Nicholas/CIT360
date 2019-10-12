/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import model.*;
import view.*;
/**
 *
 * @author nrham
 */
public class MainControl {
    // Intialize view and model
    MainView mView = new MainView();
    MainModel mModel = new MainModel();
    HarvestModel hModel = new HarvestModel();
    SalesModel sModel = new SalesModel();
    
    public int uOption;
    
    public MainControl() {
}
    public void menuControl() {
        uOption = mView.menuView();
        
        switch(uOption){
                case 1: 
                    // Send harvest model to view
                    mView.harvestView(hModel);
                    break;
                case 2:
                    // Send sales model to view
                    mView.salesView(sModel);
                    break;
                case 3:
                    // Exit app
                    System.out.println("Thanks, have a great day.");
                    System.exit(0);
                    break;
                default:
                    // Repeat menuView
                    System.out.printf("%d is not a valid entry.\n", uOption);
                    menuControl();
        }
    }
}
