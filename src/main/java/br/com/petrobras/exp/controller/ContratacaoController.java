package br.com.petrobras.exp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.petrobras.exp.client.AtividadeClient;
import br.com.petrobras.exp.client.ContratacaoClient;
import br.com.petrobras.exp.dao.AtividadeDao;
import br.com.petrobras.exp.dao.ContratacaoDao;
import br.com.petrobras.exp.modelo.Atividade;
import br.com.petrobras.exp.modelo.Contratacao;

@Controller
@Transactional
public class ContratacaoController {
	
	@Autowired
	@Qualifier("contratacaoDao")
	private ContratacaoDao contratosDao;
	
	//@Autowired
	//private AtividadeDao atividadesDao;
	/*	
	public ContratacaoController( ContratacaoDao contratosDao) {
		this.contratosDao = contratosDao;
		this.atividadesDao = atividadesDao;
	}*/
	
	@RequestMapping(value="salvaContratacao")
	public String listaContratacoes(@ModelAttribute Contratacao contratacao, Model model) {
		this.contratosDao.adiciona(contratacao);
		List<Contratacao> contratacoes = contratosDao.lista();
		model.addAttribute("contratacoes", contratacoes);
		return "lista_contratacoes";
	}
	
	@RequestMapping(value="adicionaContratacao") 
	public String cadastroContratacao(Model model) {
		List<Atividade> atividades = new AtividadeClient().lista();
		model.addAttribute("atividades", atividades);
		return "adiciona_contratacao";
	}
		
	
	
	

}