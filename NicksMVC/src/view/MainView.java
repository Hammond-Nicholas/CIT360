/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model.*;
import java.util.Scanner;

/**
 *
 * @author nrham
 */
public class MainView {
    public String greeting, options;
    public int uInput;
    Scanner scanner = new Scanner(System.in);
    
    public MainView(){
        greeting = "Hello, \n" 
            + "Welcome to Nick's Farmer Market. \n"
            + "Please choose from the following options: \n\n";
        options = " 1 - View this years harvest \n"
            + " 2 - View number of sales \n"
            + " 3 - Exit";
    }
    
    // Print greeting and options.  Return user input to control.
    public int menuView(){
        System.out.print(greeting);
        System.out.print(options);
        uInput = scanner.nextInt();
        return uInput;
    }
    
    // Print Harvest Model
    public void harvestView(MainModel _model){
        System.out.println("The harvest returned the following: \n"
        + "Carrots: " + _model.carrot + "\n"
        + "Cucumbers: " + _model.cucumber + "\n"
        + "Watermelon: " + _model.watermelon + "\n"
        + "Oranges: " + _model.orange + "\n"
        + "Strawberrys: " + _model.strawberry);
    }
    
    // Print Sales Model
    public void salesView(MainModel _model){
        System.out.println("Sales this year: \n"
        + "Carrots: " + _model.carrot + "\n"
        + "Cucumbers: " + _model.cucumber + "\n"
        + "Watermelon: " + _model.watermelon + "\n"
        + "Oranges: " + _model.orange + "\n"
        + "Strawberrys: " + _model.strawberry);
    }
}
