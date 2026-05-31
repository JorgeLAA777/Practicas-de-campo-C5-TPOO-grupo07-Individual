/**
 * 
 */
package caso1_calculadora;

import java.util.Scanner;

/**
 * Clase: Clase principal Calculadora
 * Funcion: Esta clase permite el ingreso de dos numeros, seleccionar opcion para operar y mostrar el resultado.
 * Contenido: Contiene condicional switch
 */
public class Calculadora 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner entradaScan = new Scanner(System.in); //Scanner para leer datos del usuario.
		OperacionesCalcu  op = new OperacionesCalcu(); // Instancia de la clase Operaciones.
		
		System.out.println("Ingrese dos numeros");
		System.out.println("======================== ");
		System.out.print("Numeros a: ");
		int a = entradaScan.nextInt();  // Ingreso del primer valor numerico.
		System.out.print("Numeros b: ");
		int b = entradaScan.nextInt();  // Ingreso del segundo valor numerico.
		
		System.out.println("Seleccione la operacion: ");
		System.out.println("======================== ");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicacion");
		System.out.println("4. Division");
		System.out.println("======================== ");
		System.out.print("Numero de opcion: ");
		int opcion = entradaScan.nextInt();   // Ingreso de la opcion seleccionada
		System.out.println("======================== ");
		
		// Estructura condicional switch 
		switch(opcion) {
		case 1: System.out.println("Resultado de la suma: " + op.sumar(a, b));break;
		case 2: System.out.println("Resultado de la resta: "+ op.restar(a, b));break;
		case 3: System.out.println("Resultado de la multiplicacion: "+ op.multiplicar(a, b));break;
		case 4: System.out.println("Resultado de la division: "+ op.dividir(a, b));break;
		default: System.out.println("Opcion errada");
		
		entradaScan.close();	// Liberador de recursos o de memoria.
		}
		
	}

}
