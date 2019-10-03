package br.com.petrobras.exp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.petrobras.exp.dao.ContratacaoDao;
import br.com.petrobras.exp.modelo.Contratacao;

@Controller
public class ContratacaoController {

	private ContratacaoDao contratosDao;
	
	@Autowired
	public ContratacaoController(ContratacaoDao contratosDao) {
		this.contratosDao = contratosDao;
	}
	
	@RequestMapping("listaContratacoes")
	public String listaContratacoes(Model model) {
		List<Contratacao> contratacoes = contratosDao.lista();
		model.addAttribute("contratacoes", contratacoes);
		return "listaContratacoes";
	}
	
	@RequestMapping("cadastroContratacao") 
	public void cadastroContratacao(Model model) {
		
	}

}