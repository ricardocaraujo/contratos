package br.com.petrobras.exp.dao;

import br.com.petrobras.exp.modelo.Gerencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class GerenciaDao implements Dao<Gerencia> {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Gerencia buscaPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Gerencia> lista() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void aciona(Gerencia gerencia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Gerencia gerencia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void altera(Gerencia gerencia) {
		// TODO Auto-generated method stub
		
	}

	
	
}
