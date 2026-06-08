/**
 * 
 */
package sobrecarga_de_metodos;

import java.util.Scanner;
/**
 * 
 */

public class AreaPrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		double base;
		double altura;
		boolean valor;
		
		System.out.println("Que area desea hallar selecciones la opcion: ");
		System.out.println("1. cuadrado");
		System.out.println("2. rectangulo");
		System.out.println("3. triangulo");
		System.out.println("====================");
		System.out.print("Ingrese la opcion: ");
		int grafico = scan.nextInt();
		
		
		AreaGrafico areaGraf = new AreaGrafico();
		
		
		switch (grafico) 
		{					
	    	case 1:
	    		System.out.print("Ingresar la base: ");
	    		base = scan.nextDouble();
			
	    		System.out.println("Area de cuadrado   : " + areaGraf.calcularArea(base));
	    		break;
	        
	    	case 2:
	    		System.out.print("Ingresar la base: ");
	    		base = scan.nextDouble();
	    		System.out.print("Ingresar la altura: ");
	    		altura = scan.nextDouble();
			
	    		System.out.println("Area de rectangulo: " + areaGraf.calcularArea(base, altura));
	    		break;
	        
	    	case 3:
	    		System.out.print("Ingresar la base: ");
	    		base = scan.nextDouble();
	    		System.out.print("Ingresar la altura: ");
	    		altura = scan.nextDouble();
	    		valor = true;
			
	    		System.out.println("Area de triangulo  : " + areaGraf.calcularArea(base, altura, valor));
	    		break;
	    	default:
	    		System.out.println("No es la opcion");
		}
	        
		
		
		scan.close();
	}

}
