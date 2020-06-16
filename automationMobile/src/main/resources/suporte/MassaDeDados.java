package suporte;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import constants.Globals;

public class MassaDeDados {

	static int contador = 0;
	static int miliseconds = 200;
	static String tag;

	public static void lerMassaDeDados(String nomeArquivo) throws Exception {
		Globals.TAG = nomeArquivo;
		Globals.MASSA_DADOS = (JSONObject) lerJson().get(Globals.SEGMENTO);
	}

	public static JSONObject lerJson() throws java.io.IOException, ParseException {

		JSONObject obj;
		JSONParser parser = new JSONParser();
		FileReader f = null;
		try {
			 f = new FileReader(Globals.PATH + Globals.TAG +".json");	
		} catch (Exception e) {
			 f = new FileReader(Globals.PATH + "massaDados" +".json");
		}finally {
			obj = (JSONObject) parser.parse(f);
		}
		
		

		return obj;
		
	}
	
	
	

}
