package br.com.petrobras.exp.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
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
	private List<ContratacaoTarefa> contratacoesTarefas;
	
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

<<<<<<< HEAD
	public List<Contratacao> getContratacoes() {
		return contratacoes;
	}

	public void setContratacoes(List<Contratacao> contratacoes) {
		this.contratacoes = contratacoes;
	}

=======
>>>>>>> branch 'master' of https://github.com/ricardocaraujo/Contratos.git
	public Empregado getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Empregado responsavel) {
		this.responsavel = responsavel;
	}

	public List<ContratacaoTarefa> getContratacoesTarefas() {
		return contratacoesTarefas;
	}

	public void setContratacoesTarefas(List<ContratacaoTarefa> contratacoesTarefas) {
		this.contratacoesTarefas = contratacoesTarefas;
	}

}