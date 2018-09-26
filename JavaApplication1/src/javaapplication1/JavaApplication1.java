/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Admin
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double price = 10 ;
        double tax = 5;
        int quantity = 60;
        double total;
        String message = "I want to buy" + " " + quantity + " " + "shirt!";
        total = price * quantity*tax;
        String total1 = "Total cost with tax is" + " " + total;
        System.out.println (total1);
    }
    
}
