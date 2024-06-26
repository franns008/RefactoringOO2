package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract  class Cliente {
	protected List<Llamada> llamadas; 
	private String nombre;
	private String numeroTelefono;

	public Cliente(String nombre, 
			String numeroTelefono) {
		super();
		llamadas = new ArrayList<Llamada>();
		this.nombre = nombre;
		this.numeroTelefono = numeroTelefono;
	}
	
	public double calcularMontoLlamadas() {
		return this.llamadas.stream()
				.mapToDouble(llamada -> llamada.calcularPrecioLlamada()
							-llamada.calcularPrecioLlamada()*this.getDescuento())
				.sum();
	}
	
	public Llamada registrarLlamada(Llamada llamada) {
		this.llamadas.add(llamada);
		return llamada;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	
	public abstract double getDescuento();
}

