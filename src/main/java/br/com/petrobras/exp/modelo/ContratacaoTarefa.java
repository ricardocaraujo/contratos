package br.com.petrobras.exp.modelo;

import java.util.Calendar;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ContratacaoTarefa {
	
	@EmbeddedId 
	private ContratacaoTarefaPK id;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataInicioPrevista;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataInicioReal;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataTerminoPrevista;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataTerminoReal;

	public ContratacaoTarefaPK getId() {
		return id;
	}

	public void setId(ContratacaoTarefaPK id) {
		this.id = id;
	}

	public Calendar getDataInicioPrevista() {
		return dataInicioPrevista;
	}

	public void setDataInicioPrevista(Calendar dataInicioPrevista) {
		this.dataInicioPrevista = dataInicioPrevista;
	}

	public Calendar getDataInicioReal() {
		return dataInicioReal;
	}

	public void setDataInicioReal(Calendar dataInicioReal) {
		this.dataInicioReal = dataInicioReal;
	}

	public Calendar getDataTerminoPrevista() {
		return dataTerminoPrevista;
	}

	public void setDataTerminoPrevista(Calendar dataTerminoPrevista) {
		this.dataTerminoPrevista = dataTerminoPrevista;
	}

	public Calendar getDataTerminoReal() {
		return dataTerminoReal;
	}

	public void setDataTerminoReal(Calendar dataTerminoReal) {
		this.dataTerminoReal = dataTerminoReal;
	}
	
	

}
