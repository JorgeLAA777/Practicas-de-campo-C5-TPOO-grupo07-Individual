/**
 * 
 */
package caso5_lista_estudiantes;

import java.util.Scanner;

/**
 * Clase: PrincipalLista
 * Funcion: Permitir el ingreso de nombres de estudiantes y muestra una lista completa y si hay un error, muestra mensaje 
 * Contenido: Manejo de try-catch, bucle for, creacion de objeto lista, uso de Scanner
 */
public class PrincipalLista {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Lista lista = new Lista(); // Creacion de Objeto Lista
		Scanner scan = new Scanner(System.in);  // Permite la lectura de los datos ingresados
		
		// Manejo de excepciones o de errores
		try 
		{
			System.out.print("Cantidad de estudiantes a registrar: ");
			int num = scan.nextInt();
			scan.nextLine();  // Limpiar el salto de linea pendiente.
			
			for(int i = 0; i < num; i++ ) // Bucle for que permite la cantidad de registros deseados
			{
				System.out.print("Nombre del Estudiante " + (i+1) +": ");  // para indicar el numero de ingreso
				String nombreEstudiante =scan.nextLine();  // Variable que guarda el nombre del estudiante
				lista.agregar(nombreEstudiante);				
			}
		} catch(Exception e) //Si atrapa un error lo menciona
		{
			System.out.println("======================================");
			System.out.println("Error en ingreso de datos: No es un numero valido");
		}
		System.out.println("======================================");
		lista.mostrar(); //Muestra la lista
		scan.close();  // Liberador de recursos o de memoria.

	}

}
