package principal;


import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

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
	public static final Logger LOGGER = Logger.getLogger(Calculadora.class.getName());
    public static void main(String[] args) {   
        int resultado = 0;
        String operacion = "";
        int[] operandos = new int [2];
        Menu menu = new Menu();
        Operaciones operaciones = new Operaciones();
        Handler consoleHandler = null;
        Handler fileHandler = null;
    
        try {
        	
        	consoleHandler = new ConsoleHandler();
			fileHandler = new FileHandler("./operaciones.log");
			
			LOGGER.setUseParentHandlers(false);
			LOGGER.addHandler(consoleHandler);
			LOGGER.addHandler(fileHandler);
			
			consoleHandler.setLevel(Level.WARNING);
			fileHandler.setLevel(Level.ALL);
			LOGGER.setLevel(Level.ALL);
        	
        }catch (IOException e){
        	LOGGER.log(Level.WARNING, "ERROR en el filehandler", e);
        }
        
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
    					LOGGER.log(Level.FINE, "La ha operacion se ha completado" + resultado);

            		}catch (ArithmeticException e){
    					LOGGER.log(Level.WARNING, "No se puede dividir entre 0", e);

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