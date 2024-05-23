package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class ConcreteStrategyUltimo implements GeneradorStrategy{
	
	public String obtenerNumeroLibre(SortedSet<String> lineasTelefono) {
		return lineasTelefono.last();
	}
}


