/**
 * 
 */
package caso2_clasepersona;

/**
 * Clase: Clase Persona
 * Funcion: Representa a una persona identificado por nombre y edad
 * Contenido: Atributos, constructor, Metodos
 */
public class Persona 
{
	//Atributos
	private String nombre;	// Atributo encapsulado
	private int edad;  // Atributo encapsulado
	
	//Constructor que inicializa los atributos	
	public Persona(String nombre, int edad)
	{
		this.nombre = nombre;		
		this.edad = edad;
	} 
	
	// Metodo que muestra la cabecera
	public static void muestraCabecera()
	{
		System.out.printf("%-10s %-5s%n", "Nombre", "Edad");
		System.out.println("===================");
	}
	
	// Metodos para mostrar la fila con la informacion de la persona	
	public void mostrarDatos() 
	{			
		System.out.printf("%-10s %-5d %n", nombre, edad);
		
	}
	
	

}
