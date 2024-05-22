package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Fisico  extends Cliente{

	private String dni;
	static double descuento = 0;
	public Fisico(String nombre, String numeroTelefono, String dni) {
		super( nombre, numeroTelefono);
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}
	
	public double getDescuento() {
		return this.descuento;
	}
	
}


