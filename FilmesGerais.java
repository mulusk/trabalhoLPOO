package trabalho;

public class FilmesGerais extends Filmes {

	public FilmesGerais(String nome, int ano, String genero) {
		super(nome, ano, genero);
	}
	public void bonus(int vezesAlugadas) {
		if(vezesAlugadas >= 4)
			System.out.println("Nesta compra o cliente ganha 15% de desconto!!");
	}
}
