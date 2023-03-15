/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradosfahrenheit;
import java.util.*;
/**
 *
 * @author Diego
 */
public class GradosFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su la temperatura: ");
        double temperatura = sc.nextDouble();
        
        System.out.println("");
        System.out.println("Fahrenheit: " + String.valueOf( 32 +(9 * temperatura/5)));
        
    }
    
}
