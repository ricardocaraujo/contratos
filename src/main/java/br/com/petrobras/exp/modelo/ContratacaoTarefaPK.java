package br.com.petrobras.exp.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ContratacaoTarefaPK implements Serializable {

	private static final long serialVersionUID = 1L;

	
	private Integer contratacaoId;
	
	private Integer tarefaId;

	public Integer getContratacaoId() {
		return contratacaoId;
	}

	public void setContratacaoId(Integer contratacaoId) {
		this.contratacaoId = contratacaoId;
	}

	public Integer getTarefaId() {
		return tarefaId;
	}

	public void setTarefaId(Integer tarefaId) {
		this.tarefaId = tarefaId;
	}
	
	
}
