
/**
 * Calcular el Area y el Volumen.
 *
 * @author (WVANEGAS)
 * @version (1_20190802)
 */
import java.util.Scanner;

public class EjercicioAreaVolumen
{
    public static void main (String[] argv)
    {
        Scanner entrada = new Scanner(System.in);
        int altura;
        int base;
        int largo;
        int resultado;
        
        System.out.print ("\n Ingrese la altura: ");
        altura=entrada.nextInt();
        
        System.out.print("Ingrese la base: ");
        base=entrada.nextInt();
        
        System.out.print("Ingrese el largo: ");
        largo=entrada.nextInt();
        
        // Base * Altura = Area
        resultado=base*altura;// hace el calculo Area
        if(resultado!=0)
            {
                System.out.printf ("\n El resultado del area es: %d\n", resultado);//imprime la respuesta
            }
            else
            {
             System.out.println("\n------Error: El objeto no cuenta con datos minimos para calcular el AREA, ingrese la base y altura ------\n");   
            }
        // Base * Altura*largo = Volume
        if( resultado !=0 )
         {
                resultado=base*altura*largo;// hace el calculo Area
                if( resultado !=0 )
                {                
                    System.out.printf ("\n El resultado del Volumen es: %d\n", resultado);//imprime la respuesta
                
                }
                else
                {
                    System.out.println("\n Para calcular el VOLUMEN ingrese lo largo del objeto\n");
                }
        }
        else
        {
            System.out.println("                    INTENDE DE NUEVO\n");
        }

    }  
}
