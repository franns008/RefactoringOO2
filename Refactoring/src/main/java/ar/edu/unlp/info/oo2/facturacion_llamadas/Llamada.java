package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {

	private String origen;
	private String destino;
	private int duracion;
	private static final double IVA = 0.21;
	public Llamada(String origen, String destino, int duracion) {
		this.origen= origen;
		this.destino= destino;
		this.duracion = duracion;
	}
	
	
	public abstract double calcularPrecioLlamada();
	
	public double calcularIva(double precioPorSegundo) {
		return duracion*precioPorSegundo*IVA;
	}
	
	public String getRemitente() {
		return destino;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public String getOrigen() {
		return origen;
	}
}


