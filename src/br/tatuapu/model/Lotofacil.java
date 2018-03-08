package br.tatuapu.model;

public class Lotofacil extends Jogo {
	
	//combinações possíveis = 15/25 3.268.760
	//						  16/25 2.042.975
	//						  17/25 1.081.575
	//						  18/25 480.700	

	public static final String[] cartela = new String[] {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25"};
	
	private final Integer qtdNumeros;
	public Lotofacil(String[] numeros) {
		super(numeros);		
		this.qtdNumeros = numeros.length;
	}
	public Lotofacil(Integer qtdNum) {
		super(geraJogo(qtdNum));
		this.qtdNumeros = qtdNum;
	}
	public Integer getQtdNumeros() {
		return qtdNumeros;
	}
	public String[] getCartela() {
		return this.cartela;
	}
	@Override
	public Jogo getNewJogo(String[] saida) {
		return new Lotofacil(saida);
	}

}
