package br.com.petrobras.exp.dao;

import java.util.List;

public interface Dao<T> {

	
	T buscaPorId(Long id);
	List<T> lista();
	void adiciona(T t);
	void remove(T t);
	void altera(T t);
	
}
