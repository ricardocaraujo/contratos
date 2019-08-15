package br.com.petrobras.exp.modelo;

public enum Competencia {
	
	DIRETORIA_EXECUTIVA("Diretoria Executiva"),
	GERENTE_EXECUTIVO("Gerente Executivo"),
	GERENTE_GERAL("Gerente Geral"),
	GERENTE("Gerente");
	
	private String valor;
	
	Competencia (String valor) {
		this.valor = valor;
	}
	
	public String getValor() {
		return this.valor;
	}

}
