package trabalho;

import java.util.HashMap;

public class Locadora {
	
	private HashMap<String, Filmes> filmes;
	
	public Locadora() {
		filmes = new HashMap<>();
	}

	public boolean insere(Filmes f) {
		
		if (filmes.containsKey(f.getNome()))
			return false;
		
		filmes.put(f.getNome(), f);
		return true;
	}
	
	public void exibeTodos() {
		
		for (Filmes f: filmes.values()) {
			System.out.println(f+": ");
			f.exibe();
		}
	}
	public void exibeGenero(String genero) {
		
		for(Filmes f: filmes.values()) {
			
			if(f.getGenero() == genero)
				System.out.println(f+": ");
		}
	}
	public boolean remove(String nome) {
		
		for (Filmes f: filmes.values()) {
			if(f.getNome() == nome) {
				filmes.remove(nome);
				return true;
			}
		}
		return false;
	}
	public boolean aluga(int vezesAlugadas, String nome){
			for(Filmes f: filmes.values()) {
			
			if(f.getNome() == nome && f.isAlugado() == false) {
				f.bonus(vezesAlugadas);
				f.setAlugado(true);
				return true;
			}
		}
			return false;
	}
	public boolean devolve(String nome){
		for(Filmes f: filmes.values()) {
		
		if(f.getNome() == nome && f.isAlugado() == true) {
			f.setAlugado(false);
			return true;
		}
	}
		return false;
}
}
