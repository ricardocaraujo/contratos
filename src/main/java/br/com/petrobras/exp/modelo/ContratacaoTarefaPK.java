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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contratacaoId == null) ? 0 : contratacaoId.hashCode());
		result = prime * result + ((tarefaId == null) ? 0 : tarefaId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContratacaoTarefaPK other = (ContratacaoTarefaPK) obj;
		if (contratacaoId == null) {
			if (other.contratacaoId != null)
				return false;
		} else if (!contratacaoId.equals(other.contratacaoId))
			return false;
		if (tarefaId == null) {
			if (other.tarefaId != null)
				return false;
		} else if (!tarefaId.equals(other.tarefaId))
			return false;
		return true;
	}

}
