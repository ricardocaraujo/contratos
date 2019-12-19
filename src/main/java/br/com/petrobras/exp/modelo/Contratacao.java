package br.com.petrobras.exp.modelo;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamedQueries({
	@NamedQuery(name="Contratacao.findAll", query="select c from Contratacao c")
})

@Entity
public class Contratacao {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String codigo;
	
	private String nome;
	
	@Enumerated(EnumType.STRING)
	private Competencia competencia;
	
	@Enumerated(EnumType.STRING)
	private Situacao situacaoAtual;
	
	@ManyToMany
	private List<Situacao> situacoes;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataInicioServico;
	
	@JoinTable(name="ContratacaoTarefa")
	@OneToMany 
	private List<ContratacaoTarefa> contratacoesTarefas;


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
