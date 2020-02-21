package br.com.petrobras.exp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.petrobras.exp.client.AtividadeClient;
import br.com.petrobras.exp.client.ContratacaoClient;
import br.com.petrobras.exp.dao.AtividadeDao;
import br.com.petrobras.exp.dao.ContratacaoDao;
import br.com.petrobras.exp.modelo.Atividade;
import br.com.petrobras.exp.modelo.Contratacao;

@Controller
public class ContratacaoController {

	
	private ContratacaoDao contratosDao;
	private AtividadeDao atividadesDao;
	
	@Autowired
	public ContratacaoController(ContratacaoDao contratosDao, 
									AtividadeDao atividadesDao) {
		this.contratosDao = contratosDao;
		this.atividadesDao = atividadesDao;
	}
	
	@RequestMapping("listaContratacoes")
	public String listaContratacoes(Model model) {
		List<Contratacao> contratacoes = contratosDao.lista();
		model.addAttribute("contratacoes", contratacoes);
		return "listaContratacoes";
	}
	
	@RequestMapping("adicionaContratacaoForm") 
	public String adicionaContratacaoForm(Model model) {
		List<Atividade> atividades = this.atividadesDao.lista();
		model.addAttribute("atividades", atividades);
		return "adicionaContratacao";
	}
	
	@RequestMapping("adicionaContratacao")
	public void adicionaContratacao(Contratacao contratacao) {
		System.out.println(contratacao.getNome());
	}

}