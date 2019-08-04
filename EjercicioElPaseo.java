
/**
 * Calcular el costo de un viaje.
 *
 * @author (WVANEGAS)
 * @version (1_20190802)
 */
import java.util.Scanner;
 
public class EjercicioElPaseo
{
    public static void main (String[] argv)
    {
        Scanner entrada = new Scanner(System.in);
        int gordos;
        int flacos;
        int dias;
        int puestos=60;
        int buses;
        int comida=10000;
        int platos;
        int habitaciones;
        int ocupacion=4;
        int hotel=25000;
        
        
        System.out.print ("\nIngrese la cantidad de estudiantes gordos: ");
        gordos=entrada.nextInt();
                      
        System.out.print ("Ingrese la cantidad de estudiantes flacos: ");
        flacos=entrada.nextInt();
        
        System.out.print ("Ingrese la cantidad de dias que durara el paseo: ");
        dias=entrada.nextInt();
        
        // BUSES REQUERIDOS
        
        buses=(gordos*2+flacos)/puestos;
        if((gordos*2+flacos)%puestos!=0)
        {
            buses=buses+1;
        }
        System.out.printf ("\nLa cantidad de buses requerida seria de: %d\n", buses);//imprime la respuesta de la cantidad de buses
        
        // CANTIDAD Y VALOR DE PLATOS
        
        platos=(gordos*5+flacos*3)*dias;
        System.out.printf ("\nLa cantidad de platos requerida querida para el viaje es de: %d", platos);//imprime la cantidad de platos
        platos= platos*10000;
        System.out.printf ("\nLa valor de los platos para el viaje es de: $%d\n", platos);////imprime el valor de los platos
        
        // CANTIDAD Y VALOR DE LAS HABITACIONES
        habitaciones=(gordos+flacos)/ocupacion;
        if((gordos+flacos)%ocupacion!=0)
        {
            habitaciones=habitaciones+1;
        }
        System.out.printf ("\nLa cantidad de habitaciones requeridas seria de: %d\n", habitaciones);//imprime la cantidad de habitaciones
        
        habitaciones=habitaciones*25000;
        
        System.out.printf ("La valor de las habitaciones por dia es de: $%d\n", habitaciones);//imprime el valor de las habitaciones
        
        // COSTO TOTAL DEL PASEO
        
        dias=platos+habitaciones*dias;
        System.out.printf ("\nEL VALOR TOTAL DEL VIAJE SERIA DE: $%d\n", dias);//imprime costo total del viaje
        
    }
}
