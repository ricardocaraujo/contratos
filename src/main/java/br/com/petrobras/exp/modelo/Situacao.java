package br.com.petrobras.exp.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Situacao {
	
	
	@Id
	private int id;
	
	private String descricao;
	
	private Gerencia responsavel;

	public Situacao() {
		// TODO Auto-generated constructor stub
	}

}
