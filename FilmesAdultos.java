package trabalho;

public class FilmesAdultos extends Filmes {
	
	private boolean estudioAmador;
	
	public FilmesAdultos(String nome, int ano, boolean estudioAmador) {
		
		super(nome, ano, "Adulto");
		this.estudioAmador= estudioAmador;
	}

	@Override
	public void bonus(int vezesAlugadas) {
		
		if(vezesAlugadas >= 5) {
			System.out.println("Nesta compra o cliente recebe um filme de graca!!");
		}
	}

	public boolean isEstudioAmador() {
		return estudioAmador;
	}
	public void exibe() {
		super.exibe();
		System.out.println("Estudio amador: "+estudioAmador);
	}
}
