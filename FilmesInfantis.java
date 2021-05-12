package trabalho;

public class FilmesInfantis extends Filmes {
	
	private boolean extrasComBrincadeiras;
	
	public FilmesInfantis(String nome, int ano, boolean jogos) {
		super(nome, ano, "infantil");
		this.extrasComBrincadeiras= jogos;
	}
	public boolean isExtrasComBrincadeiras() {
		return extrasComBrincadeiras;
	}
	
	@Override
	public void bonus(int vezesAlugadas) {
		
		if(vezesAlugadas >= 3) {
			System.out.println("O cliente alugou mais de 3 filmes infantis, no final desta compra recebe bonus!!");
		}
		
	}
	public void exibe() {
		super.exibe();
		System.out.println("Filme possui extras: "+extrasComBrincadeiras);
	}
}
