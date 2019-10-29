/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicksjunit;
import java.util.Scanner;

/**
 *
 * @author Nick Hammond
 */
public class NicksJunit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalcNumbers cn = new CalcNumbers();
        int per = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number to convert to percent.");
        
        per = cn.calcPercent(scanner.nextInt());
        
        System.out.println(per+"%");
 
    }
    
}
