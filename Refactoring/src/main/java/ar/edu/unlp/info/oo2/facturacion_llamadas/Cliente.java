package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract  class Cliente {
	private List<Llamada> llamadas; // esto es public
	private String nombre;
	private String numeroTelefono;
	// NO TIENE CONSTRUCTOR, clase anemica mal olor

	public Cliente(String nombre, 
			String numeroTelefono) {
		super();
		llamadas = new ArrayList<Llamada>();
		this.nombre = nombre;
		this.numeroTelefono = numeroTelefono;
	}
	
	public Llamada registrarLlamada(Cliente destino,String telefono, int duracion) {
		Llamada llamada = new Llamada(this,destino,telefono,duracion);
		this.llamadas.add(llamada);
		return llamada;
	}

	public String getNombre() {
		return nombre;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

}

