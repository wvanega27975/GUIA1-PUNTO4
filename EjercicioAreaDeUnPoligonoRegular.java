/**
 * Write a description of class EjercicioAreaDeUnPoligonoRegular here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class EjercicioAreaDeUnPoligonoRegular
{

    public static void main (String[] argv)
    {
        Scanner entrada = new Scanner(System.in);
        double s;
        int m;
        double resultado;
        
        System.out.print("\nEscriba la longitod de un lado del poligino: ");
        s=entrada.nextDouble();
        
        System.out.print("Escriba el numero de lados del poligono: ");
        m=entrada.nextInt();
        
        resultado=Math.pow(s,2);// calculo de la potencia
        resultado=((resultado*m)/(4*Math.tan(3.1416/m)));
        System.out.print("\nEl area del poligino es= ");
        System.out.println(resultado);//imprime la respuesta
        
    }
}
  
