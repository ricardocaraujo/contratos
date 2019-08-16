package br.com.petrobras.exp.dao;

import br.com.petrobras.exp.modelo.Gerencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

@Repository
public class GerenciaDao implements Dao<Gerencia> {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Gerencia buscaPorId(Long id) {
		return em.find(Gerencia.class, id);
	}

	@Override
	public List<Gerencia> lista() {
		TypedQuery<Gerencia> tq = em.createNamedQuery("Gerencia.findAll", Gerencia.class);
		List<Gerencia> gerencias = tq.getResultList();
		return gerencias;		
	}

	@Override
	public void aciona(Gerencia gerencia) {
		em.persist(gerencia);	
	}

	@Override
	public void remove(Gerencia gerencia) {
		em.persist(gerencia);
	}

	@Override
	public void altera(Gerencia gerencia) {
		em.merge(gerencia);

	}

	
	
}
