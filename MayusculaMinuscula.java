/*
 3. Escribir un programa que pida una frase y la muestre toda en mayúsculas
 y despues todo en minuscula.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.

 */
package mayusculaminuscula;
import java.util.Scanner;


/**
 *
 * @author Pablo
 */
public class MayusculaMinuscula {

    
    public static void main(String[] args) {
              Scanner scanner = new Scanner (System.in);
        System.out.println(" Ingrese frase ");
          String frase = scanner.nextLine();
        String frase1= frase.toUpperCase();
        System.out.println(frase1);
        String frase2= frase.toLowerCase();
        System.out.println(frase2);
    }
    
}
