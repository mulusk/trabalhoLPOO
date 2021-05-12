package trabalho;

public abstract class Filmes {

	private String nome;
	private int ano;
	private String genero;
	private boolean alugado;
	
	public boolean isAlugado() {
		return alugado;
	}
	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}
	public Filmes(String nome, int ano, String genero) {
		this.nome= nome;
		this.ano= ano;
		this.genero= genero;
	}
	public String getNome() {
		return nome;
	}
	public int getAno() {
		return ano;
	}
	public String getGenero() {
		return genero;
	}
	public abstract void bonus(int vezesAlugadas);
	
	public void exibe() {
		System.out.println("Nome do filme: "+nome);
		System.out.println("Ano de lancamento : "+ano);
		System.out.println("Genero : "+genero);
	}
}
