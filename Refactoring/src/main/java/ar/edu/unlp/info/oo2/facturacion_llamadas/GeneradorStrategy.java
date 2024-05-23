package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.SortedSet;

public interface GeneradorStrategy {
	
	public String obtenerNumeroLibre(SortedSet<String> lineasTelefono);
	
}

