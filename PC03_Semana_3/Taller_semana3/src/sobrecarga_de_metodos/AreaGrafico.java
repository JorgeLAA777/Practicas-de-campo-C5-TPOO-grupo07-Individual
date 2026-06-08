/**
 * 
 */
package sobrecarga_de_metodos;

/**
 * 
 */
public class AreaGrafico {
	
	public double calcularArea(double base) 
	{
		return base * base;
	}
	
	public double calcularArea(double base, double altura) 
	{
		return base * altura;
	}
	
	public double calcularArea(double base, double altura, boolean valorTriangulo) 
	{
		return (base * altura)/2;
	}

}
