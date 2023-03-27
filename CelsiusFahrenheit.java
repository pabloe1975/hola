/*
 4. Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: 
F = 32 + (9*C/5).

 */
package celsiusfahrenheit;
 import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class CelsiusFahrenheit {

    
    public static void main(String[] args) {
       Scanner lector = new Scanner (System.in);
               double F, C;
        System.out.println(" Ingrese grados Celsius");
        C = lector.nextDouble();
        F = 32 + (9*C/5);
        System.out.println(" La conversion a grados Fahrenheit es :"+F);
    }
    
}
