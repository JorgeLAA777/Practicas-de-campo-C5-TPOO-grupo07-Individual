/**
 * 
 */
package colecciones;

import java.util.HashMap;
/**
 * 
 */
public class Inventario {
	
	private HashMap<String, Integer> productos = new HashMap<>();
	
	public void agregar(String nombre, int cantidad ) 
	{
		productos.put(nombre, cantidad);
	}
	
	public void mostrar() 
	{
		for (String clave : productos.keySet()) 
		{
			System.out.println(clave + ": " + productos.get(clave));
		}
	}

}
