package br.com.petrobras.exp.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.thoughtworks.xstream.XStream;

import br.com.petrobras.exp.dao.AtividadeDao;
import br.com.petrobras.exp.modelo.Atividade;

@Path("atividade")
public class AtividadeResource {
	
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String lista() {
		List<Atividade> atividades = new AtividadeDao().lista();
		return new XStream().toXML(atividades);
	}

}
