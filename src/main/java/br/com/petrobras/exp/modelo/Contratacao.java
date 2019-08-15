package br.com.petrobras.exp.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Contratacao {
	
	
	@Id
	private int id;
	
	private String codigo;
	
	private String nome;
	
	@Enumerated
	private Competencia competencia;
	
	@Enumerated
	private Situacao situacaoAtual;
	
	@ManyToMany
	private List<Situacao> situacoes;
	

	public Contratacao() {
		// TODO Auto-generated constructor stub
	}

}
