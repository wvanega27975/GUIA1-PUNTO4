
/**
 * Write a description of class EjercicioViajeASasaima here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EjercicioViajeASasaima
{
  public static void main (String[] argv)
    {
        Scanner entrada = new Scanner(System.in);
        int capacidad;
        int consumo;
        int carga;
        int viajes;
        int gasolina=10000;
        int distancia = 160;
                
        System.out.print ("\nIngrese la capacidad del camion en kg: ");
        capacidad=entrada.nextInt();
        
        System.out.print ("Ingrese el peso de la carga en kg: ");
        carga=entrada.nextInt();
        
        System.out.print ("Ingrese el consumo de galones de combustible del camion por kilometro: ");
        consumo=entrada.nextInt();
        
        // VIAJES NECESARIOS
        
        viajes=(carga)/capacidad;
        if((carga)%capacidad!=0)
        {
            viajes=viajes+1;
        }
        System.out.printf ("\nLa cantidad de viajes requeridos serian: %d", viajes);//imprime la respuesta de la cantidad de viajes
      
        // CONSUMO DE CONBUSTIBLE
        consumo=consumo*viajes*distancia;
        System.out.printf ("\El consumo total de combustible es de: %d galones \n", consumo);////imprime el valor de los platos
        
        // VALOR DEL COMBUSTIBLE
        
        gasolina=gasolina*consumo;
        
        System.out.printf ("La costo del combustible es de: $%d\n", gasolina);//imprime el valor del combustible
        
        
    }
  
}
