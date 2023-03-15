/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayusculasminusculas;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class MayusculasMinusculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la frase a transformar");
        String frase = sc.nextLine();
        System.out.println("");
        
        System.out.println("Mayusculas: " + frase.toUpperCase());
        System.out.println("");
        System.out.println("Minusculas: " + frase.toLowerCase());           
    }   
}
