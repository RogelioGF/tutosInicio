package poo;

public class UsoCuenta {

	public static void main(String[] args) {
		CuentaCorriente Cuenta1 = new CuentaCorriente(1500, "Pepe Perez");
		CuentaCorriente Cuenta2 = new CuentaCorriente(1600, "Maria Hernandez");
		
		CuentaCorriente.transferencia(Cuenta1, Cuenta2, 200);
		
		System.out.println(Cuenta1.toString());
		System.out.println(Cuenta2.toString());
	}

}
