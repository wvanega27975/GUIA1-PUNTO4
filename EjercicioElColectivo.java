
/**
 * Write a description of class EjercicioElColectivo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EjercicioElColectivo
{
   public static void main (String[] argv)
    {
        Scanner entrada = new Scanner(System.in);
        int cupo;
        int pasajeros;
        int pasaje=10000;
        int pago=2000;
        int viajes;
        int pagototal;
              
        
        System.out.print ("\nIngrese el cupo del colectivo: ");
        cupo=entrada.nextInt();
                      
        System.out.print ("Ingrese la cantidad de pasajeros: ");
        pasajeros=entrada.nextInt();
        
        
        // TOTAL DE VIAJES
        
        viajes=(pasajeros)/cupo;
        if((pasajeros)%cupo!=0)
        {
            viajes=viajes+1;
        }
        System.out.printf ("\nLa cantidad de viajes requeridos son: %d\n", viajes);//imprime la respuesta de la cantidad de viajes
        
        // TOTAL PAGOS PASAJEROS
        
        pagototal=pasajeros*pasaje;
        System.out.printf ("\nLa valor total pagado por los pasajeros es de: $%d\n",pagototal);////imprime el valor de los pasajes
        
        // CTOTAL PAGOS CONDUCTOS
        
        pagototal=pasajeros*pago;
        System.out.printf ("\nLa valor total pagado por el conductor es de: $%d\n",pagototal);////imprime el valor de los pasajes
        
    }
 
}
