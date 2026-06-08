/**
 * 
 */
package caso1_calculadora;

/**
 * Clase: OperacionesCalcu
 * Funcion: Realizar operaciones matematicas.
 * Contenido: contiene metodos que permite realizar operaciones matematicas basicas.
 */
public class OperacionesCalcu 
{
	/** Metodo para sumar dos enteros*/
	public int sumar(int a, int b) 
	{
		return a + b;
	} 
	
	/** Metodo para restar dos enteros*/
	public int restar(int a, int b) 
	{
		return a - b;
	}
	
	/** Metodo para multiplicar dos enteros*/
	public int multiplicar(int a, int b) 
	{
		return a * b;
	}
	
	/** Metodo para dividir dos enteros y mostrar en decimal mientras que el denominador sea diferente de CERO*/
	public double dividir(int a, int b) 
	{
		if (b != 0) 
		{
			
			return (double)a / b;
		}
		else 
		{
			return 0;
		}	
		
	}

}
