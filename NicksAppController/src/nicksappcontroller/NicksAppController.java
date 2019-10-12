/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicksappcontroller;
import java.util.Scanner;

/**
 *
 * @author nrham
 */
public class NicksAppController {

    /**
     * 
     */
    public static void main(String[] args) {
        AppController appCon = new AppController();
        Scanner scanner = new Scanner(System.in);
        int uInput = 0;
        String greet = "Hello,\n" 
                +"Please choose where you would like to view a list of Pies\n"
                +"or a list of beverages.\n"
                +" 1 - Pies\n"
                +" 2 - Beverages\n";
        
        
        // Get user input
        System.out.printf("%s", greet);
        do{
            uInput = scanner.nextInt();
            if ((uInput != 1) && (uInput != 2)){
                System.out.printf("Invalid entry (%d).  Try again.\n", uInput);   
            }
        }
        while((uInput != 1) && (uInput != 2));
        
        if (uInput == 1){
            appCon.invokeHandler("Pies");
        }
        if (uInput == 2){
            appCon.invokeHandler("Beverages");
        }
        
        System.out.println("\n\nEnd.");
    }
    
}
