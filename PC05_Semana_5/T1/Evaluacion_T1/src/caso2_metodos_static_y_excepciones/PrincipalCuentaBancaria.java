/**
 * 
 */
package caso2_metodos_static_y_excepciones;

import java.util.Scanner;
/**
 * 
 */
public class PrincipalCuentaBancaria {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		// =====Manejo de excepciones=====
		try 
		{
			// =====Ingresando cantidad de cuentas=====  ---JLAA
			System.out.print("¿Cuantas cuentas desea crear? : ");
			int cantCuentas = scan.nextInt();
			
			// =====Creacion de cuentas===== Segun lo solicitado por el usuario  ---JLAA
			// Uso del bucle FOR
			for (int i = 1; i <= cantCuentas; i++) 
			{
				System.out.println("\n================================");
				System.out.println("     ***Creando cuenta " + i + "***");
				System.out.println("================================");
				
				// -------Ingreso de saldo inicial-------
				System.out.print("Ingresar saldo inicial: ");
				double saldoInicial = scan.nextDouble();
				CuentaBancaria cuentaBanca = new CuentaBancaria(saldoInicial);
				
				// -------Ingreso de deposito-------
				System.out.print("Ingresar monto a depositar: ");
				double deposito = scan.nextDouble();
				cuentaBanca.depositar(deposito);
				
				// -------Impresion de saldo despues del deposito-------
				System.out.println("--------------------------------");
				System.out.println("Saldo actual de la cuenta " + i + ": " + cuentaBanca.getSaldoCuentaINI());   // Saldo total despues del deposito*
				System.out.println("--------------------------------");
				
				// -------Ingreso monto a retirar-------
				System.out.print("Ingresar monto para retirar: ");
				double retiro = scan.nextDouble();
				
				// -------Manejo de excepciones para retiro------- 
				try 
				{
					cuentaBanca.retirar(retiro);
				} catch (Exception e) 
				{
					System.out.println("Surgio un error al retirar: " + e.getMessage());
				}
				
				// -------Impresion saldo final-------
				System.out.println("################################");				
				System.out.println("Saldo final de la cuenta " + i + ": " + cuentaBanca.getSaldoCuenta());
				System.out.println("################################");	
				System.out.println(" ");	
								
			} 
			
			// -------Impresion de cuentas generadas------- Esto se presente despues del las operaciones de las cuentas
			System.out.println("================================");
			System.out.println("Cantidad de cuentas generadas: " + CuentaBancaria.getContadorCuenta());				
			System.out.println("================================");
			
		} catch (Exception e) 
		{
			// -------Impresion mensaje de ERROR------- Captura de mensaje de error
			System.out.println("*** ERROR: " + e.getMessage() + " ***");
		} finally
		{
			scan.close();  // Cierra el Scanner para liberar memoria o recursos
		}

	}

}
