package poo;

import java.util.*;

public class CuentaCorriente {


	public CuentaCorriente(double saldo, String nombreTitular) { //constructor de la clase
		this.saldo = saldo;
		this.nombreTitular = nombreTitular;
		Random aleatorio = new Random();
		numeroCuenta = Math.abs(aleatorio.nextLong());
	}

	private double saldo;
	private String nombreTitular;
	private long numeroCuenta;

	public void setIngreso(double ingreso) {
		if (ingreso<0) {
			System.out.println("El ingreso debe ser positivo ");
		}else {
			saldo += ingreso;	
		}
	}//setIngresos

	public void setReintegro(double reintegro) {
		if (reintegro>0) {
			System.out.println("El reintegro debe ser negativo");
		}else {
			saldo -= reintegro;
		}
	}
	public void getSaldo(double saldo) {
		System.out.println("El saldo es de: " + saldo);
	}
	
	public static void transferencia(CuentaCorriente titular1, CuentaCorriente titular2, double saldo) {
		
		titular1.saldo-=saldo;
		titular2.saldo+=saldo;
		
	}
	
	@Override
	public String toString() {
		return "Saldo actual de la cuenta corriente= " + saldo + "€\n Nombre del titular= " + nombreTitular + "\n Numero de cuenta= " + numeroCuenta;
	}

	

}
