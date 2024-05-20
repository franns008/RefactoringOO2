package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Fisico  extends Cliente{

	private String dni;

	public Fisico(String nombre, String numeroTelefono, String dni) {
		super( nombre, numeroTelefono);
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}
	
	
}
