
/**
 * COMPARAR DOS NUMERO ENTEROS.
 *
 * @author (WVANEGAS)
 * @version (1_20190801)
 */
import java.util.Scanner;

public class COMPARACION
{
    public static void main (String [] args)
    {
        Scanner entrada = new Scanner  (System.in);
        int numero1;
        int numero2;
        System.out.print ("Escriba el primer entero");
        numero1=entrada.nextInt ();
        System.out.print ("Escriba el segundo entero");
        numero2=entrada.nextInt (); 
        if (numero1 == numero2) 
        System.out.printf("%d==%d\n", numero1, numero2);
        
        if (numero1 != numero2) 
        System.out.printf("%d!=%d\n", numero1, numero2);
        
        if (numero1 < numero2) 
        System.out.printf("%d<%d\n", numero1, numero2);
        
    }
}
