/**
 * 
 */
package colecciones;

import java.util.Scanner;

/**
 * 
 */
public class InventarioPrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		Inventario inventario = new Inventario();
		
		//inventario.agregar(producto, cant);
		
		System.out.print("Indicar numero de productos a registrar: ");
		int numero = scan.nextInt();
		scan.nextLine();
		
		for (int i = 0; i < numero; i++) 
		{
			System.out.println("\nProducto No. " + (i + 1));
			
			System.out.print("Nombre de producto: ");
			String nombre = scan.nextLine();
			
			System.out.print("Cantidad: ");
			int cantidad = scan.nextInt();
			scan.nextLine();
			
			inventario.agregar(nombre, cantidad);
			
			
		}
		
		System.out.println("\n----Inventario-----");
		inventario.mostrar();
		
		scan.close();
		
		

	}

}
