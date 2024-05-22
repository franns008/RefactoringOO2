package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Nacional  extends Llamada{

	private static final int PRECIO_POR_SEGUNDO = 3;
	public Nacional(String origen, String destino, int duracion) {
		super( origen, destino, duracion);
	}
	
	public double calcularPrecioLlamada() {
		return this.getDuracion()* PRECIO_POR_SEGUNDO + this.calcularIva(PRECIO_POR_SEGUNDO);
	}
	
}


