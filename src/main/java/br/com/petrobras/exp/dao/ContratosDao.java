package br.com.petrobras.exp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.petrobras.exp.modelo.Contratacao;

@Repository
public class ContratosDao implements Dao<Contratacao> {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Contratacao buscaPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contratacao> lista() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void aciona(Contratacao t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Contratacao t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void altera(Contratacao t) {
		// TODO Auto-generated method stub
		
	}

		
	

}
