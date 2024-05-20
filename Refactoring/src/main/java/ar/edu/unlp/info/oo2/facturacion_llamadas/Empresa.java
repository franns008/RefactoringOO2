package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa { //CLASE DIOS
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();

	static double descuentoJur = 0.15; //raro 
	static double descuentoFis = 0;

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

	public Cliente registrarUsuario(String data, String nombre, Juridico tipo) {

		return tipo = new Juridico(nombre,this.obtenerNumeroLibre(),data);
	}
	public Cliente registrarUsuario(String data, String nombre, Fisico tipo) {
		return tipo = new Fisico(nombre,this.obtenerNumeroLibre(),data);
		
	}

	public Llamada registrarLlamada(Cliente origen, Cliente destino, String t, int duracion) {
		Llamada llamada = new Llamada(t, origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		llamadas.add(llamada); // envidia de atributo
		origen.llamadas.add(llamada); // envidia de atributo
		return llamada;
	}

	public double calcularMontoTotalLlamadas(Cliente cliente) { //POR CADA LLAMADA PREGUNTA EL TIPO Y SEGUN
		//EL TIPO ASIGNA VALOR. ENVIDIA DE ATRIBUTOS
		double c = 0; // temporary field 
		for (Llamada l : cliente.llamadas) { // malo olor, se puede usar un stream  Y METODO LARGO
			double auxc = 0;
			if (l.getTipoDeLlamada() == "nacional") { // MAL OLOR: condicionales 
				// el precio es de 3 pesos por segundo más IVA sin adicional por establecer la llamada
				auxc += l.getDuracion() * 3 + (l.getDuracion() * 3 * 0.21);// primitive obsession mal olor
			} else if (l.getTipoDeLlamada() == "internacional") {
				// el precio es de 150 pesos por segundo más IVA más 50 pesos por establecer la llamada
				auxc += l.getDuracion() * 150 + (l.getDuracion() * 150 * 0.21) + 50;
			}

			if (cliente.getTipo() == "fisica") {
				auxc -= auxc*descuentoFis;
			} else if(cliente.getTipo() == "juridica") {
				auxc -= auxc*descuentoJur;
			}
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
