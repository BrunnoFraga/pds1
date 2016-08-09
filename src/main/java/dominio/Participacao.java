package dominio;

import java.math.BigDecimal;

public class Participacao {
	private Integer codParticipacao;
	private String personagem;
	private BigDecimal desconto;
	
	private Filme filme;
	private Artista artista;
	
	public void setArtista(Artista a){
		this.artista = a;
	}
	

	public void setFilme(Filme f){
		this.filme = f;
	}
	
}
