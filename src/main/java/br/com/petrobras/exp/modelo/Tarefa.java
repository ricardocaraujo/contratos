package br.com.petrobras.exp.modelo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Tarefa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String descricao;
	
	@ManyToOne
	private Atividade atividade;
	
	private int duracao;
	
	@JoinTable(name="ContratacaoTarefa")
	@OneToMany
	private Contratacao contratacao;
	
	private Empregado responsavel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public Contratacao getContratacao() {
		return contratacao;
	}

	public void setContratacao(Contratacao contratacao) {
		this.contratacao = contratacao;
	}

	public Empregado getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Empregado responsavel) {
		this.responsavel = responsavel;
	}
	
	

}