
/**
 * Write a description of class SumaEnteros here.
 *
 * @author (WVANEGAS)
 * @version (1_20190731)
 */
import java.util.Scanner;//el programa usa la clase scaner

public class SumaEnteros
{
    public static void main (String[] argv)
    {
        // crear objeto Scaner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        int suma;
        System.out.print("Escriba el primer entero");
        numero1=entrada.nextInt();//lee el primer numero del usuario
        System.out.print("Escriba el segundo entero");
        numero2=entrada.nextInt();//lee el segundo numero del usuario
        suma=numero1+numero2;// hace el calculo
        System.out.printf ("La suma es %d'n", suma);//imprime la respuesta
    }
}
