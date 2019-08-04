/**
 * Operaciones aritmeticas entre dos numeros.
 *
 * @author (WVANEGAS)
 * @version (1_20190731)
 */
import java.util.Scanner;

public class Ejercicioaritmetica
{
    public static void main (String[] argv)
    {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        int resultado;
        System.out.print("\nEscriba el primer entero: ");
        numero1=entrada.nextInt();
        
        System.out.print("Escriba el segundo entero: ");
        numero2=entrada.nextInt();
        
        resultado=numero1+numero2;// hace el calculo suma
        System.out.printf ("\n El resultado de la suma de %d + %d es= %d\n",numero1,numero2,resultado);//imprime la respuesta
        
        resultado=numero2-numero1;// hace el calculo diferencia
        System.out.printf ("\n La diferencia de %d - %d es= %d\n",numero2,numero1,resultado);//imprime la respuesta
        
        resultado=numero1*numero2;// hace el calculo producto
        System.out.printf ("\n El producto de %d * %d es= %d\n",numero1,numero2,resultado);//imprime la respuesta
                
        resultado=numero1/numero2;// hace el calculo divicion
        System.out.printf ("\n El cociente de %d / %d es= %d\n",numero1,numero2,resultado);//imprime la respuesta
                
        resultado=numero1%numero2;// hace el calculo residuo
        System.out.printf ("\n el resuduo %d / %d es= %d\n",numero1,numero2,resultado);//imprime la respuesta
                
        //resultado=Math.log(numero1);// hace el calculo logaritmo
        System.out.printf("\nEl logaritmo en base %d es= ", numero1 );
        System.out.println (Math.log(numero1));//imprime la respuesta
                
        //resultado=Math.pow(numero1,numero2);// hace el calculo potencia
        System.out.printf("\nLa potencia de %d a la %d es= ", numero1,numero2 );
        System.out.println (Math.pow(numero1,numero2));//imprime la respuesta
        

    }
}
