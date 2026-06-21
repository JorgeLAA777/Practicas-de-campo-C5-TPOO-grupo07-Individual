/**
 * 
 */
package hijas_estudiante_docente;

import padre_persona.Persona;  // Se usa para importa para traer la clase Persona del paquete padre_persona
/**
 * 
 */

// >>> Clase Estudiante es la clase hija de la clase Padre Persona <<<
public class Estudiante extends Persona 
{
	// >>> Atributos de la clase Estudiante  <<< JLAA
	private String carrera;
	private String ciclos;
	
	// >>> Constructor vacio <<<  JLAA
	public Estudiante() 
	{
		
	}
	
	// >>> Constructor parametrizado <<<  JLAA
	public Estudiante(String nombre, String apellido, int edad, int DNI, String carrera, String ciclos)
	{
		super(nombre, apellido, edad, DNI);
		this.carrera = carrera;
		this.ciclos = ciclos;		
	}
	
	// >>> Metodo que muestra los datos de la clase Estudiante <<<  JLAA
	public String mostrarDatosCompletos()
	{	
		return 
				mostrarDatosPersona() + "\n-----Datos-Propios----------------" + "\n" +
				"Carrera del Estudiante	: " + carrera + "\n" +
				"Ciclo de Estudios	: " + ciclos;
	}
	
	// >>> Metodo  que muestra mensaje <<<   JLAA
	public String actividad() 
	{
		return ">>> Realizo una actividad el cual es Estudiar en la universidad <<<";
	}
	
}
