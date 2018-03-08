package br.tatuapu.model;

public class Quina extends Jogo {

	public static String[] cartela;

	public Quina(String[] numeros) {
		super(numeros);
		// TODO Auto-generated constructor stub
	}

	public Quina(Integer qtdNum) {
		// TODO Auto-generated constructor stub
		super(geraJogo(qtdNum));
	}

	@Override
	public Integer getQtdNumeros() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getCartela() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jogo getNewJogo(String[] saida) {
		// TODO Auto-generated method stub
		return null;
	}

}
