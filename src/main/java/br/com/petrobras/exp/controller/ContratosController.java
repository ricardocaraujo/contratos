package br.com.petrobras.exp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.petrobras.exp.dao.ContratosDao;

@Controller
public class ContratosController {

	private ContratosDao contratosDao;
	
	@Autowired
	public ContratosController(ContratosDao contratosDao) {
		this.contratosDao = contratosDao;
	}
	
	@RequestMapping("listaContratos")
	public String listaContratos (Model model) {
		
		model.addAttribute("", arg1);
		return "aro";
	}

}
