package br.com.petrobras.exp.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import br.com.petrobras.exp.modelo.Contratacao;

public class ContratacaoClient {
	
	private Client client;
	private WebTarget webtarget;
	private 
	
	public ContratacaoClient() {
		this.client = ClientBuilder.newClient();
		this.webtarget = client.target("http://localhost:8080");
	}
	
	public void adicionaContratacao(Contratacao contratacao) {
		
	}
	

}
