/**
 * 
 */
package caso3_sobrecarga_metodos;

/**
 * Clase: Operacion
 * Funcion: Demuestra la sobrecarga de metodos
 * Contenido: 
 */
public class Operacion 
{
	/** Metodo sumar con dos enteros */
	public int sumar(int a, int b) 
	{
		return a + b;
	}
	
	/** Metodo sumar con dos double */
	public double sumar(double a, double b) 
	{
		return a + b;
	}
	
	/** Metodo sumar con tres enteros */
	public int sumar(int a, int b, int c) 
	{
		return a + b + c;
	}
	
}
