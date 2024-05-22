package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa { //CLASE DIOS
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();

 //raro 
	

	public boolean agregarNumeroTelefono(String str) {//mal olor nombre de parametro no se entiende
		boolean encontre = guia.getLineas().contains(str);//Aca envidia de atributo
		if (!encontre) { 
			guia.getLineas().add(str);//Aca envidia de atributo
			encontre= true;
			return encontre;
		}
		else {
			encontre= false;
			return encontre;
		}
	}

	public String obtenerNumeroLibre() {
		return guia.obtenerNumeroLibre();
	}

	public Juridico registrarUsuarioJuridico(String cuit, String nombre) {
		return  new Juridico(nombre,this.obtenerNumeroLibre(),cuit);
	}
	public Fisico registrarUsuarioFisico(String dni, String nombre) {
		return new Fisico(nombre,this.obtenerNumeroLibre(),dni);	
	}

	public Internacional registrarLlamadaInternacional(Cliente origen, Cliente destino, int duracion) {
		Internacional llamada = new Internacional (origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		llamadas.add(llamada);
		origen.registrarLlamada(llamada);
		return llamada;
	}
	
	public Nacional registrarLlamadaNacional(Cliente origen, Cliente destino, int duracion) {
		Nacional llamada = new Nacional (origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		origen.registrarLlamada(llamada);
		return llamada;
	}

	public double calcularMontoTotalLlamadas(Cliente cliente) { 
		double c = 0; // temporary field 
		for (Llamada l : cliente.llamadas) {
			double auxc = 0;
			auxc += l.calcularPrecioLlamada();
			auxc -=  auxc*cliente.getDescuento();
			c += auxc;
		}
		return c;
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
