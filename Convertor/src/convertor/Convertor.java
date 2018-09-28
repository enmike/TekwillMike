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
public class Convertor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here double price = 10 ;   
                
       System.out.println("Introduceti valoarea in grade F: ");
       Scanner sc = new Scanner(System.in);
       
        float gradeF = sc.nextFloat();
        float gradeC;
        gradeC = 5*(gradeF-32)/9;
        System.out.println("Temperatura in grade Celsius este de:" + gradeC);
        
      /* gradeC = sc.nextInt();
       gradeF = 9*gradeC/5+32;52
        
       
       String str = sc.nextLine();
       System.out.println("Valoarea a fost introdusa. \n");
       System.out.println("String you entered:" + str); */
    }
    
}
