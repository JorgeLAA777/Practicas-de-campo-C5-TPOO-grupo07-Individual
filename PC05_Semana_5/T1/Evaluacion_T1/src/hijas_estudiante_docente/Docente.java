/**
 * 
 */
package hijas_estudiante_docente;

import padre_persona.Persona;  // Se usa para importa para traer la clase Persona del paquete padre_persona
/**
 * 
 */

// >>> Clase Docentete es la clase hija de la clase Padre Persona <<<
public class Docente extends Persona   
{
	// >>> Atributos de la clase Docente  <<< JLAA
	private String asignatura;
	private String universidad;
		
	// >>> Constructor vacio <<<  JLAA
	public Docente() 
	{
		
	}
	
	// >>> Constructor parametrizado <<<  JLAA
	public Docente(String nombre, String apellido, int edad, int DNI, String asignatura, String universidad)
	{
		super(nombre, apellido, edad, DNI);
		this.asignatura = asignatura;
		this.universidad = universidad;
		
	}

	// >>> Metodo que muestra los datos de la clase Docente <<<  JLAA
	public String mostrarDatosCompletos()
	{		
		return 
				mostrarDatosPersona() + "\n" + "\n--------Datos-Propios---------------" + "\n" +
				"Asignatura del docente	: " + asignatura + "\n" +
				"Universidad del docente	: " + universidad;
	}
	
	// >>> Metodo  que muestra mensaje <<<   JLAA	
	public String actividad() 
	{
		return ">>> Realizo una actividad el cual es trabajar como docente en la universidad <<<";
	}
	
}
