/**
 * 
 */
package manejo_de_errores;

import java.util.Scanner;

/**
 * 
 */
public class ValidacionEdad 
{
	public void ingresarEdad() 
	{
		Scanner scan = new Scanner(System.in);

	    try {
	        System.out.print("Edad: ");
	        int edad = scan.nextInt();

	        if (edad < 0) {
	            throw new IllegalArgumentException("Edad negativa no válida");
	        }

	        System.out.println("Edad correcta: " + edad);

	    } catch (IllegalArgumentException e) {
	        System.out.println("Error: " + e.getMessage());

	    } catch (Exception e) {
	        System.out.println("Error: dato inválido");

	    } finally {
	    	scan.close();
	        System.out.println("Fin del proceso");
	    }
	}
	
}
