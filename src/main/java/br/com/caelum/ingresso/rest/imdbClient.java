package br.com.caelum.ingresso.rest;

import org.apache.log4j.Logger;

import br.com.caelum.ingresso.model.Filme;

public class imdbClient {

	private Logger logger = Logger.getLogger(ImdbClient.class);
	
	public Optional<DetalhesDoFilme> request(Filme filme){
		
		RestTemplate client = new RestTemplate();
		
		String titulo = filme.getNome().replace(" ", "+");
		
		String url = String.format("http://www.", titulo);
	}
	
}
