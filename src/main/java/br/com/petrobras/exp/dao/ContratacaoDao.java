package br.com.petrobras.exp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.petrobras.exp.modelo.Contratacao;

@Repository
public class ContratacaoDao implements Dao<Contratacao> {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Contratacao buscaPorId(Long id) {
		return em.find(Contratacao.class, id);
	}

	@Override
	public List<Contratacao> lista() {
		TypedQuery<Contratacao> tq = em.createNamedQuery("Contratacao.findAll", Contratacao.class);
		List<Contratacao> contratacoes = tq.getResultList();
		return contratacoes;
	}

	@Override
	public void adiciona(Contratacao contratacao) {
		em.persist(contratacao);	
	}

	@Override
	public void remove(Contratacao contratacao) {
		Contratacao c = em.find(Contratacao.class, contratacao.getId());
		em.remove(c);
	}

	@Override
	public void altera(Contratacao contratacao) {
		em.merge(contratacao);
	}

		
	

}
