package br.com.petrobras.exp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.petrobras.exp.modelo.Atividade;

@Repository
public class AtividadeDao implements Dao<Atividade> {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Atividade buscaPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Atividade> lista() {
		TypedQuery<Atividade> tp = em.createNamedQuery("Atividade.findAll", Atividade.class);
		List<Atividade> atividades = (List<Atividade>) tp.getResultList();
		return atividades;
	}

	@Override
	public void adiciona(Atividade t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Atividade t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void altera(Atividade t) {
		// TODO Auto-generated method stub
		
	}


}
