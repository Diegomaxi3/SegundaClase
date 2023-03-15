/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transformarnumero;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class TransformarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =  new Scanner(System.in);
        System.out.print("Ingrese el número a transformar: ");
        int numero = sc.nextInt();
        
        System.out.println("");
        System.out.println("Doble: " + String.valueOf(numero * 2));
        System.out.println("Triple: " + String.valueOf(numero * 3));
        System.out.println("Cuadrado: "+ String.valueOf(Math.sqrt(numero)));
    }
    
}
