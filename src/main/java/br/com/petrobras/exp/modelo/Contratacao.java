package br.com.petrobras.exp.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
	@NamedQuery(name="Contratacao.findAll", query="select c from Contracao c")
})

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


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Competencia getCompetencia() {
		return competencia;
	}


	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}


	public Situacao getSituacaoAtual() {
		return situacaoAtual;
	}


	public void setSituacaoAtual(Situacao situacaoAtual) {
		this.situacaoAtual = situacaoAtual;
	}


	public List<Situacao> getSituacoes() {
		return situacoes;
	}


	public void setSituacoes(List<Situacao> situacoes) {
		this.situacoes = situacoes;
	}

	
	
}
