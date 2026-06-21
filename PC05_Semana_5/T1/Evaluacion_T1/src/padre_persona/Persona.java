/**
 * 
 */
package padre_persona;

/**
 * 
 */
// >>> Clase Persona es la clase Padre <<<
public class Persona 
{
	// >>> Encapsulamiento <<<  JLAA
	// >>> Atributos protegidos  <<< JLAA
	protected String nombre, apellido;   
	protected int edad, DNI;
	
	// >>> Constructor vacio <<<  JLAA
	public Persona()
	{
		
	}
	
	// >>> Constructor parametrizado <<<  JLAA
	public Persona(String nombre, String apellido, int edad, int DNI ) 
	{		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.DNI = DNI;		
	}
	
	
	// >>> Metodo que muestra los datos de la clase persona <<<  JLAA
	public String mostrarDatosPersona()
	{
		return 
				"Nombre	: " + nombre + "\n" +
				"Apellido: " + apellido + "\n" +
				"Edad	: " + edad + "\n" +
				"DNI	: " + DNI;
	}
	
	// >>> Metodo  que muestra mensaje <<<   JLAA
	public String actividad() 
	{
		return ">>> Realizo una actividad <<<";
	}
}
