
/**
 * Write a description of class EjercicioEficienciaDeCombustible here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EjercicioEficienciaDeCombustible
{
    public static void main (String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double mpg;
        double lpk = 0.425144;
        double resultado;
        
        System.out.print("\nIngrese la eficiencia en millas por galon: ");
        String Ingreso = entrada.next();
        mpg = Double.parseDouble(Ingreso);
        resultado = mpg * lpk;
        
        System.out.print("\nLa convercion a litros por kilometro es= ");
        System.out.println(resultado);
        
    }
}
