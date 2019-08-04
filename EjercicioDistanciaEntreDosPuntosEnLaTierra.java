
/**
 * Write a description of class EjercicioDistanciaEntreDosPuntosEnLaTierra here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EjercicioDistanciaEntreDosPuntosEnLaTierra
{
  public static void main (String[] argv)
    {
        Scanner entrada = new Scanner(System.in);
        int ta;
        int ga;
        int tb;
        int gb;
        double distancia;
        double distanci;
        System.out.print("\nEscriba la latitud del primer punto: ");
        ta=entrada.nextInt();
        
        System.out.print("Escriba la longitud del primer punto: ");
        ga=entrada.nextInt();
        
        System.out.print("Escriba la latitud del segudo punto ");
        tb=entrada.nextInt();
        
        System.out.print("Escriba la longitud del segundo punto: ");
        gb=entrada.nextInt();
        
        //distancia=6371.07*((Math.asin(Math.sin(ta))*Math.sin(tb))+((Math.cos(ta)*Math.cos(tb)*(Math.cos(ga-gb)))));
        distancia=(Math.asin(Math.sin(ta))*Math.sin(tb));
        distanci=(Math.cos(ta)*Math.cos(tb)*Math.cos(ga-gb));

        
        System.out.print("\n El resultado de la suma es= \n");//imprime la respuesta
        System.out.println(distancia);
        System.out.println(distanci);
        
    }
 
}
