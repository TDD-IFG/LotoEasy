package br.tatuapu.util;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import br.tatuapu.model.Jogo;

public class ArquivoJogos {
	
	private static final String srcBase = Contexto.DATADIR;
	private static String nmArquivo;
	
	public ArquivoJogos(Jogo jogo) {
		SimpleDateFormat formatoData = new SimpleDateFormat("ddMMyyyy");
		Calendar data = Calendar.getInstance();
		nmArquivo = jogo.getClass().getSimpleName() +"-"+ formatoData.format(data.getTime()) + ".dat";
	}
	
	/**
	 * @param palavras
	 */
	public static void salvaJogos(ArrayList<Jogo> jogos){
        try{
            FileOutputStream arquivoGrav = new FileOutputStream(srcBase + nmArquivo);
            ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);

		    //Grava o objeto mesas no arquivo
		    objGravar.writeObject(jogos);
		    objGravar.flush();
	
		    objGravar.close();
		    arquivoGrav.flush();
	
		    arquivoGrav.close();
		}catch(Exception e){
	        e.printStackTrace();
		}
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

