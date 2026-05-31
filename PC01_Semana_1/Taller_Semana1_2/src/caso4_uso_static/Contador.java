/**
 * 
 */
package caso4_uso_static;

/**
 * Clase: Contador
 * Funcion: Muestra el uso de una variable static compartida.
 * Contenido: Clase, Variable estatica compartida, constructor, operador de incremento, metodo estatico
 */
public class Contador 
{
	private static int contador = 0;  // Variable estaticas compartida
	
	/** Constructor: 
	 * Cada vez que se crea un objeto, la variable contador se incrementara */
	public Contador()
	{
		contador++; // operador de incremento contador = contador + 1
	}
	
	/** Este es el metodo estatico que que siver para obtener el valor del contador.
	 * el "return" devolvera el numero total de la cantidad de objetos creados */
	public static int getContador() 
	{
		return contador;
	}
		
}
