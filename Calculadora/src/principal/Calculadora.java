package principal;


import menu.Menu;
import operaciones.Operaciones;

/**
 * 
 * @author BittorG
 * @version 1.1
 *
 */
public class Calculadora{
	
	/**
	 * 
	 * Ejecuta todo el codigo evaluando excepciones aritmeticas
	 * 
	 */ 
    public static void main(String[] args) {   
        int resultado = 0;
        String operacion = "";
        int[] operandos = new int [2];
        Menu menu = new Menu();
        Operaciones operaciones = new Operaciones();
    
        
        do{
            operandos = menu.pedirNumeros();
            operacion = menu.menuOpciones();
            
            
            
            	if (operacion.equalsIgnoreCase("+")){
            		resultado = operaciones.sumar(operandos[0], operandos[1]);
            		System.out.println ("Resultado: " + resultado);
            	} else if (operacion.equalsIgnoreCase("-")){
                	resultado = operaciones.restar(operandos[0], operandos[1]);
                	System.out.println ("Resultado: " + resultado);
            	} else if (operacion.equalsIgnoreCase("*")){
                	resultado = operaciones.multiplicar(operandos[0], operandos[1]);
                	System.out.println ("Resultado: " + resultado);
            	} else if (operacion.equalsIgnoreCase("/")){
            		try {
            			resultado = operaciones.dividir(operandos[0], operandos[1]);
                    	System.out.println ("Resultado: " + resultado);
            		}catch (ArithmeticException e){
            			System.out.println("ERROR, " + e.getMessage());
            			System.out.println("No se puede dividir entre 0");
            		}
                	
            	} else if (operacion.equalsIgnoreCase("%")){
                	resultado = operaciones.resto(operandos[0], operandos[1]);
                	System.out.println ("Resultado: " + resultado);
            	} else {
                	System.out.println ("Operacion no valida");
            	}
            
           
        }   while (menu.repetir());
    }
}