/**
 * 
 */
package caso1_fundamento_de_poo;

/**
 * 
 */
public class Estudiante 
{
	// ======Atributos privados o encapsulados=======JLAA
	private String nombre;
	private int edad;
	private String carrera;
	
	// =====Constructor para iniciar los atributos========JLAA
	public Estudiante(String nombre, int edad, String carrera)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.carrera = carrera;
	}
	
	// ====Metodo get y set=====JLAA
	
	// ---para nombre---
	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	// ====Metodo get y set=====JLAA
	// ---para edad---
	public int getEdad() 
	{
		return edad;
	}

	public void setEdad(int edad) 
	{
		this.edad = edad;
	}
	
	// ====Metodo get y set=====JLAA
	// ---para carrera---
	public String getCarrera() 
	{
		return carrera;
	}

	public void setCarrera(String carrera) 
	{
		this.carrera = carrera;
	}
	
	// ======Metodo que ayuda a mostrar los datos=======
	public void muestraDatos()
	{
		System.out.println("========================");
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Carrera: " + carrera);
	}	
		

}
