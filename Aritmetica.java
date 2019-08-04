/**
 * Operaciones aritmeticas entre dos numeros.
 *
 * @author (WVANEGAS)
 * @version (1_20190731)
 */
import java.util.Scanner;

public class Aritmetica
{
    public static void main (String[] argv)
    {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        int resultado;
        System.out.print("Escriba el primer entero");
        numero1=entrada.nextInt();
        
        System.out.print("Escriba el segundo entero");
        numero2=entrada.nextInt();
        
        resultado=numero1+numero2;// hace el calculo suma
        System.out.printf ("La suma es %d'n", resultado);//imprime la respuesta
        
        resultado=numero2-numero1;// hace el calculo diferencia
        System.out.printf ("La diferencia de segundo numero co respecto al primer numero es %d'n", resultado);//imprime la respuesta
        
        resultado=numero1*numero2;// hace el calculo producto
        System.out.printf ("El producto es %d'n", resultado);//imprime la respuesta
                
        resultado=numero1/numero2;// hace el calculo divicion
        System.out.printf ("El cociente de la divicion es %d'n", resultado);//imprime la respuesta
                
        resultado=numero1%numero2;// hace el calculo residuo
        System.out.printf ("el resuduo es %d'n", resultado);//imprime la respuesta
                
        Math.log(numero1);// hace el calculo 
        System.out.printf ("La suma es %d'n", resultado);//imprime la respuesta
                
        Math.pow(numero1,numero2);// hace el calculo potencia
        System.out.printf ("La suma es %d'n", resultado);//imprime la respuesta
        

    }
}
