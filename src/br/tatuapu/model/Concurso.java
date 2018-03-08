package br.tatuapu.model;

import java.util.Date;

public class Concurso {

	private final Integer nroConcurso;
	private final Date dataSorteio;
	private final Jogo jogo;
	
	public Concurso(Integer nroConcurso, Date dataSorteio, Jogo jogo) {
		this.nroConcurso = nroConcurso;
		this.dataSorteio = dataSorteio;
		this.jogo = jogo;
	}

	public Integer getNroConcurso() {
		return nroConcurso;
	}

	public Date getDataSorteio() {
		return dataSorteio;
	}

	public Jogo getJogo() {
		return jogo;
	}
}
