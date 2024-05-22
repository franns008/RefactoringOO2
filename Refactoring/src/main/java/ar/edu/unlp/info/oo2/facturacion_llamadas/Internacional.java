package ar.edu.unlp.info.oo2.facturacion_llamadas;
import ar.edu.unlp.info.oo2.facturacion_llamadas.Llamada;

public class Internacional extends Llamada{
	
	private static final int PRECIO_POR_SEGUNDO = 150;
	private static final int PRECIO_POR_ESTABLECER_LLAMADA = 50;
	
	public Internacional (String origen, String destino, int duracion) {
		super(origen, destino, duracion);
	}
	
	public double calcularPrecioLlamada() {
		return this.getDuracion()* PRECIO_POR_SEGUNDO  + this.calcularIva(PRECIO_POR_SEGUNDO )+PRECIO_POR_ESTABLECER_LLAMADA;
	}
	
}



