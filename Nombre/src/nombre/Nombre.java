/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombre;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class Nombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre =  leer.nextLine();
        
        System.out.println(nombre);
    }
    
}
