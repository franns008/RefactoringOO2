package ar.edu.unlp.info.oo2.facturacion_llamadas	;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineasTelefonos;
	private GeneradorStrategy tipoGenerador;
		 
	public GestorNumerosDisponibles() {
		super();
		this.lineasTelefonos = new TreeSet<String>();
		this.tipoGenerador = new ConcreteStrategyUltimo();
	}

	public SortedSet<String> getLineas() {
		return lineasTelefonos;
	}

	public String obtenerNumeroLibre() {
		String lineasTelefono = this.tipoGenerador.obtenerNumeroLibre(lineasTelefonos);
		this.lineasTelefonos.remove(lineasTelefono);
		return lineasTelefono;
	}
	
	public boolean numeroTelefonoDisponible(String numeroTelefono) {
		return this.getLineas().contains(numeroTelefono);
	}
	
	public boolean agregarNumeroTelefono(String numeroTelefono) {
		if (this.numeroTelefonoDisponible(numeroTelefono)) { 
			this.getLineas().add(numeroTelefono);
			return true;
		}else {
			return false;
		}
	}

	public void cambiarTipoGenerador(GeneradorStrategy tipoGenerador) {
		this.tipoGenerador = tipoGenerador;
	}
}


