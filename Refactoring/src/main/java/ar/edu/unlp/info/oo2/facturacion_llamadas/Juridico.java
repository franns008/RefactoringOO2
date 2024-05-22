package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Juridico extends Cliente {
	private String cuit;
	static double descuento = 0.15;
	public Juridico(String nombre, String numeroTelefono, String cuit) {
		super(nombre, numeroTelefono);
		this.cuit = cuit;
	}

	public String getCuit() {
		return cuit;
	}
	
	public double getDescuento() {
		return this.descuento;
	}
}
