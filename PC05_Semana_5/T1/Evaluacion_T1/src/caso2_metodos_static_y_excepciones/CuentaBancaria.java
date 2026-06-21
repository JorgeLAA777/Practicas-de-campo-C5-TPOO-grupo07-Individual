/**
 * 
 */
package caso2_metodos_static_y_excepciones;

/**
 * 
 */
public class CuentaBancaria 
{
	// ====Atributo privado==== Cada cuenta contiene su saldo ---JLAA 
	private double saldoCuenta;
	private double saldoTotDep;   // ****
	
	// ====Atributo estatico==== Estos es para el contador ---JLAA
	private static int contadorCuenta  = 0;
	
	
	// ====Constructor==== Para inicializar la cuenta con saldo inicial  ---JLAA
	public CuentaBancaria(double saldoInicial) 
	{
		if (saldoInicial < 0) 
		{
			// Condicional para activar la validacion si el saldo inicial en CERO o negativo
			throw new IllegalArgumentException(" Saldo inicial no puede ser negativo");
		}
		this.saldoCuenta = saldoInicial;
		contadorCuenta++;
	}
	
	// =====Metodo depositar para ingresar dinero=====
	public void depositar(double montoCuenta) 
	{
		// Condicional para activar la validacion si el monto en CERO o negativo
		if (montoCuenta <= 0) 
		{
			// Validacion si el monto es menor que cero
			throw new IllegalArgumentException("Su deposito tiene que ser mayor que cero.");
			
		}
		saldoCuenta = saldoCuenta + montoCuenta; // Operacion suma para el saldo actual
		saldoTotDep = saldoCuenta; // Saldo total despues del deposito*
	}
	
	// =====Metodo depositar para retirar dinero===== ---JLAA
	public void retirar(double montoCuenta) throws Exception 
	{
		if (montoCuenta <= 0) 
		{
			// Validacion cuando se desea retirar en cero o negativo ---JLAA
			throw new IllegalArgumentException("Su retiro tiene que ser mayor que cero.");
		}
		if (montoCuenta > saldoCuenta) 
		{
			throw new Exception("Su Fondo es insuficiente");
		}
		saldoCuenta = saldoCuenta - montoCuenta;  // Operacion resta para el saldo actual
		
	}
	
	// =======Metodo get========= Usado para consultar saldo
	public double getSaldoCuenta() 
	{
		return saldoCuenta;
	}
	
	//=======Metodo static======== Usado para consultar la cantidad de cuentas
	public static int getContadorCuenta() 
	{
		return contadorCuenta;
	}
	
	// =======Metodo get========= Usado para consultar saldo inicial despues de depositar
	public double getSaldoCuentaINI() //Saldo total despues del deposito*
	{
		return saldoTotDep;  // Saldo total despues del deposito*
	}   
	
}
