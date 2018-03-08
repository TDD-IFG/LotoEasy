package br.tatuapu.gerador;
import java.util.ArrayList;

import br.tatuapu.model.Jogo;
import br.tatuapu.model.Lotofacil;

public class Gerador implements Runnable {
	private ArrayList<Jogo> jogosGerados;
	private Jogo jogo;

	public Gerador(Jogo jogo) {
		this.jogosGerados = new ArrayList<Jogo>();
		this.jogo = jogo;
	}
	
	private void geraJogos(Jogo jogo) {
		try {
		String[] str =  jogo.getCartela();
        String [] saida;
 
        Combinacao comb1 = new Combinacao(str, jogo.getQtdNumeros()) ;
        while (comb1.hasNext()) {
            saida = comb1.next();
            this.jogosGerados.add(jogo.getNewJogo(saida));//usando strategy
        }		
		}catch(Exception e) {
			System.out.println("erro no gerador ->"+e.getMessage());
		}
	}

	public ArrayList<Jogo> getJogosGerados() {
		return jogosGerados;
	}

	@Override
	public void run() {
		geraJogos(this.jogo);		
	}
	
	
}
