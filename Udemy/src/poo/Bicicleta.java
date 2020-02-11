package poo;

public class Bicicleta {
	
	private String color;
	private Double precio;
	
	public Bicicleta(String color, Double precio) {
		this.color = color;
		this.precio = precio;
	}
	
	public void getPrecio() {
		
	}

	public void setPintar(String pintura) {
		this.color=pintura;
	}

	@Override
	public String toString() {
		return "Color de la Bicicleta= " + color + ", Precio= " + precio + "€";
	}
	
	
}
