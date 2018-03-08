package br.tatuapu.controller;

import br.tatuapu.gerador.Gerador;
import br.tatuapu.model.Jogo;
import br.tatuapu.model.Lotofacil;
import br.tatuapu.model.MegaSena;
import br.tatuapu.model.Quina;
import br.tatuapu.util.ArquivoJogos;

public class Executor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Gerador gerador = new Gerador(new Lotofacil(new String[]
		// {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15"}));
		// Gerador gerador = new Gerador(new Lotofacil(new String[]
		// {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17"}));
		Gerador gerador = null;

		if (args.length == 0) {
			args = new String[2];
			args[0] = Integer.toString(1);
			args[1] = Integer.toString(4);
		}
		Jogo jogo = null;


			if (args[0].equals("1")) {
				// lotofácil
				jogo = new Lotofacil(new Integer(args[1]));
				gerador = new Gerador(jogo);
				
				System.out.println("Gerando Jogos para Lotofácil -->");
				System.out.println("Gerando jogos de " + args[1] + " combinações de uma cartela de "
						+ Lotofacil.cartela.length + " Números");
				gerador.run();
			} else if (args[0].equals("2")) {
				jogo = new MegaSena(new Integer(args[1]));
				gerador = new Gerador(jogo);   
				
				System.out.println("Gerando Jogos para MegaSena -->");
				System.out.println("Gerando jogos de " + args[1] + " combinações de uma cartela de "
						+ MegaSena.cartela.length + " Números");
				gerador.run();
			} else if(args[0].equals("3")) {
				jogo = new Quina(new Integer(args[1]));
				gerador = new Gerador(jogo);   
				
				System.out.println("Gerando Jogos para Quina -->");
				System.out.println("Gerando jogos de " + args[1] + " combinações de uma cartela de "
						+ Quina.cartela.length + " Números");
				gerador.run();
			}

		if (gerador != null) {
			System.out.println("Salvando em arquivo");
			ArquivoJogos aj = new ArquivoJogos(jogo);
			aj.salvaJogos(((Gerador) gerador).getJogosGerados());
		}
		System.out.println("Jogos gerados ->" + ((Gerador) gerador).getJogosGerados().size());

		// for(Jogo lf:gerador.getJogosGerados()) {
		// for(String i: lf.getNumeros()) {
		// System.out.print(i+"\t");
		// }
		// System.out.println("");
		// }

	}

}
