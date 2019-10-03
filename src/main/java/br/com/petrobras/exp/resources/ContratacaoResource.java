package br.com.petrobras.exp.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.thoughtworks.xstream.XStream;

import br.com.petrobras.exp.dao.ContratacaoDao;
import br.com.petrobras.exp.modelo.Contratacao;

@Path("contratacao")
public class ContratacaoResource {
	
	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String buscaContratacaoPorId(@PathParam("id") long id) {
		Contratacao contratacao = (Contratacao) new ContratacaoDao().buscaPorId(id);
		return new XStream().toXML(contratacao);
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String listaContratacoes() {
		List<Contratacao> contratacoes = (List<Contratacao>) new ContratacaoDao().lista();
		return new XStream().toXML(contratacoes);
	}
	
	@GET
	@Path("prepara_contratacao")
	@Produces(MediaType.APPLICATION_XML) {
		
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public Response adicionaContratacao(String c) {
		Contratacao contratacao = (Contratacao) new XStream().fromXML(c);
		new ContratacaoDao().adiciona(contratacao);
		return Response.ok().build();
	}
	

}
