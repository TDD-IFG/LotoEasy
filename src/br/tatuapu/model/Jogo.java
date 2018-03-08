package br.tatuapu.model;

import java.io.Serializable;
import java.util.Arrays;

public abstract class Jogo implements Serializable{

	private final String[] numeros;
	
	public Jogo(String[] numeros) {
		this.numeros = numeros;		
	}
	
	public String[] getNumeros() {
		return this.numeros;
	}
	public abstract Integer getQtdNumeros();
	public abstract String[] getCartela();
	public abstract Jogo getNewJogo(String[] saida);//método para strategy
	
	@Override
	public String toString() {
		return "Jogo [numeros=" + Arrays.toString(numeros) + "]";
	}	
	
	public static String[] geraJogo(Integer qtdNum) {
		String[] numeros = new String[qtdNum];
		for(int i=0;i<qtdNum;i++)
			numeros[i]=""+i;
		return numeros;
	}
}
