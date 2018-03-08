package test.br.tatuapu.model;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import br.tatuapu.model.Concurso;
import br.tatuapu.model.Jogo;
import br.tatuapu.model.Lotofacil;

public class ConcursoTest {

	@Test
	public void test() throws ParseException {
		Jogo lf = new Lotofacil(new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"});
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		String dateInString = "31-08-1982";
		Date date = sdf.parse(dateInString);
		Concurso conc = new Concurso(1, date,lf);
		
		assertEquals(date, conc.getDataSorteio());
	}

}
