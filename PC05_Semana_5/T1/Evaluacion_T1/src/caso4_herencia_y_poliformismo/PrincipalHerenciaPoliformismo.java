/**
 * 
 */
package caso4_herencia_y_poliformismo;

import padre_persona.Persona;  // Se usa para importa para traer la clase Persona del paquete padre_persona
import hijas_estudiante_docente.Estudiante;  // Se usa para importa para traer la clase Estudiante del paquete hijas_estudiante_docente
import hijas_estudiante_docente.Docente;  // Se usa para importa para traer la clase Estudiante del paquete hijas_estudiante_docente



/**
 * 
 */
// Clase Principal - Aqui se muestra la Herencia y Polimorfismo
public class PrincipalHerenciaPoliformismo 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Poliformismo de asignacion
		Persona PEstud = new Estudiante();
		Persona PDocent = new Docente();
		
		// Intanciacion o creacion de objetos
		Persona Person = new Persona ("Jor", "Alv", 21, 777777777);
		Estudiante Estud = new Estudiante ("Luis", "Alva", 18, 33333333, "Ingenieria", "5");
		Docente Docent = new Docente ("Raul", "Alvatrez", 35, 44444444, "Matematicas","UPN" );
		
		// Invocacion de metodo PERSONA (De la Clase Padre)
		System.out.println("==========================");
		System.out.println("=========PERSONA==========");
		System.out.println("==========================");
		
		System.out.println("-----------Datos----------");
		System.out.println(Person.mostrarDatosPersona());
		System.out.println("");
		System.out.println("----------Mensaje---------");
		System.out.println(Person.actividad());
		System.out.println("");
		
		
		// Invocacion de metodo del objeto ESTUDIANTE (De la clase Hija)
		System.out.println("==========================");
		System.out.println("========ESTUDIANTE========");
		System.out.println("==========================");
		// Herencia : Datos heredados mas los propios
		System.out.println("-----Datos-Heredados------");
		System.out.println(Estud.mostrarDatosCompletos());
		System.out.println("");
		// Polimorfismo en Estudiante
		System.out.println("-------Polimorfismo-------");
		System.out.println(PEstud.actividad());
		System.out.println("");
		
		
		// Invocacion de metodo del objeto DOCENTE (De la clase Hija)		
		System.out.println("==========================");
		System.out.println("=========DOCENTE==========");
		System.out.println("==========================");
		// Herencia : Datos heredados mas los propios
		System.out.println("-----Datos-Heredados------");
		System.out.println(Docent.mostrarDatosCompletos());
		System.out.println("");
		// Polimorfismo en Estudiante
		System.out.println("-------Polimorfismo-------");
		System.out.println(PDocent.actividad());
		System.out.println("");

	}

}
