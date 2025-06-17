package biblioteca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import cliente.Cliente;
import functionsaux.Auxiliar;
import livro.Livro;

public class Biblioteca {
	private ArrayList<Livro> livros = new ArrayList<Livro>();
	private ArrayList<Livro> livrosEmprestados = new ArrayList<Livro>();
	private static ArrayList<Cliente> clientes =  new ArrayList<Cliente>();
	
	public static void cadastrarCliente() {
		int Idade;
		String Nome;
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // define o formato esperado.
		System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
	    String dataStr = sc.nextLine();
	    LocalDate data = LocalDate.parse(dataStr, formatter); // tenta converter (parsear) a string para um objeto LocalDate, usando o formato definido pelo formatter
	    // Sim, LocalDate.parse() tem um formato padrão se você não passar um DateTimeFormatter.O formato padrão é o ISO 8601
   
	    Idade = Auxiliar.calcularIdade(data);
	    System.out.println("Qual é seu nome: ");
	    Nome = sc.nextLine();
	    
	    Cliente cliente = new Cliente(222, Nome, Idade);
	    clientes.add(cliente);
	    System.out.println("Cadastro realizado");
		
	}
	
	public void AdiconarLivro(Livro livro) {
		livros.add(livro);
	}
	
	public String emprestarLivro() {
		Cliente cliente = null;
		
		if(livrosEmprestados.size() == livros.size()) {
			return "Não temos livros para alugar no momento.";
		}
		
		if(clientes.size() < 1) {
			return "Não há clientes em nosso sistema, crie uma conta primeiro.";
		}		
		
		for (Livro livro : livros) {
			if(livro.Disponivel)
			System.out.println("ID: " + livro.Id + " Nome: " + livro.Titulo + " Autor: " + livro.Autor.Nome);
		}
		
		
		Livro livro = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		for (Cliente clienteFor : clientes) {
			if(clienteFor.getNome().equals(nome)) {
				cliente = clienteFor;
			}
		}
		
		if(cliente == null) {
			return "Cliente não encontrado no sistema";
		}
		
		System.out.println("Digite o ID do livro que quer pegar: ");
		int Id = sc.nextInt();
		
		for (Livro livroIt : livros) {
			if(livroIt.Id == Id) {
				livro = livroIt;
				livro.Disponivel = false;
				livro.DataAtualizacao = LocalDate.now().plusDays(7);
				livrosEmprestados.add(livro);
				cliente.setLivroPego(livro);
				return "Livro emprestado para " + nome.toUpperCase();
			}
		}
		return "ID inválido! Livro não encontrado.";
	}
	
	public void ListarLivros() {
		for (Livro livro : livros) {
			int contador = 0;
			if(livro.Disponivel) {
				System.out.println("ID: " + livro.Id +" - NOME: "+ livro.Titulo + " - AUTOR: " + livro.Autor.Nome.toUpperCase() + " - DISPONIVEL: SIM");
				contador++;
			}
			else {
				System.out.println("ID: " + contador +" - NOME: "+ livro.Titulo + " - AUTOR: " + livro.Autor.Nome.toUpperCase() + " - DISPONIVEL: NAO");
				contador++;
			}
		}
	
	}
}

/*Parse é tentar converter um dado (geralmente uma string) para outro tipo com base em regras / condições específica
 *(como um formato de data, número, etc).*/
