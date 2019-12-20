package br.com.petrobras.exp.client;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import com.thoughtworks.xstream.XStream;

import br.com.petrobras.exp.modelo.Atividade;

public class AtividadeClient {
	
	
	private Client cliente;
	private WebTarget webtarget;
	
	public AtividadeClient() {
		this.cliente = ClientBuilder.newClient();
		this.webtarget = cliente.target("http://localhost:8080");
	}
	
	public List<Atividade> lista() {
		String atividadesXml = webtarget.path("/rest/atividade").request().get(String.class);
		List<Atividade> atividades = (ArrayList<Atividade>) new XStream().fromXML(atividadesXml);
		return atividades;
	}
	

}
