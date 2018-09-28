/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertor;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Minute_zile_ani {
    public static void main(String[] args) {
        // TODO code application logic here double price = 10 ;   
                
       System.out.println("Introduceti numarul de minute: ");
       Scanner sc = new Scanner(System.in);
       
        int minute = sc.nextInt();
       float zile;
        zile = minute/1440;
        System.out.println("Numarul de zile este de:" + zile); 
        
    }
}
