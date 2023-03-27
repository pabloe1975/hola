/*
 2. Escribir un programa que pida tu nombre, lo guarde en una variable  
y lo muestre en pantalla.

 
 */
package nombre;
import java.util.Scanner;
/**
 * @author Pablo
 */
public class Nombre {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println(" Ingrese nombre ");
        
        String nomb = scanner.nextLine();
    
        System.out.println(" El nombre ingresado es : " + nomb);
    }
    
}
