package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class ConcreteStrategyRandom implements GeneradorStrategy{
	
	
	public String obtenerNumeroLibre(SortedSet<String> lineasTelefono) {
		return  new ArrayList<String>(lineasTelefono)
				.get(new Random().nextInt(lineasTelefono.size()));
	}
}



