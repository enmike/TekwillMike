/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum_dif_prod;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Sum_dif_prod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduceti primul numar: ");
       Scanner scnr1 = new Scanner(System.in);
       
        int nr1 = scnr1.nextInt();
       
        System.out.println("Introduceti numarul doi: ");
       Scanner scnr2 = new Scanner(System.in);
       
        int nr2 = scnr2.nextInt();
       
        float suma;
        float diferenta;
        float produs;
        float media;
        
        suma = nr1+nr2;
        diferenta = nr1-nr2;
        produs = nr1*nr2;
        media = (nr1+nr2)/2;
        System.out.println("Suma a doua numere est" + suma);
        System.out.println("Diferenta a doua numere este:" + diferenta);
        System.out.println("Produsul a doua numere este:" + produs);
        System.out.println("media a doua numere este:" + media);
    }
    
}
