package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class ConcreteStrategyPrimero implements GeneradorStrategy{
	
	public String obtenerNumeroLibre(SortedSet<String> lineas) {
		return lineas.first();
	}
}

