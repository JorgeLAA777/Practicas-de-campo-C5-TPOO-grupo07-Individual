/**
 * 
 */
package caso1_fundamento_de_poo;

/**
 * 
 */
public class PrincipalEstudiante {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Creacion de objetos
		// Ingreso de los registros de 3 estudiantes con uso del constructor  ---JLAA
		
		Estudiante estudiante1 = new Estudiante("Jorge", 27, "Ingenieria Sistema");
		Estudiante estudiante2 = new Estudiante("Luis", 21, "Ingenieria Software");
		Estudiante estudiante3 = new Estudiante("July", 20, "Contabilidad");
		
		System.out.println("========================");
		System.out.println("==Lista de Estudiantes==");
		
		// Muestra los datos de los estudiantes ---JLAA
		estudiante1.muestraDatos();
		estudiante2.muestraDatos();
		estudiante3.muestraDatos();
		
		System.out.println("========================");
		

	}

}
