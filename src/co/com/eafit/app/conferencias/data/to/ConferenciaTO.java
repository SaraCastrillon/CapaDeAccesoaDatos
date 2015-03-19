package co.com.eafit.app.conferencias.data.to;

import java.io.IOException;
import java.io.ObjectOutput;
import java.util.Date;

import co.com.eafit.app.conferencias.data.base.ObjetoTO;

public class ConferenciaTO implements ObjetoTO {
	
	private String nombre;
	private String nombreConferencista;
	private String tipo;
	private Date fecha;
	private int sillasDisponibles;

	public ConferenciaTO() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreConferencista() {
		return nombreConferencista;
	}

	public void setNombreConferencista(String nombreConferencista) {
		this.nombreConferencista = nombreConferencista;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getSillasDisponibles() {
		return sillasDisponibles;
	}

	public void setSillasDisponibles(int sillasDisponibles) {
		this.sillasDisponibles = sillasDisponibles;
	}

	
}
