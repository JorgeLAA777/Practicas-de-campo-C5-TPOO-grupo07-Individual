/**
 * 
 */
package caso3_sobrecarga_metodos;

import java.util.Scanner;
/**
 * Clase: PrincipalOperacion
 * Funcion: Ingreso de datos y llamamiento de metodos para presentar resultados, muestra la sobrecarga de metodos sumar()
 * Contenido: Objeto creado, Scanner, metodo sumar() llamado
 */


public class PrincipalOperacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner ingresoDatScan = new Scanner(System.in); // Scanner para leer datos ingresados
		Operacion operac = new Operacion(); // Crear Objeto Operacion
		
		// Ingreso de dos datos enteros 
		System.out.println("=============================");
		System.out.println("Ingresar dos datos enteros");
		System.out.println("=============================");
		System.out.print("Ingresar primer enteros : ");
		int entero1 = ingresoDatScan.nextInt();  // Ingreso de datos enteros.
		System.out.print("Ingresar segundo enteros : ");
		int entero2 = ingresoDatScan.nextInt();  // Ingreso de datos enteros.
		System.out.println("-------------------------------");
		
		// Ingreso de dos datos Double
		System.out.println("\n=============================");
		System.out.println("Ingresar datos decimales");
		System.out.println("=============================");
		System.out.print("Ingresar primer valor decimal: ");
		double decimal1 = ingresoDatScan.nextDouble();  // Ingreso de datos double.
		System.out.print("Ingresar segundo valor decimal: ");
		double decimal2 = ingresoDatScan.nextDouble();  // Ingreso de datos double.
		System.out.println("-------------------------------");
		
		//Ingreso de tres datos enteros
		System.out.println("\n=============================");
		System.out.println("Ingresar tres datos enteros");
		System.out.println("=============================");
		System.out.print("Ingresar primer valor entero: ");
		int enteroA = ingresoDatScan.nextInt();    // Ingreso de dato entero A.
		System.out.print("Ingresar segundo valor entero: ");
		int enteroB = ingresoDatScan.nextInt();    // Ingreso de dato entero B.
		System.out.print("Ingresar tercer valor entero: ");
		int enteroC = ingresoDatScan.nextInt();    // Ingreso de dato entero C.
		System.out.println("-------------------------------");
		
		// Metodo llamado para presentar el resultado mostrando la sobrecarga de metodos sumar()
		System.out.println("\n=============================");
		System.out.println("==========RESULTADO==========");
		System.out.println("=============================");
		System.out.println("Suma de dos valores enteros  : " + operac.sumar(entero1, entero2));
		System.out.println("Suma de dos valores decimales: " + operac.sumar(decimal1, decimal2));
		System.out.println("Suma de tres valores enteros : " + operac.sumar(enteroA, enteroB, enteroC));
		System.out.println("=============================");
		ingresoDatScan.close();  // Cerrar Scanner

	}

}
