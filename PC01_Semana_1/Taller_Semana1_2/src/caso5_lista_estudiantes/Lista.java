/**
 * 
 */
package caso5_lista_estudiantes;

import java.util.ArrayList;
/**
 * Clase: Lista
 * Funcion: Manejar la lista de estudiantes con ArrayList().
 * Contenido: Lista de estudiantes, metodos para agregar y mostrar estudiante
 */
public class Lista 
{
	private ArrayList<String> estudiante = new ArrayList<>(); // Lista de estudiante
	
	/**Metodo que sirve para agregar un estudiante*/
	public void agregar(String nombreEstudiante) 
	{
		estudiante.add(nombreEstudiante);
	}
	
	/**Metodo para mostrar a todos los estudiantes */
	public void mostrar() 
	{
		for (String estud : estudiante) 
		{
			System.out.println("Estudiante: "+ estud);
		}
	}
	
}
