package br.com.petrobras.exp.modelo;

import javax.persistence.Id;

public class Gerencia {
	
	@Id
	private int id;
	
	private String nome;

	public Gerencia(String nome) {
		super();
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
