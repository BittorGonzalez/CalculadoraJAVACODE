package menu;
import java.util.Scanner;

/**
 * 
 * @author BittorG
 * @version 1.1
 *
 */
public class Menu {
    private static Scanner teclado = new Scanner(System.in);
    
    /**
     * Funcion que pide valores para operar mas adelante
     * @return Devuelve un array de operandos
     */
    public int[] pedirNumeros(){
        int[] ret = new int[2];
        System.out.print ("Operando 1: ");
        ret [0] = teclado.nextInt();
        System.out.print ("Operando 2: ");
        ret [1] = teclado.nextInt();
        return ret;
    }
    
    /**
     * Funcion que pide un tipo de operacion
     * @return Devuelve la operacion elegida por el usuario
     */
    public String menuOpciones() {
        String ret = "";
        do {
            System.out.print ("Operaciones [+, -, *, /, %]: ");
            ret = teclado.next();
        } while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) ||
                (ret.equalsIgnoreCase("*")) || (ret.equalsIgnoreCase("/")) ||
                (ret.equalsIgnoreCase("%"))
                ));
                return ret;
    }
    
    /**
     * Funcion que pide repetir la ejecucion o no
     * @return Devuelve la respuesta afirmartiva o negativa del usuario
     */
    public boolean repetir(){
        boolean ret = false;
        String respuesta;
        do {
            System.out.print ("�Desea continuar trabajando con la calculadora? [s / n]");
            respuesta = teclado.next();
        } while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))
                    ));
                    
        if (respuesta.equalsIgnoreCase("s")){
            ret = true;
        }
        return ret;
    }
}