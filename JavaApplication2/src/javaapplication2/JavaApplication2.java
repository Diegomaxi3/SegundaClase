/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments1*/
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int numero = leer.nextInt();
        System.out.println("Ingrese un numero: ");
        int numero2 = leer.nextInt();
         
        System.out.println("Resultado: " + String.valueOf(numero + numero2));
    }
    
}
