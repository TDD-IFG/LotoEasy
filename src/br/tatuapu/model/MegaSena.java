package br.tatuapu.model;

public class MegaSena extends Jogo {
	
	//combinações possíveis: 6/60 = 50.063.860
	//						 7/60 = 1.184.040
	//						 8/60 = 
	
	public static final String[] cartela = new String[] {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59","60"};
	//public static final String[] cartela = new String[] {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
	private final Integer qtdNumeros;

	public MegaSena(String[] numeros) {
		super(numeros);
		this.qtdNumeros = numeros.length;
	}
	public MegaSena(Integer qtdNum) {
		super(geraJogo(qtdNum));
		this.qtdNumeros = qtdNum;
	}
	
	@Override
	public Integer getQtdNumeros() {
		return this.qtdNumeros;
	}

	@Override
	public String[] getCartela() {
		return this.cartela;
	}

	@Override
	public Jogo getNewJogo(String[] saida) {
		return new MegaSena(saida);
	}
}
