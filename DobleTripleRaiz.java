/*
 
 */
package dobletripleraiz;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class DobleTripleRaiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num  = new Scanner (System.in);
        int n,n1,n2;
        double n3;
        System.out.println("Ingrese numero");
        n = num.nextInt();
        n1 = 2 * n;
        System.out.println("El doble es "+ n1);
           n2 = 3 * n;
           System.out.println("El triple es "+n2);
           n3 = Math.sqrt(n);
           System.out.println("La raiz cuadrada es "+n3);
        
        // TODO code application logic here
    }
    
}
