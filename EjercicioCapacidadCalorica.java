
/**
 * Write a description of class EjercicioCapacidadCalorica here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EjercicioCapacidadCalorica
{
 

    public static void main (String[] argv)
    {
        Scanner entrada = new Scanner(System.in);
        int agua;
        int temperatura;
        int resultado;
        System.out.print("\nEscriba la cantidad de agua: ");
        agua=entrada.nextInt();
        
        System.out.print("Escriba la temperatura que desea aumentar: ");
        temperatura=entrada.nextInt();
        
        resultado=agua*1000*temperatura;// hace el calculo suma
        System.out.printf ("\n La energia necesaria es= %d\n",resultado);//imprime la respuesta
        
        /*resultado=numero2-numero1;// hace el calculo diferencia
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
        */

    }
}
  
