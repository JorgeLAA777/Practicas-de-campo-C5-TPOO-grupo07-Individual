/**
 * 
 */
package caso2_clasepersona;

/**
 * Clase:
 * Funcion:
 * Contenido:
 */
public class PrincipalPersona {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Persona.muestraCabecera(); // Muestra la cabecera
		Persona person1 = new Persona("Jorge", 21);  // Primer objeto
		Persona person2 = new Persona("Luis", 22);   // Segundo objeto
				
		// Metodos llamados		
		person1.mostrarDatos();  //Muestra datos del objeto 1
		person2.mostrarDatos();  //Muestra datos del objeto 2
		

	}

}
