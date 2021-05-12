package trabalho;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Locadora locadora= new Locadora();
		Scanner lerString = new Scanner(System.in);
		Scanner lerInt= new Scanner(System.in);
		Scanner lerBool= new Scanner(System.in);
		int op=0;
		String nome;
		int ano;
		String genero;
		boolean adicional;
		boolean controle;
		
		while(op != 7) {
			System.out.println("----------Sistema de locadora-----------");
			System.out.println("Opcao 1: Inserir novo filme no banco de dados");
			System.out.println("Opcao 2: Remover filme do banco de dados");
			System.out.println("Opcao 3: Exibir todos os filmes");
			System.out.println("Opcao 4: Exibir todos os filmes por genero");
			System.out.println("Opcao 5: Alugar filme");
			System.out.println("Opcao 6: Receber filmea");
			System.out.print("Opcao: ");
			
			op = ler.nextInt();
			
			if(op == 1) {
				System.out.print("Nome do filme: ");
				nome = lerString.nextLine();
				System.out.print("Ano: ");
				ano = lerInt.nextInt();
				System.out.print("Genero : ");
				genero= lerString.next();
				
				if(genero == "Infantil") {
					
					System.out.print("Contem DVD de extras com jogos?[Sim ou Nao] : ");
					nome= lerString.next();
					
					if(nome == "Sim")
						adicional= true;
					else 
						adicional= false;
					
					FilmesInfantis fi= new FilmesInfantis(nome, ano, adicional);
				
					controle= locadora.insere(fi);
				}
				if(genero == "Adulto") {
					
					System.out.print("O filme foi produzido por estudio amador?[Sim ou Nao] : ");
					nome= lerString.next();
					
					if(nome == "Sim")
						adicional= true;
					else 
						adicional= false;
					
					FilmesAdultos fa= new FilmesAdultos(nome, ano, adicional);
					controle= locadora.insere(fa);
				}
				else {
					FilmesGerais fg= new FilmesGerais(nome, ano, genero);
					controle= locadora.insere(fg);
				}
				
				if(controle == true)
					System.out.println("Filme inserido com sucesso!!");
				else
					System.out.println("Erro!! o filme ja existe no banco de dados");
			}
				if(op == 2) {
				
				System.out.print("Nome do filme: ");
				nome = lerString.nextLine();
				controle= locadora.remove(nome);
				
				if(controle == true)
					System.out.println("Filme removido com sucesso!!");
				else
					System.out.println("Erro!! o filme nao existe no banco de dados");
				
			}
			if(op == 3) {
				locadora.exibeTodos();
			}
			if(op == 4) {
				
				System.out.print("Genero : ");
				genero= lerString.nextLine();
				locadora.exibeGenero(genero);
			}
			if(op == 5) {
				System.out.print("Nome do filme: ");
				nome = lerString.nextLine();
				System.out.print("Quantidade de filmes alugadas por esse cliente: ");
				ano = lerInt.nextInt();
				
				controle= locadora.aluga(ano, nome);
				
				if(controle == true)
					System.out.println("Filme Alugado com sucesso!!");
				else
					System.out.println("Erro!! o filme nao existe no banco de dados ou ja foi alugado");
			}
			if(op == 6) {
				System.out.print("Nome do filme: ");
				nome = lerString.nextLine();
				
				controle= locadora.devolve(nome);
				
				if(controle == true)
					System.out.println("Filme devolvido com sucesso!!");
				else
					System.out.println("Erro!! o filme nao existe no banco de dados ou ainda nao foi alugado!!");
			}
		}
		lerString.close();
		lerInt.close();
	}
}
