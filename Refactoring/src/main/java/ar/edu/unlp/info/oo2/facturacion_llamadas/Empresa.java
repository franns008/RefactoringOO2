package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa { 
	private List<Cliente> clientes ;
	private GestorNumerosDisponibles guia ;	

	
	public Empresa() {
		super();
		this.clientes = new ArrayList<Cliente>();
		this.guia = new GestorNumerosDisponibles();
	}

	public String obtenerNumeroLibre() {
		return guia.obtenerNumeroLibre();
	}
	
	public void agregarNumeroTelefono(String numero) {
		this.guia.agregarNumeroTelefono(numero);
	}
	
	public Juridico registrarUsuarioJuridico(String cuit, String nombre) {
		Juridico cliente = new Juridico(nombre,this.obtenerNumeroLibre(),cuit);
		this.clientes.add(cliente);
		return cliente;
		
	}
	public Fisico registrarUsuarioFisico(String dni, String nombre) {
		Fisico cliente = new Fisico(nombre,this.obtenerNumeroLibre(),dni);
		this.clientes.add(cliente);
		return cliente;
	}

	public Internacional registrarLlamadaInternacional(Cliente origen, Cliente destino, int duracion) {
		Internacional llamada = new Internacional (origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		origen.registrarLlamada(llamada);
		return llamada;
	}
	
	public Nacional registrarLlamadaNacional(Cliente origen, Cliente destino, int duracion) {
		Nacional llamada = new Nacional (origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		origen.registrarLlamada(llamada);
		return llamada;
	}

	public double calcularMontoLlamadasCliente(Cliente cliente) { 
		return cliente.calcularMontoLlamadas();
	}

	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	}

	public GestorNumerosDisponibles getGestorNumeros() {
		return this.guia;
	}
}

