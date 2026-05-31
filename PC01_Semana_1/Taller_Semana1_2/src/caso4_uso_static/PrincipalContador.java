/**
 * 
 */
package caso4_uso_static;

/**
 * Clase: PrincipalContador
 * Funcion: Crea objetos y muestra la cantidad de objetos creados
 * Contenido: Objetos creados, llamamiento del metodo estatico
 */
public class PrincipalContador 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		new Contador(); // primer objeto
		new Contador(); // segundo objeto
		new Contador(); // tercer objeto
		new Contador(); // cuarto objeto
		
		System.out.println("Cantidad de objetos creados");
		System.out.println("===========================");
		// Muestra la cantidad de objetos creados
		System.out.println("Objeto creados: " + Contador.getContador());

	}

}
