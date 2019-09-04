package br.com.petrobras.exp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.petrobras.exp.dao.ContratosDao;
import br.com.petrobras.exp.modelo.Contratacao;

@Controller
public class ContratosController {

	private ContratosDao contratosDao;
	
	@Autowired
	public ContratosController(ContratosDao contratosDao) {
		this.contratosDao = contratosDao;
	}
	
	@RequestMapping("listaContratacoes")
	public String listaContratos (Model model) {
		List<Contratacao> contratacoes = contratosDao.lista();
		model.addAttribute("contratacoes", contratacoes);
		return "listaContratacoes";
	}
	
	@RequestMapping("adicionaContratacao") 
	public void adicionaContrato(Contratacao contratacao) {
		
	}

}