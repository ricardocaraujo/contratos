package br.com.petrobras.exp.client;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.thoughtworks.xstream.XStream;

import br.com.petrobras.exp.modelo.Atividade;
import br.com.petrobras.exp.modelo.Contratacao;

public class ContratacaoClient {
	
	private Client client;
	private WebTarget webtarget;

	
	public ContratacaoClient() {
		this.client = ClientBuilder.newClient();
		this.webtarget = client.target("http://localhost:8080");
	}
	
	public void adicionaContratacao(Contratacao contratacao) {
		String contratacaoXml = new XStream().toXML(contratacao);
		Entity<String> entity = Entity.entity(contratacaoXml, MediaType.APPLICATION_XML);
		Response resposta = webtarget.path("/rest/contratacao").request().post(entity);		
	}
	
}
