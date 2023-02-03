package operaciones;

/**
 * 
 * @author BittorG
 * @version 1.1
 *
 */
public class Operaciones{
	
	/**
	 * 
	 * @param valor1 primer operando
	 * @param valor2  segundo operando
	 * @return suma de los dos operandos
	 */
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    
	/**
	 * 
	 * @param valor1 primer operando
	 * @param valor2  segundo operando
	 * @return resta de los dos operandos
	 */
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    
	/**
	 * 
	 * @param valor1 primer operando
	 * @param valor2  segundo operando
	 * @return multiplicacion de los dos operandos
	 */
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    
	/**
	 * 
	 * @param valor1 primer operando
	 * @param valor2  segundo operando
	 * @return division de los dos operandos
	 */
    public int dividir (int valor1, int valor2) throws ArithmeticException{
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    
	/**
	 * 
	 * @param valor1 primer operando
	 * @param valor2  segundo operando
	 * @return el resto de la division entre los dos operandos
	 */
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}